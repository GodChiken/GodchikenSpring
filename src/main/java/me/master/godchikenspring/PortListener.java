package me.master.godchikenspring;

import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.boot.web.servlet.context.ServletWebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 고정이나 랜덤하게 뜨는 Port를 애플리케이션 레벨에서 어떻게 활용할 것인가?
 * 레퍼런스의 추천되는 방식을 활용하여 구현해본다.
 * */

@Component
public class PortListener implements ApplicationListener<ServletWebServerInitializedEvent> {
    @Override
    public void onApplicationEvent(ServletWebServerInitializedEvent servletWebServerInitializedEvent) {
        ServletWebServerApplicationContext servletWebServerApplicationContext = servletWebServerInitializedEvent.getApplicationContext();
        System.out.println(servletWebServerApplicationContext.getWebServer().getPort());
    }
}
