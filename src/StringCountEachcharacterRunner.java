import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

public class StringCountEachcharacterRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is a very good place " + "This is a wonderfulday";
		
		Map <Character, Integer> hashmap = new HashMap<Character, Integer>();
		
		char[] ch = str.toCharArray();
		
		for(char c : ch) {
			if(hashmap.containsKey(c)) {
				hashmap.put(c, hashmap.get(c) +1);
			} else {
				hashmap.put(c, 1);
			}
		}
		
		String []words = str.split(" ");
		Map <String, Integer> stringoccurances = new HashMap<String, Integer>();
		
		for(String word : words) {
			if(stringoccurances.containsKey(word)){
				stringoccurances.put(word, stringoccurances.get(word)+1);
			} else {
				stringoccurances.put(word, 1);
			}
		}
		
		
		
		
		
     // printing the hashmap
		System.out.println(hashmap);
		System.out.println(stringoccurances);
		
	    }

}
