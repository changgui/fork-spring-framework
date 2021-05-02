package chang.diyioc;

/**
 * person测试
 *
 * @author guichang
 * @date 2021/4/15
 */

public class PersonTest {

	public static void main(String[] args) {
		MyClassPathXmlApplicationContext context = new MyClassPathXmlApplicationContext("classpath:chang/person.xml");
		Person person = (Person) context.getBean("person1");
		System.out.println(person);
		System.out.println("中文测试");
	}

}