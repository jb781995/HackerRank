package HackerRank;

public class Blanagram {
	
	
	boolean checkBlanagrams2(String word1, String word2) {
        int[] map = new int[26];

        for(int i = 0; i < word1.length(); i++){
               map[word1.charAt(i)-'a']++;
               --map[word2.charAt(i)-'a'];
        }

       int str = 0;
      for(int i : map) {
              str += Math.abs(i);
     }
     return str ==2;
}
	public static void main(String[] args) {
		

	}

}
