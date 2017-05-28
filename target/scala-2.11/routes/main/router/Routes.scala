
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/andi/Desktop/relationManyToMany-2/conf/routes
// @DATE:Sun May 28 23:32:25 CEST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  LoginController_5: controllers.LoginController,
  // @LINE:8
  HomeController_0: controllers.HomeController,
  // @LINE:12
  UserController_1: controllers.UserController,
  // @LINE:24
  ProjektController_2: controllers.ProjektController,
  // @LINE:34
  TaskController_4: controllers.TaskController,
  // @LINE:45
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    LoginController_5: controllers.LoginController,
    // @LINE:8
    HomeController_0: controllers.HomeController,
    // @LINE:12
    UserController_1: controllers.UserController,
    // @LINE:24
    ProjektController_2: controllers.ProjektController,
    // @LINE:34
    TaskController_4: controllers.TaskController,
    // @LINE:45
    Assets_3: controllers.Assets
  ) = this(errorHandler, LoginController_5, HomeController_0, UserController_1, ProjektController_2, TaskController_4, Assets_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, LoginController_5, HomeController_0, UserController_1, ProjektController_2, TaskController_4, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.LoginController.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """main""", """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user""", """controllers.UserController.list()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/""" + "$" + """id<[^/]+>""", """controllers.UserController.show(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user""", """controllers.UserController.create()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/""" + "$" + """id<[^/]+>""", """controllers.UserController.update(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/""" + "$" + """id<[^/]+>""", """controllers.UserController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adduser""", """controllers.UserController.newUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteuser/""" + "$" + """id<[^/]+>""", """controllers.UserController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """edituser/""" + "$" + """id<[^/]+>""", """controllers.UserController.editUser(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projekt""", """controllers.ProjektController.list()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projekt""", """controllers.ProjektController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projekt/""" + "$" + """id<[^/]+>""", """controllers.ProjektController.show(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addprojekt""", """controllers.ProjektController.newProjekt()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteprojekt""", """controllers.ProjektController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """task""", """controllers.TaskController.list()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """task""", """controllers.TaskController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addtask""", """controllers.TaskController.newTask()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """task/""" + "$" + """id<[^/]+>""", """controllers.TaskController.show(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.authenticate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_LoginController_login0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_LoginController_login0_invoker = createInvoker(
    LoginController_5.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("main")))
  )
  private[this] lazy val controllers_HomeController_index1_invoker = createInvoker(
    HomeController_0.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """main"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_UserController_list2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_UserController_list2_invoker = createInvoker(
    UserController_1.list(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "list",
      Nil,
      "GET",
      """""",
      this.prefix + """user"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_UserController_show3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_show3_invoker = createInvoker(
    UserController_1.show(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "show",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """user/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_UserController_create4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_UserController_create4_invoker = createInvoker(
    UserController_1.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """user"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_UserController_update5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_update5_invoker = createInvoker(
    UserController_1.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "update",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """user/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_UserController_delete6_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_delete6_invoker = createInvoker(
    UserController_1.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """user/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_UserController_newUser7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adduser")))
  )
  private[this] lazy val controllers_UserController_newUser7_invoker = createInvoker(
    UserController_1.newUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "newUser",
      Nil,
      "GET",
      """""",
      this.prefix + """adduser"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_UserController_delete8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteuser/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_delete8_invoker = createInvoker(
    UserController_1.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """deleteuser/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_UserController_editUser9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("edituser/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_editUser9_invoker = createInvoker(
    UserController_1.editUser(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "editUser",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """edituser/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_ProjektController_list10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projekt")))
  )
  private[this] lazy val controllers_ProjektController_list10_invoker = createInvoker(
    ProjektController_2.list(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjektController",
      "list",
      Nil,
      "GET",
      """""",
      this.prefix + """projekt"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_ProjektController_create11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projekt")))
  )
  private[this] lazy val controllers_ProjektController_create11_invoker = createInvoker(
    ProjektController_2.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjektController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """projekt"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_ProjektController_show12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projekt/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjektController_show12_invoker = createInvoker(
    ProjektController_2.show(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjektController",
      "show",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """projekt/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_ProjektController_newProjekt13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addprojekt")))
  )
  private[this] lazy val controllers_ProjektController_newProjekt13_invoker = createInvoker(
    ProjektController_2.newProjekt(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjektController",
      "newProjekt",
      Nil,
      "GET",
      """""",
      this.prefix + """addprojekt"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_ProjektController_delete14_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteprojekt")))
  )
  private[this] lazy val controllers_ProjektController_delete14_invoker = createInvoker(
    ProjektController_2.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjektController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """deleteprojekt"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_TaskController_list15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("task")))
  )
  private[this] lazy val controllers_TaskController_list15_invoker = createInvoker(
    TaskController_4.list(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskController",
      "list",
      Nil,
      "GET",
      """""",
      this.prefix + """task"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_TaskController_create16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("task")))
  )
  private[this] lazy val controllers_TaskController_create16_invoker = createInvoker(
    TaskController_4.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """task"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_TaskController_newTask17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addtask")))
  )
  private[this] lazy val controllers_TaskController_newTask17_invoker = createInvoker(
    TaskController_4.newTask(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskController",
      "newTask",
      Nil,
      "GET",
      """""",
      this.prefix + """addtask"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_TaskController_show18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("task/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TaskController_show18_invoker = createInvoker(
    TaskController_4.show(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskController",
      "show",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """task/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_LoginController_login19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login19_invoker = createInvoker(
    LoginController_5.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_LoginController_authenticate20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_authenticate20_invoker = createInvoker(
    LoginController_5.authenticate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "authenticate",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_Assets_versioned21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned21_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_LoginController_login0_route(params) =>
      call { 
        controllers_LoginController_login0_invoker.call(LoginController_5.login())
      }
  
    // @LINE:8
    case controllers_HomeController_index1_route(params) =>
      call { 
        controllers_HomeController_index1_invoker.call(HomeController_0.index())
      }
  
    // @LINE:12
    case controllers_UserController_list2_route(params) =>
      call { 
        controllers_UserController_list2_invoker.call(UserController_1.list())
      }
  
    // @LINE:13
    case controllers_UserController_show3_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_show3_invoker.call(UserController_1.show(id))
      }
  
    // @LINE:14
    case controllers_UserController_create4_route(params) =>
      call { 
        controllers_UserController_create4_invoker.call(UserController_1.create())
      }
  
    // @LINE:15
    case controllers_UserController_update5_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_update5_invoker.call(UserController_1.update(id))
      }
  
    // @LINE:16
    case controllers_UserController_delete6_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_delete6_invoker.call(UserController_1.delete(id))
      }
  
    // @LINE:18
    case controllers_UserController_newUser7_route(params) =>
      call { 
        controllers_UserController_newUser7_invoker.call(UserController_1.newUser())
      }
  
    // @LINE:19
    case controllers_UserController_delete8_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_delete8_invoker.call(UserController_1.delete(id))
      }
  
    // @LINE:20
    case controllers_UserController_editUser9_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_editUser9_invoker.call(UserController_1.editUser(id))
      }
  
    // @LINE:24
    case controllers_ProjektController_list10_route(params) =>
      call { 
        controllers_ProjektController_list10_invoker.call(ProjektController_2.list())
      }
  
    // @LINE:25
    case controllers_ProjektController_create11_route(params) =>
      call { 
        controllers_ProjektController_create11_invoker.call(ProjektController_2.create())
      }
  
    // @LINE:26
    case controllers_ProjektController_show12_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProjektController_show12_invoker.call(ProjektController_2.show(id))
      }
  
    // @LINE:27
    case controllers_ProjektController_newProjekt13_route(params) =>
      call { 
        controllers_ProjektController_newProjekt13_invoker.call(ProjektController_2.newProjekt())
      }
  
    // @LINE:28
    case controllers_ProjektController_delete14_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_ProjektController_delete14_invoker.call(ProjektController_2.delete(id))
      }
  
    // @LINE:34
    case controllers_TaskController_list15_route(params) =>
      call { 
        controllers_TaskController_list15_invoker.call(TaskController_4.list())
      }
  
    // @LINE:35
    case controllers_TaskController_create16_route(params) =>
      call { 
        controllers_TaskController_create16_invoker.call(TaskController_4.create())
      }
  
    // @LINE:36
    case controllers_TaskController_newTask17_route(params) =>
      call { 
        controllers_TaskController_newTask17_invoker.call(TaskController_4.newTask())
      }
  
    // @LINE:37
    case controllers_TaskController_show18_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TaskController_show18_invoker.call(TaskController_4.show(id))
      }
  
    // @LINE:41
    case controllers_LoginController_login19_route(params) =>
      call { 
        controllers_LoginController_login19_invoker.call(LoginController_5.login())
      }
  
    // @LINE:42
    case controllers_LoginController_authenticate20_route(params) =>
      call { 
        controllers_LoginController_authenticate20_invoker.call(LoginController_5.authenticate())
      }
  
    // @LINE:45
    case controllers_Assets_versioned21_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned21_invoker.call(Assets_3.versioned(path, file))
      }
  }
}
