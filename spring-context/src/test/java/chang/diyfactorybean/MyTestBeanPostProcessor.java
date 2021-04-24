package chang.diyfactorybean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 暂无描述
 *
 * @author guichang
 * @date 2021/4/24
 */

public class MyTestBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("====MyTestBeanPostProcessor: " + beanName + " bean: " + bean + "========");
		return bean;
	}
}