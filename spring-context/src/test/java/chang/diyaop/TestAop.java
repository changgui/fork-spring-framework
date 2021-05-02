package chang.diyaop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

    public static void main(String[] args) throws Exception {
        //saveGeneratedCGlibProxyFiles(System.getProperty("user.dir")+"/proxy");
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:chang/diyaop.xml");
        MyCalculator bean = ac.getBean(MyCalculator.class);
        bean.add(1,1);
        bean.sub(1,1);
    }

    //public static void saveGeneratedCGlibProxyFiles(String dir) throws Exception {
    //    Field field = System.class.getDeclaredField("props");
    //    field.setAccessible(true);
    //    Properties props = (Properties) field.get(null);
    //    System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, dir);//dir为保存文件路径
    //    props.put("net.sf.cglib.core.DebuggingClassWriter.traceEnabled", "true");
    //}
}
