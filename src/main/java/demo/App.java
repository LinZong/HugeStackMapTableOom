package demo;

import java.io.IOException;
import java.lang.instrument.UnmodifiableClassException;

public class App {
	
	public static void main(String[] args) throws IOException {
		System.out.println("Please use Arthas 3.3.9 and enter command `trace demo.OomClass traceMe`");
		System.out.println("请使用Arthas 3.3.9 版本，输入命令 `trace demo.OomClass traceMe`");
		// Trigger class to load.
		Class<OomClass> oomClazz = OomClass.class;
		System.in.read();
		System.out.println("Goodbye! >_<");
	}
}
