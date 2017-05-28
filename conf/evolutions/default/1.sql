# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table groups (
  group_id                      bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_groups primary key (group_id)
);

create table projekt (
  group_id                      bigint auto_increment not null,
  projekt_name                  varchar(255),
  constraint pk_projekt primary key (group_id)
);

create table task (
  id                            bigint auto_increment not null,
  task_name                     varchar(255),
  user_id                       bigint,
  constraint pk_task primary key (id)
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

alter table task add constraint fk_task_user_id foreign key (user_id) references user (user_id) on delete restrict on update restrict;
create index ix_task_user_id on task (user_id);

alter table user_projekt add constraint fk_user_projekt_user foreign key (user_user_id) references user (user_id) on delete restrict on update restrict;
create index ix_user_projekt_user on user_projekt (user_user_id);

alter table user_projekt add constraint fk_user_projekt_projekt foreign key (projekt_group_id) references projekt (group_id) on delete restrict on update restrict;
create index ix_user_projekt_projekt on user_projekt (projekt_group_id);


# --- !Downs

alter table task drop foreign key fk_task_user_id;
drop index ix_task_user_id on task;

alter table user_projekt drop foreign key fk_user_projekt_user;
drop index ix_user_projekt_user on user_projekt;

alter table user_projekt drop foreign key fk_user_projekt_projekt;
drop index ix_user_projekt_projekt on user_projekt;

drop table if exists groups;

drop table if exists projekt;

drop table if exists task;

drop table if exists user;

drop table if exists user_projekt;

