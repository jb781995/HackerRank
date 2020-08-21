package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagram_1 {
	public static List<Integer> stringAnagram(List<String> dictionary, List<String> query) {
        List<Integer> result = new ArrayList<Integer>(Collections.nCopies(query.size(), 0));
    for(int i=0;i<query.size();i++){
        char [] queryArr = query.get(i).toCharArray();
        int count = 0;
        for(int j=0;j<dictionary.size();j++){
            char [] dictionaryArr = dictionary.get(j).toCharArray();
            if(queryArr.length!=dictionaryArr.length)
              continue;
            Arrays.sort(queryArr);
            Arrays.sort(dictionaryArr);
            if(Arrays.equals(queryArr, dictionaryArr)) {
                count+=1;
                System.out.println(query.get(i)+" == "+dictionary.get(j));
            }
            result.set(i, count);

        }
    }
      return result;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<String> dictionary = new ArrayList<String>();
    List<String> query = new ArrayList<String>();
    
    dictionary.add("hack");
    dictionary.add("a");
    dictionary.add("rank");
    dictionary.add("khac");
    dictionary.add("ackh");
    dictionary.add("kran");
    dictionary.add("rankhacker");
    dictionary.add("a");
    dictionary.add("ab");
    dictionary.add("ba");
    dictionary.add("stairs");
    dictionary.add("raits");
    
    query.add("a");
    query.add("nark");
    query.add("bs");
    query.add("hack");
    query.add("stair");
    
//    List<Integer> result2 = new ArrayList<Integer>(Collections.nCopies(dictionary.size(), 0));
//    for(int j=0;j<dictionary.size();j++)
//    	result2.set(j, ++j);
//    for(int i=0;i<result2.size();i++)
//    	System.out.println(result2.get(i));
    
    List<Integer> result = stringAnagram(dictionary, query);
    for(int i=0;i<result.size();i++)
    	System.out.println(result.get(i));
    
    
	}

}
