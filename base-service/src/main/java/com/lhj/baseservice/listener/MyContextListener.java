package com.lhj.baseservice.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener("MyContextListener")
public class MyContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("---------------------------->web应用服务启动");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("---------------------------->web应用服务销毁");
    }
}
