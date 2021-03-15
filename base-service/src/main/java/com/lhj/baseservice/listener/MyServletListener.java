package com.lhj.baseservice.listener;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@Slf4j
@WebListener("MyServletListener")
public class MyServletListener implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        log.info("---------------------------->ServletRequestListener请求销毁");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        log.info("---------------------------->ServletRequestListener请求创建");
    }
}
