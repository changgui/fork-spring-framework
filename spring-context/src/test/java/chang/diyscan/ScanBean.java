package chang.diyscan;

import org.springframework.beans.factory.InitializingBean;

/**
 * 暂无描述
 *
 * @author guichang
 * @date 2021/5/1
 */

public class ScanBean implements InitializingBean {

	private String name;

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("ScanBean==afterPropertiesSet");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}