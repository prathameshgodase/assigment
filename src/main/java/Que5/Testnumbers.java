package Que5;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testnumbers {
public static void main(String[] args) {

	ApplicationContext ctxobj=  new ClassPathXmlApplicationContext("ApplicationContent.xml");
	Numbers num= (Numbers) ctxobj.getBean("numbean1");
	
	List<Integer> numlist= num.numberlist;
	
	double max= numlist.stream().max((n1,n2)->n1>n2?1:-1).get();
	System.out.println( "Max number among list is "+ max);
	
}
}
