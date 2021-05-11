package chang.diyfactorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * 自定义FactoryBean
 *
 * @author guichang
 * @date 2021/4/24
 */

public class MyFactoryBean implements FactoryBean<MyFactoryBeanObject> {

	@Override
	public MyFactoryBeanObject getObject() throws Exception {
		// 注意此MyFactoryBeanObject对象是不参与spring bean的生命周期的，即便是实现了BPP的接口也不会调用
		return new MyFactoryBeanObject();
	}

	@Override
	public Class<?> getObjectType() {
		return MyFactoryBeanObject.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}