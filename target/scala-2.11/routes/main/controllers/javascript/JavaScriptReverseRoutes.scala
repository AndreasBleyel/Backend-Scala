
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/andi/Desktop/relationManyToMany-2/conf/routes
// @DATE:Tue May 30 21:14:39 CEST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:61
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:61
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:34
  class ReverseCustomerController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerController.delete",
      """
        function(id0) {
        
          if (true) {
            return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "customer/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
          }
        
        }
      """
    )
  
    // @LINE:36
    def show: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerController.show",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "customer/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:37
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "customer"})
        }
      """
    )
  
    // @LINE:38
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerController.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatecustomer/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:41
    def newCustomer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerController.newCustomer",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addcustomer"})
        }
      """
    )
  
    // @LINE:34
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "customer"})
        }
      """
    )
  
    // @LINE:43
    def editCustomer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerController.editCustomer",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editcustomer/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.delete",
      """
        function(id0) {
        
          if (true) {
            return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "user/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
          }
        
        }
      """
    )
  
    // @LINE:13
    def show: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.show",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:14
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user"})
        }
      """
    )
  
    // @LINE:15
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateuser/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:20
    def editUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.editUser",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "edituser/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:12
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user"})
        }
      """
    )
  
    // @LINE:18
    def newUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.newUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adduser"})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "main"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:58
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.authenticate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:6
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.login",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + """"})
          }
        
        }
      """
    )
  
  }

  // @LINE:24
  class ReverseProjektController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjektController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteprojekt/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:26
    def show: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjektController.show",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "projekt/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:25
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjektController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "projekt"})
        }
      """
    )
  
    // @LINE:27
    def newProjekt: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjektController.newProjekt",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addprojekt"})
        }
      """
    )
  
    // @LINE:31
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjektController.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateprojekt/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:30
    def editProjekt: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjektController.editProjekt",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editprojekt/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:24
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjektController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "projekt"})
        }
      """
    )
  
  }

  // @LINE:47
  class ReverseTaskController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:51
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deletetask/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:50
    def show: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskController.show",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "task/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:48
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "task"})
        }
      """
    )
  
    // @LINE:54
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskController.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatetask/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:47
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "task"})
        }
      """
    )
  
    // @LINE:53
    def editTask: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskController.editTask",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "edittask/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:49
    def newTask: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskController.newTask",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addtask"})
        }
      """
    )
  
  }


}
