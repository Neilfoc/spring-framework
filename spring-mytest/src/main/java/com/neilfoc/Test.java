package com.neilfoc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 11105157
 * @Description
 * @Date 2021/2/20
 */
public class Test {
	public static void main(String[] args) {
		System.out.println("hah");
		AnnotationConfigApplicationContext context = new
				AnnotationConfigApplicationContext(JavaConfig.class);
		User user = (User)context.getBean("user");
		System.out.println(user.toString());
	}
}
