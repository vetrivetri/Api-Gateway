package com.api.gateway.api.gateway;

import com.api.gateway.api.gateway.config.KafkaConfiguration;
import com.api.gateway.api.gateway.filter.ZuulErrorFilter;
import com.api.gateway.api.gateway.filter.ZuulProxyPostFilter;
import com.api.gateway.api.gateway.filter.ZuulProxyPreFilter;
import com.api.gateway.api.gateway.filter.ZuulRouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@EnableAutoConfiguration
@Import(KafkaConfiguration.class)
@ComponentScan("com.api.gateway.*")
public class ApiGatewayApplication extends SpringBootServletInitializer {


	public static void main(String[] args) {

		SpringApplication.run(ApiGatewayApplication.class, args);
	}

	@Bean
	public ZuulProxyPreFilter preFilter() {
		return new ZuulProxyPreFilter();
	}
	@Bean
	public ZuulProxyPostFilter postFilter() {
		return new ZuulProxyPostFilter();
	}
	@Bean
	public ZuulErrorFilter errorFilter() {
		return new ZuulErrorFilter();
	}
	@Bean
	public ZuulRouteFilter routeFilter() {
		return new ZuulRouteFilter();
	}

}
