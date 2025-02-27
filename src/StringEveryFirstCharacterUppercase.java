
public class StringEveryFirstCharacterUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "low level design";
		String[] words = str.split(" ");
		
		
       StringBuilder sb = new StringBuilder();
       
       for(String word: words) {
    	  sb.append(Character.toTitleCase(word.charAt(0))).append(word.substring(1)).append(" ");
       }
       System.out.println(sb);

	}

}
