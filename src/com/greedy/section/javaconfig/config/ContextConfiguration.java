package com.greedy.section.javaconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ContextConfiguration {
	
	@Bean
	public Product pigMeat() {
		return new Meat("돼지고기", "100g 10000원" , 30000);
		
	}
	
	@Bean
	public Product cowMeat() {
		return new Meat("소고기", "100g 20000원" , 60000);
	}
	
	@Bean 
	public Product lettuce() {
		return new Vegetable("상추", "한 바구니 2000원", 4000);
	}
	
	@Bean
	public Product cabbage() {
		return new Vegetable("배추", "한덩이에 5000원" , 10000);
	}
	
	@Bean
	public Product indianBop() {
		return new Snacks("인디언밥", "개당 2000원", 10000);
	}
	
	@Bean
	public Product homeRunBall() {
		return new Snacks("홈런볼" , "개당 1500원" , 3000);
	}
	
	@Bean
	@Scope("prototype")
	public ShoppingCart cart() {
		return new ShoppingCart();
	}
	

}
