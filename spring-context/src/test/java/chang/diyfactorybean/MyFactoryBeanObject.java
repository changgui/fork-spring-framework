package chang.diyfactorybean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author guichang
 * @date 2021/4/24
 */

public class MyFactoryBeanObject implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyFactoryBeanObject---"+ beanName);
		return bean;
	}
}