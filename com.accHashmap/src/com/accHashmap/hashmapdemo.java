package com.accHashmap;

import java.util.HashMap;
import java.util.Map;

public class hashmapdemo {
	public static void main(String[]arg) {
		LinkedHashMap<Integer,String>directory =new LinkedHashMap<>();
		directory.put(789,"ttt"); 
		directory .put(765, "iii");
		directory .put(122,"ram");
		for(Map.Entry ml:directory.entrySet()) {
			System.out.println(ml.getKey()+" "+ ml.getValue());
		}
		System.out.println(directory);
		}
	System.out.println("Keys:"+directory.KeySet());
	Syste
	/*directory.entrySet().stream()
	.sorted(directory.Entry.compairngByKey())
	.forEach(System.out.println);
	directory.remove(122);
	System.out.println(directory);
	directory.replace()
	*/
	
}
