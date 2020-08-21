package HackerRank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class BracketsCalculate {
public static boolean bracketsEven(String str) {
	
	int a=0, b=0,c=0,d=0;
	
		
		if(str.equals(""))
			return false;
		HashMap<String, Integer> geeks = new HashMap<String, Integer>();
		for(int j=0;j<str.length();j++) {
		if(str.charAt(j)==40) {
			if(geeks.containsKey("(")) {
				a = geeks.get("(");
				a++;
				geeks.put("(", a);
			}
			else
				geeks.put("(", 1);
		}
		else if(str.charAt(j)==41) {
			if(geeks.containsKey(")")) {
				b = geeks.get(")");
				b++;
				geeks.put(")", b);
			}
			else
				geeks.put(")", 1);
		}
		else if(str.charAt(j)==123) {
			if(geeks.containsKey("{")) {
				c = geeks.get("{");
				c++;
				geeks.put("{", c);
			}
			else
				geeks.put("{", 1);
		}
		if(str.charAt(j)==125) {
			if(geeks.containsKey("}")) {
				d = geeks.get("}");
				d++;
				geeks.put("}", d);
			}
			else
				geeks.put("}", 1);
		}
		}
		
		int forty=0,fortyOne=0,oneTwoThree=0, oneTwoFive = 0;
	Map.Entry<String, Integer> e = (Entry<String, Integer>) geeks.entrySet();
	
		for (Map.Entry<String,Integer> entry : geeks.entrySet()) {  
           if(entry.getKey().equals("(")) {
//        	   if(entry.getValue()!=null)
        	   forty = entry.getValue();
           }
           else if(entry.getKey().equals(")"))
        	   fortyOne = entry.getValue();
           else if(entry.getKey().equals("{")) 
        	   oneTwoThree = entry.getValue();
           else
        	   oneTwoFive = entry.getValue();
		}
		
		System.out.println("(: "+forty+", ): "+fortyOne+", {: "+oneTwoThree+", }: "+oneTwoFive);
	
	
	
	return (forty==fortyOne && oneTwoThree==oneTwoFive)?true:false;
}
	public static void main(String[] args) {
		String str = "{}(";
		System.out.println("status:  "+bracketsEven(str));
	}

}
