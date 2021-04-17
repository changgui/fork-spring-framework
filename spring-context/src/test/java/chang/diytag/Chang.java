package chang.diytag;

/**
 * 自定义标签属性存放类
 *
 * @author guichang
 * @date 2021/4/18
 */

public class Chang {

	private String id;
	private String name;
	private int age;

	@Override
	public String toString() {
		return "Chang{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}