package chang.diyproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class CalculatorProxy {

	public static <T> T getJdkProxy(T t) {
		ClassLoader loader = t.getClass().getClassLoader();
		Class<?>[] interfaces = t.getClass().getInterfaces();
		InvocationHandler h = (proxy, method, args) -> {
			// Object下的方法不代理
			if (method.getDeclaringClass() == java.lang.Object.class) {
				method.invoke(t, args);
			}
			try {
				System.out.println("jdk invoke执行前");
				Object result = method.invoke(t, args);
				System.out.println("jdk invoke执行后");
				return result;
			} catch (Exception ignored) {
				return null;
			}
		};
		return (T) Proxy.newProxyInstance(loader, interfaces, h);
	}

	public static <T> T getCglibProxy(T t) {
		//动态代理创建的class文件存储到本地
		//System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"d:\\code");
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(t.getClass());
		enhancer.setCallback((MethodInterceptor) (o, method, objects, methodProxy) -> {
			// Object下的方法不代理
			if (method.getDeclaringClass() == java.lang.Object.class) {
				return methodProxy.invokeSuper(o, objects);
			}
			System.out.println("cglib invoke执行前");
			Object invoke = methodProxy.invokeSuper(o, objects);
			System.out.println("cglib invoke执行后");
			return invoke;
		});
		//创建代理对象
		return (T) enhancer.create();
	}

	public static void main(String[] args) {
		System.out.println("========jdk代理========");
		//System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		Calculator jdkProxy = CalculatorProxy.getJdkProxy(new CalculatorImpl());
		System.out.println(jdkProxy.getClass());
		jdkProxy.add(1, 1);

		System.out.println("========cglib代理========");
		CalculatorImpl cglibProxy = CalculatorProxy.getCglibProxy(new CalculatorImpl());
		System.out.println(cglibProxy.getClass());
		cglibProxy.add(1, 1);

	}

}