package scope.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	// 기본적으로 getBean은 호출할때 마다 한번 생성된 객체를 불러옴
	// bean의 속성인 scope를 prototype으로 하면 getBean 할때마다 객체 생성
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		InjectionBean injectionBean = 
				ctx.getBean("injectionBean", InjectionBean.class);
		
		DependencyBean dependencyBean01 = 
				ctx.getBean("dependencyBean", DependencyBean.class);
		
		DependencyBean dependencyBean02 = 
				ctx.getBean("dependencyBean", DependencyBean.class);
		
		if(dependencyBean01.equals(dependencyBean02)) {
			System.out.println("dependencyBean01 == dependencyBean02");
		} else {
			System.out.println("dependencyBean01 != dependencyBean02");
		}
		
		
		ctx.close();
		
	}
	
}
