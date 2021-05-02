package chang.diytag;

import chang.diyioc.MyClassPathXmlApplicationContext;

/**
 * person测试
 *
 * @author guichang
 * @date 2021/4/15
 */

public class ChangTest {

	public static void main(String[] args) {
		MyClassPathXmlApplicationContext context = new MyClassPathXmlApplicationContext("classpath:chang/diytag.xml");
		Chang chang = (Chang) context.getBean("diyChang");
		System.out.println(chang);
	}

}