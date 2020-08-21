package HackerRank;

public class Altimetrik_Assessment2 {

	public static int findSmallestDivisor(String s, String t) {
	    int t_len = t.length();
	    int s_len = s.length();
	    
	    if(s_len%t_len==0) {
	    String one ="";
	    String two = "";
	    int i=0;
	    one=String.valueOf(t.charAt(i));
	    int u = 0;
	    int limit = (t_len/2)+1;
	    while(i<limit) {
	    	int j = one.length()*2;
	    	two = t.substring(one.length(),j);
	    	//System.out.println("one: "+ one+"-------- two: "+two);
	    	if(!(one.equals(two))) {
	    		one = one + two.substring(0,1);
	    		
	    	 i=one.length();
	    	 //System.out.println("not equals: so one: "+one+" & i: "+i);
	    	}
	    	else {
	    		u = one.length();
	    		break;
	    	}
	    }
      
	    if(u>0)
	    	return u;
	    else
	    	return -1;
	    }
	    else
	    	return -1;
    }
	public static void main(String[] args) {
		String a = "bcdbcdbcdbcd";
		String b = "bcdbcd";
		System.out.println("\n\nresult:   "+findSmallestDivisor(a,b));

	}

}
