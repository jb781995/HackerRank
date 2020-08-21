package HackerRank;

public class Assessment1 {
	static int digitsManipulations(int n) {
	    String nStringified = Integer.toString(n);
	    int[] arr1= new int[nStringified.length()];
	    
	    int a =0;
	    int b=0;
	    
	    while(n>0){
	       a = n%10;
	       arr1[b] = a;
	       n = n/10;
	       b++;
	    }
	    
	    for(int j=0;j<arr1.length;j++)
	    	System.out.println(arr1[j]);
	    
	    long mul = 1;
	    long add = 0;
	    for(int i=0;i<arr1.length;i++){
	      mul*=arr1[i];
	      add+=arr1[i];
	    }
	      
	    return (int) (mul - add);

	}

	public static void main(String[] args) {
		System.out.println(digitsManipulations(1010));

	}

}
