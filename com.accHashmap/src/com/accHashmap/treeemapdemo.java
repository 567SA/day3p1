package com.accHashmap;
import java.util.*;
public class treeemapdemo {
	public static void main(String[]arg) {
TreeMap<Integer,String>map =new TreeMap<Integer,String>();
map.put(9,"ii");
map.put(6,"java");
map.put(7, "sql");
for(Map.Entry nl:map.entrySet()) {
	System.out.println(nl.getKey()+" "+nl.getValue());
}

}
