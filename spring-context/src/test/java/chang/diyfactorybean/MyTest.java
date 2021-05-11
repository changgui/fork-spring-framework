package chang.diyfactorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * person测试
 *
 * @author guichang
 * @date 2021/4/15
 */

public class MyTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:chang/diyfactorybean.xml");
		// 此对象在 factoryBeanObjectCache 中存储
		FactoryBean myBeanDescrFactoryBean = context.getBean("&myBeanDescr", FactoryBean.class);
		System.out.println(myBeanDescrFactoryBean);
		MyFactoryBeanObject myBeanDescr = context.getBean("myBeanDescr", MyFactoryBeanObject.class);
		System.out.println(myBeanDescr);
	}

}