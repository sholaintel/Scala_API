// @GENERATOR:play-routes-compiler
// @SOURCE:/home/intelle/Desktop/qrios/conf/routes
// @DATE:Tue Jun 12 13:20:35 WAT 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseQController QController = new controllers.ReverseQController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseQController QController = new controllers.javascript.ReverseQController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
