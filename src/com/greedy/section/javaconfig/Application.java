package com.greedy.section.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.greedy.section.javaconfig.config.ContextConfiguration;
import com.greedy.section.javaconfig.config.Meat;
import com.greedy.section.javaconfig.config.Product;
import com.greedy.section.javaconfig.config.ShoppingCart;
import com.greedy.section.javaconfig.config.Snacks;
import com.greedy.section.javaconfig.config.Vegetable;


public class Application {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(ContextConfiguration.class);
		
    	String[] meatName = context.getBeanDefinitionNames();
		
		for(String string : meatName) {
			System.out.println(string);
		}
		System.out.println("=====================================");
		
		Meat cowMeats = context.getBean("cowMeat", Meat.class);
		Product pigMeats = context.getBean("pigMeat", Meat.class);
		ShoppingCart shopping = context.getBean("cart" , ShoppingCart.class);
		
		shopping.addItem(pigMeats);
		shopping.addItem(cowMeats);
		shopping.addItem(pigMeats);
		shopping.getItems();
		shopping.getSum();
		
		System.out.println("형통 : " + shopping.toString());
		System.out.println("=============================================");
		
		Vegetable lettuce = context.getBean("lettuce" , Vegetable.class);
		Vegetable cabbage = context.getBean("cabbage", Vegetable.class);
		ShoppingCart shopping1 = context.getBean("cart" , ShoppingCart.class);
		shopping1.addItem(lettuce);
		shopping1.addItem(cabbage);
		shopping1.getSum();
		shopping1.getItems();
		System.out.println("민영 : " + shopping1.toString());
		System.out.println("=============================================");
		Snacks homerun = context.getBean("homeRunBall", Snacks.class);
		Snacks indian = context.getBean("indianBop" ,Snacks.class);
		ShoppingCart shopping2 = context.getBean("cart" , ShoppingCart.class);
		shopping2.addItem(indian);
		shopping2.addItem(homerun);
		shopping2.getSum();
		shopping2.getItems();
		System.out.println("지환 : " + shopping2.toString());
		


	}

}
