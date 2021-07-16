package parctice;

public class CovertTitle {
	/*public static void main(String[] args) {


		String str="manoj singh bisht";
		String[] arr=str.split(" ");//["manoj","singh","bisht"]
		String word="";
		for(int i=0;i<arr.length;i++) {
			String str1=arr[i];
			for(int j=0;j<str1.length();j++) {
				if(j==0) {
					str1=str1.replace(str1.charAt(j), (char) (str1.charAt(j)-32));
				}
			}
			word=word+ str1+" ";
		}	
		System.out.println(word);

	}*/
	
	public static void main(String[] args) 
	{
		String s = "my name is shashi";
		 String[] arr = s.split(" ");
		 String res="";
		  for(String w: arr)
		  {
			  String first = w.substring(0,1);
			  //System.out.println(first);
			  String AfterFirst= w.substring(1);
			 // System.out.println(AfterFirst);
			  res= res+ first.toUpperCase() + AfterFirst+ " ";
		  }
		  System.out.println(res);
		 
		 
	}
	//3.141.59
	//4 beta
}
