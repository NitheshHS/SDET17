package parctice;

public class Print1to100 {

	public static void main(String[] args) {

		//String S1 = new String ("xyz");
		//String S2 = new String ("xyz");
		String S1="xyz";
		String S2="xyz";
		if(S1==S2)
		{
		System.out.println(S1 ==S2);
		}
		else {
		System.out.println("S1 is not equal to S2");
		}

	}
//Recursion
	public static void print1To100(int num) {//100,99,98
		/*
		 * terminate condition
		 * calling the same method
		 * return
		 */
		if(num>0) {
			print1To100(num-1);//99,98,97
			System.out.println(num);
		}
		return;
	}

}
