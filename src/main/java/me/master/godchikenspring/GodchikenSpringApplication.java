package me.master.godchikenspring;

import org.apache.catalina.connector.Connector;

import org.apache.coyote.http2.Http2Protocol;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GodchikenSpringApplication {

    @Bean
    public ServletWebServerFactory servletContainer() {
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
        tomcat.addAdditionalTomcatConnectors(createStandardConnector());
        tomcat.addConnectorCustomizers(connector -> connector.addUpgradeProtocol(new Http2Protocol()));
        return tomcat;
    }

    private Connector createStandardConnector() {
        Connector connector = new Connector("org.apache.coyote.http2.Http2Protocol");
        connector.setPort(8080);
        return connector;
    }

    public static void main(String[] args) {
        SpringApplication.run(GodchikenSpringApplication.class, args);
    }
}
