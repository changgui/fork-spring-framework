package chang.diyeditor;

import chang.MyClassPathXmlApplicationContext;

/**
 * person测试
 *
 * @author guichang
 * @date 2021/4/15
 */

public class AddressTest {

	public static void main(String[] args) {
		MyClassPathXmlApplicationContext context = new MyClassPathXmlApplicationContext("classpath:chang/diyeditor.xml");
		Customer customer = (Customer) context.getBean("customer");
		System.out.println(customer);
	}

}