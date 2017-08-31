import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dubbozk {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath*:spring/spring-context.xml" });
		context.start(); 
		System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟

	}

}
