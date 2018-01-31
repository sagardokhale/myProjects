package example;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class SpringApplication {
	static Logger logger=Logger.getLogger(SpringApplication.class.getName())	;
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("example/Beans.xml");
		
		HelloWorld object=(HelloWorld) context.getBean("helloworld");
		logger.error("bean is created");  
		System.out.println("Bean message is "+object.getMessage());
	}

}
