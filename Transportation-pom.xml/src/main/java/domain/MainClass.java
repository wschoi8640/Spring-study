package domain;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
//		TransportationWalk transportationWalk = new TransportationWalk();
//		transportationWalk.move();
		
		GenericXmlApplicationContext applicationContext = 
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		TransportationWalk transportationWalk = applicationContext.getBean("tWalk", TransportationWalk.class);
		transportationWalk.move();
		
		applicationContext.close();
	}
	
}
