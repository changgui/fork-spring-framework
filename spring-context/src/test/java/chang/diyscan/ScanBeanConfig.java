package chang.diyscan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 暂无描述
 *
 * @author guichang
 * @date 2021/5/1
 */

@Configuration
public class ScanBeanConfig {

	@Bean
	public ScanBean scanBean() {
		ScanBean bean = new ScanBean();
		bean.setName("我是ScanBean");
		return bean;
	}

}