package com.example.demo.servlet;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import com.bstek.ureport.console.UReportServlet;
import javax.servlet.Servlet;
/**
 *  Ureport2 配置类
 * @author qiaolin
 * @version 2018年5月9日
 */

@ImportResource("classpath:ureport-console-context.xml")
@EnableAutoConfiguration
@Configuration
@ConditionalOnClass
@ComponentScan(basePackages = "com.example.demo")
public class UreportConfig {

    @Bean
    public ServletRegistrationBean<Servlet> buildUreportServlet(){
        return new ServletRegistrationBean<Servlet>(new UReportServlet(), "/ureport/*");
    }
}
