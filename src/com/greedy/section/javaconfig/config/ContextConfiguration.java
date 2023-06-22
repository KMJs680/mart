package com.greedy.section.javaconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ContextConfiguration {
	
	@Bean
	public Product pigMeat() {
		return new Meat("�������", "100g 10000��" , 30000);
		
	}
	
	@Bean
	public Product cowMeat() {
		return new Meat("�Ұ��", "100g 20000��" , 60000);
	}
	
	@Bean 
	public Product lettuce() {
		return new Vegetable("����", "�� �ٱ��� 2000��", 4000);
	}
	
	@Bean
	public Product cabbage() {
		return new Vegetable("����", "�ѵ��̿� 5000��" , 10000);
	}
	
	@Bean
	public Product indianBop() {
		return new Snacks("�ε���", "���� 2000��", 10000);
	}
	
	@Bean
	public Product homeRunBall() {
		return new Snacks("Ȩ����" , "���� 1500��" , 3000);
	}
	
	@Bean
	@Scope("prototype")
	public ShoppingCart cart() {
		return new ShoppingCart();
	}
	

}
