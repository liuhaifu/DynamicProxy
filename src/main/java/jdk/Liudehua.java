package jdk;

/**
 * 刘德华实现star接口
 */
public class Liudehua implements Star {

	@Override
	public void sing(String song) {
		System.out.println("刘德华唱歌：" + song);
	}

	@Override
	public String dance(String dance) {
		System.out.println("刘德华跳舞：" + dance);
		return dance;
	}
}
