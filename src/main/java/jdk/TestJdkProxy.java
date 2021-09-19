package jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 测试类
 */
public class TestJdkProxy {
	public static void main(String[] args) {
		Liudehua liudehua = new Liudehua();
		LiuPorxy liuPorxy = new LiuPorxy(liudehua);
		Star star = (Star) Proxy.newProxyInstance(liudehua.getClass().getClassLoader(), liudehua.getClass().getInterfaces(),
				liuPorxy);
		star.sing("男人哭吧哭吧不是罪");
		star.dance("开心的马骝");
	}
}
