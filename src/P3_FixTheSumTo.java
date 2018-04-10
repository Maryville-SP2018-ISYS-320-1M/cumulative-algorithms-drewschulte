/*
	ISYS 320

	Name(s):drew schulte
	Date: april 8
*/

/*
3. What problems did you identify in the sumTo method below?


*/

public class P3_FixTheSumTo {

	public static void main(String[] args) {
		System.out.println(sumTo(5));
	}
	public static int sumTo(int n) { 
		 int sum = 0;
	    for (int i = 1; i <= n; i++) {
	        
	        sum += i;
	    }
		return sum;
	}
}

