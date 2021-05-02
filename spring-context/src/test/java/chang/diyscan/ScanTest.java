package chang.diyscan;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author guichang
 * @date 2021/4/15
 */

public class ScanTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:chang/diyscan.xml");
		ScanBean scanBean = context.getBean("scanBean", ScanBean.class);
		System.out.println(scanBean.getName());
		context.close();
	}

}