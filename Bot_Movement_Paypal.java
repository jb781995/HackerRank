package HackerRank;

public class Bot_Movement_Paypal {
public static String canReachDestination(int x1, int y1, int x2, int y2) {
	int target = 0;
	boolean flag= false;
	int rise = y2-y1;
	int run = x2 -x1;
	System.out.println("rise/run=` "+rise+"/"+run);
	if(y2>x2) {
		flag = increment(x1, y1, x2);
		x1 = x2;
	}
	else {
		flag = increment(y1, x1, y2);
		y1 = y2;
	}
	int t1=0, t2=0, t3=0;
	if(flag && (x1 ==x2) ) {
	System.out.println("x1, x2: "+x1+", "+x2);
//	t1 = x1;
//	t2 = y2;
//	t3 = y2;
	}
	else {
		System.out.println("y1, y2: "+y1+", "+y2);
//		t1 = y1;
//		t2 = x1;
//		t3 = x2;
		
	}
	return "Yes";
}
public static boolean increment (int x, int y, int des) {
	while(true) {
		x+=y;
		if(x==des)
			return true;
		if(x>des)
			return false;
	}
} 
	public static void main(String[] args) {
		System.out.println(canReachDestination(1,1,5,2));

	}

}
