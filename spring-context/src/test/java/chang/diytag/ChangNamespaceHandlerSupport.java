package chang.diytag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * 暂无描述
 *
 * @author guichang
 * @date 2021/4/18
 */

public class ChangNamespaceHandlerSupport extends NamespaceHandlerSupport {

	@Override
	public void init() {
		registerBeanDefinitionParser("chang", new ChangBeanDefinitionParser());
	}
}