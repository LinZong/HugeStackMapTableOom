package demo;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.lang.instrument.UnmodifiableClassException;

public class App {
	
	public static void main(String[] args) throws IOException {
		System.out.println("Please use Arthas 3.3.9 and enter command `trace demo.OomClass traceMe`");
		System.out.println("请使用Arthas 3.3.9 版本，输入命令 `trace demo.OomClass traceMe`");
		System.out.println("This command is copied to your clipboard for your convenience. ^_^");
		System.out.println("已经帮你把命令复制到了剪贴板啦! ^_^");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection("trace demo.OomClass traceMe"),null);
		// Trigger class to load.
		Class<OomClass> oomClazz = OomClass.class;
		System.in.read();
		System.out.println("Goodbye! >_<");
	}
}
