package jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 刘德华的经纪人
 * 刘德华唱歌跳舞经纪人负责收钱
 * LiuPorxy是Liudehua的代理对象
 */
public class LiuPorxy implements InvocationHandler {

	//被代理的对象
	private Object object;

	public LiuPorxy(Object object) {
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		String name = method.getName();
		System.out.println("刘德华" + name + ",模拟经纪人收钱");
		return method.invoke(object,args);
	}
}
