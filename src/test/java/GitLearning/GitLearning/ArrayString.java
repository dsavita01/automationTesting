package GitLearning.GitLearning;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] country= {"India", "USA", "CANADA", "CHINA", "india", "finland", "china"};
		
		//Remove the duplicates
		HashSet<String> hs= new HashSet<>();
		
		for(String c:country) {
			hs.add(c.toUpperCase());
		}
			System.out.println(hs);
			//Get the occurance 
			HashMap<String, Integer> hm=new HashMap<>();
			
			for(String c:country) {
				hm.put(c.toUpperCase(), hm.getOrDefault(c.toUpperCase(), 0)+ 1);
			}
			
			for(Map.Entry<String, Integer> entry:hm.entrySet()) {
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
	}

}
