package parctice;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LampHeight {

	public static void main(String[] args) {
		int[] arr= {1,3,2,5,8,10,7,8,15,13}	;

		LinkedHashSet<Integer> lampHeight=new LinkedHashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					lampHeight.add(arr[i]);
				}
			}
		}
		
		
		Iterator<Integer> itr = lampHeight.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}



}
