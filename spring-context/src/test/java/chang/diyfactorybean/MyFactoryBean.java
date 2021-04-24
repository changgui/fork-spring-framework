package chang.diyfactorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * 自定义FactoryBean
 *
 * @author guichang
 * @date 2021/4/24
 */

public class MyFactoryBean implements FactoryBean<String> {

	@Override
	public String getObject() throws Exception {
		return new String("我就是自定义的FactoryBean");
	}

	@Override
	public Class<?> getObjectType() {
		return String.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}