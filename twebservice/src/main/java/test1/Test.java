package test1;

import java.util.UUID;

public class Test {
	public static void  main(String[] str){
		String uuid = UUID.randomUUID().toString();
		UUID ui = UUID.randomUUID();
		System.out.println(uuid);
	}
}
