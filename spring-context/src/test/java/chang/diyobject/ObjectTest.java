package chang.diyobject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author guichang
 * @date 2021/4/15
 */

public class ObjectTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:chang/diyobject.xml");
		ObjectBean objectBean = context.getBean("objectBean", ObjectBean.class);
		context.close();
	}

}