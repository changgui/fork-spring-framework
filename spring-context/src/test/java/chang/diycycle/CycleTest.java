package chang.diycycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author guichang
 * @date 2021/4/15
 */

public class CycleTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:chang/diycycle.xml");
		A a = context.getBean("a", A.class);
		System.out.println("cycle: " + a);
		B b = context.getBean("b", B.class);
		System.out.println("cycle: " + b);
		a.getB();
		context.close();
	}

}