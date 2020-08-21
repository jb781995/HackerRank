package HackerRank;

public class AddBorder {
	public static String[] addBorder(String[] picture) {
String [] result = new String[picture.length+2];
int len = picture[0].length();

len+=2;
result[0]="";
result[result.length-1]="";
for(int i =0;i<len;i++) {
	result[0]+="*";
}
for(int i =0;i<len;i++) {
	result[result.length-1]+="*";
}

//System.out.println(result[0]+"      "+result[result.length-1]);

for(int i=1;i<=picture.length;i++) {
	result[i] = "*"+picture[i-1]+"*";
}
return result;
	}
	public static void main(String[] args) {
		String[] a = {"abc","def"};
		String[] res = addBorder(a);
		
		for(int i=0;i<res.length;i++)
			System.out.println(res[i]);

	}

}
