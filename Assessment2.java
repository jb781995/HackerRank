package HackerRank;

public class Assessment2 {
	static int binaryPatternMatching(String pattern, String s) {
		  int patternCtr = 0;   
		   char[] chArr = new char[pattern.length()];
		   
		   for(int i=0;i<pattern.length();i++){
		       chArr[i] = pattern.charAt(i);
		   }
		   
		   int patternLen = pattern.length();
		   
		    for(int i=0;i<s.length()-patternLen;i=i+patternLen){
		    	int start = i;
		        int end = i+patternLen;
		        System.out.println("starting index: "+start);
		        if(ifTrue(start, end, chArr, s, 0)) {
		        patternCtr++;
		        System.out.println("\nctr: "+patternCtr+"_________________________________");
		        }
		        
		    }
		    return patternCtr;

		}

		static boolean ifTrue(int start, int len, char[] chArr, String s, int c){
			boolean flag = false;
		    if(start == len) {
		    	
		    	flag = true;
		    	System.out.println(" ... start: "+start+"...end: "+len+"   flag: "+flag);
		        return flag;
		    }
		  
		    else if(chArr[c]==49 && (s.charAt(start)!=97 || s.charAt(start)!=101|| s.charAt(start)!=105|| s.charAt(start)!=111|| s.charAt(start)!=117|| s.charAt(start)!=121)){
		         System.out.println("IF------>"+chArr[start]+" = "+s.charAt(start)+" ... start: "+start+"...end: "+len);
		    	return ifTrue(++start, len, chArr, s, ++c);
		    }
		    else if(chArr[c]==48 && (s.charAt(start)==97 || s.charAt(start)==101|| s.charAt(start)==105|| s.charAt(start)==111|| s.charAt(start)==117|| s.charAt(start)==121)){
		    	System.out.println("ELSE IF------>"+chArr[start]+" =  "+s.charAt(start)+" ... start: "+start+"...end: "+len);
		    	return ifTrue(++start, len, chArr, s, ++c);
		    }
//		    else {
//		    	System.out.println("RETURN FALSE");
//		       
//		    }
		   
		    return flag;
		}

	public static void main(String[] args) {
		String[] pattern = {"0","1","0"};
		String s= "amazing";
		System.out.println(binaryPatternMatching("010",s));

	}

}
