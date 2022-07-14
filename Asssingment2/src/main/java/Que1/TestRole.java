package Que1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRole {
public static void main(String[] args) {
	ApplicationContext ctxobj= new ClassPathXmlApplicationContext("ApplicationContent.xml");
	Role role= (Role) ctxobj.getBean("rolebean");
	role.show();		
}
}