package chang.diyconverter;

import org.springframework.core.convert.converter.Converter;

/**
 * 暂无描述
 *
 * @author guichang
 * @date 2021/4/23
 */

public class StudentConverter implements Converter<String, Student> {

	@Override
	public Student convert(String source) {
		// 222_chang转成Student
		String[] s = source.split("_");
		Student student = new Student();
		student.setId(Integer.parseInt(s[0]));
		student.setName(s[1]);
		return student;
	}
}