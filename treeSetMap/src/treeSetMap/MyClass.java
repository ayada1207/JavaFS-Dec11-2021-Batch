package treeSetMap;

import java.util.TreeMap;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		TreeMap<String, Integer> data = new TreeMap<String, Integer>();
		
		data.put("Hindi", 65);
		data.put("Physics", 89);
		data.put("Chemistry", 88);
		data.put("English", 77);
		data.put("Maths", 96);
		data.put("Java", 85);

		var subject = data.keySet().toArray();
		for(var s:subject) {
			System.out.println(s+":"+data.get(s));
		}
	
	}

}
