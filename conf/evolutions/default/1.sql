# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table customer (
  customer_id                   bigint auto_increment not null,
  firstname                     varchar(255),
  lastname                      varchar(255),
  email                         varchar(255),
  constraint pk_customer primary key (customer_id)
);

create table groups (
  group_id                      bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_groups primary key (group_id)
);

create table projekt (
  group_id                      bigint auto_increment not null,
  projekt_name                  varchar(255),
  customer_customer_id          bigint,
  constraint pk_projekt primary key (group_id)
);

create table task (
  task_id                       bigint auto_increment not null,
  task_name                     varchar(255),
  duration                      integer,
  user_user_id                  bigint,
  projekt_group_id              bigint,
  constraint pk_task primary key (task_id)
);

create table user (
  user_id                       bigint auto_increment not null,
  firstname                     varchar(255),
  lastname                      varchar(255),
  gender                        varchar(255),
  email                         varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (user_id)
);

create table user_projekt (
  user_user_id                  bigint not null,
  projekt_group_id              bigint not null,
  constraint pk_user_projekt primary key (user_user_id,projekt_group_id)
);

alter table projekt add constraint fk_projekt_customer_customer_id foreign key (customer_customer_id) references customer (customer_id) on delete restrict on update restrict;
create index ix_projekt_customer_customer_id on projekt (customer_customer_id);

alter table task add constraint fk_task_user_user_id foreign key (user_user_id) references user (user_id) on delete restrict on update restrict;
create index ix_task_user_user_id on task (user_user_id);

alter table task add constraint fk_task_projekt_group_id foreign key (projekt_group_id) references projekt (group_id) on delete restrict on update restrict;
create index ix_task_projekt_group_id on task (projekt_group_id);

alter table user_projekt add constraint fk_user_projekt_user foreign key (user_user_id) references user (user_id) on delete restrict on update restrict;
create index ix_user_projekt_user on user_projekt (user_user_id);

alter table user_projekt add constraint fk_user_projekt_projekt foreign key (projekt_group_id) references projekt (group_id) on delete restrict on update restrict;
create index ix_user_projekt_projekt on user_projekt (projekt_group_id);


# --- !Downs

alter table projekt drop foreign key fk_projekt_customer_customer_id;
drop index ix_projekt_customer_customer_id on projekt;

alter table task drop foreign key fk_task_user_user_id;
drop index ix_task_user_user_id on task;

alter table task drop foreign key fk_task_projekt_group_id;
drop index ix_task_projekt_group_id on task;

alter table user_projekt drop foreign key fk_user_projekt_user;
drop index ix_user_projekt_user on user_projekt;

alter table user_projekt drop foreign key fk_user_projekt_projekt;
drop index ix_user_projekt_projekt on user_projekt;

drop table if exists customer;

drop table if exists groups;

drop table if exists projekt;

drop table if exists task;

drop table if exists user;

drop table if exists user_projekt;

