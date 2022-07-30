package com.zjx.config;

import com.zjx.App;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleListener;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

public class Application {

    public static void run() throws Exception{
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(80);

        Context context = tomcat.addContext("/", App.class.getResource("/").getPath().replaceAll("%20", ""));

        context.addLifecycleListener((LifecycleListener) Class.forName(tomcat.getHost().getConfigClass()).newInstance());

        tomcat.start();
        tomcat.getServer().await();
        //

   /*     Tomcat tomcat = new Tomcat();
        tomcat.setPort(9876);

        tomcat.addWebapp("/", "d:\\z1\\");
        tomcat.start();
        tomcat.getServer().await();*/
    }

}
