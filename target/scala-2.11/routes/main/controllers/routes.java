
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/andi/Desktop/relationManyToMany-2/conf/routes
// @DATE:Sun May 28 18:10:14 CEST 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserController UserController = new controllers.ReverseUserController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseLoginController LoginController = new controllers.ReverseLoginController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseProjektController ProjektController = new controllers.ReverseProjektController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseTaskController TaskController = new controllers.ReverseTaskController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserController UserController = new controllers.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseLoginController LoginController = new controllers.javascript.ReverseLoginController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseProjektController ProjektController = new controllers.javascript.ReverseProjektController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseTaskController TaskController = new controllers.javascript.ReverseTaskController(RoutesPrefix.byNamePrefix());
  }

}
