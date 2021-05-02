package chang.diyobject;

import java.util.Map;
import java.util.Properties;

/**
 * 暂无描述
 *
 * @author guichang
 * @date 2021/4/29
 */

public class ObjectBean {

	private String name;
	// 能获取到所有的内置对象
	private Map<String, Object> maps;
	// 能获取到所有的环境变量
	private Properties props;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Object> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public ObjectBean() {
	}

	public ObjectBean(String name, Map<String, Object> maps, Properties props) {
		this.name = name;
		this.maps = maps;
		this.props = props;
	}
}