package com.albertorosario.springboot_microservices.gatewayservice;

import com.albertorosario.springboot_microservices.gatewayservice.filters.ErrorFilter;
import com.albertorosario.springboot_microservices.gatewayservice.filters.PostFilter;
import com.albertorosario.springboot_microservices.gatewayservice.filters.PreFilter;
import com.albertorosario.springboot_microservices.gatewayservice.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class GatewayserviceApplication {

  public static void main(String[] args) {
    SpringApplication.run(GatewayserviceApplication.class, args);
  }

  @Bean
  public PreFilter preFilter() {
    return new PreFilter();
  }
  @Bean
  public PostFilter postFilter() {
    return new PostFilter();
  }
  @Bean
  public ErrorFilter errorFilter() {
    return new ErrorFilter();
  }
  @Bean
  public RouteFilter routeFilter() {
    return new RouteFilter();
  }

}
