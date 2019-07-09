package com.atguigu.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
@Configuration
public class MySelfRule {
	@Bean
	public IRule myRule() {
		//return new RandomRule(); //Ribbo默认是轮询，自定义为随机
		//return new RoundRobinRule();
		return new RandomRule_ZY();
	}
}
