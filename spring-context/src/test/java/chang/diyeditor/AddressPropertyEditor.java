package chang.diyeditor;

import java.beans.PropertyEditorSupport;

/**
 * 自定义属性的编辑器
 *
 * @author guichang
 * @date 2021/4/18
 */

public class AddressPropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] s = text.split("_");
		Address address = new Address();
		address.setProvince(s[0]);
		address.setCity(s[1]);
		address.setTown(s[2]);
		this.setValue(address);
	}


}