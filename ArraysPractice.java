package javalearn.java;

import java.util.Arrays;

public class ArraysPractice {

public static void main(String[] args) {

int [][]arr= {{2,4,6,8},
		    {12,24,13,16},
		    {6,67,5,4,44}
		};
    
System.out.println(maxval(arr));
}
static int maxval(int arr[][]) {
	int max=Integer.MIN_VALUE;
	for(int row=0;row<arr.length;row++) {
		for(int col=0;col<arr[row].length;col++) {
			if(arr[row][col]>max) {
				 max=arr[row][col];
			}
		}
	}
	return max;}




}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//find target value....
// int [][]arr= {
//		 {6,5,4,3},
//		 {2,3,4,5,6},
//		 {7,6,5,4}
// };
//	int target=4;
//	int val[]=check(arr,target);
//		System.out.println(Arrays.toString(val));
//} 
//static int[] check(int arr[][], int target) {
//	
//     for(int row=0;row<arr.length;row++) {
//    	 for(int col=0;col<arr[row].length;col++) {
//    		 if(target==arr[row][col]) {
//    			 return new int[]{row,col};
//    		 }
//    	 }
//     }	
//
//
//
//return new int[] {-1,-1};
//}
//}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//min value
	//	 int[] str= {4,12,5,26,9,8,10};
//	 
//	 int val=maxval(str);
//System.out.println("\n"+val);
//}	
//static int maxval(int[] str) {
//	int max=str[0];
//	for(int i=1;i<str.length;i++) {
//		if(max<str[i]) {
//		 max=str[i];
//		}
//		}return max;
//	}
//	





















//System.out.print(Arrays.toString(str.toCharArray()));





//	static boolean search(String arr,char target) {
//		if(arr.length()==0) {
//			return false;
//		} 
//	for(char ch:arr.toCharArray()) {
//		System.out.print(ch+" ");
//	//	System.out.println();
//		if(target==ch) {
//			
//			return true;
//		}
//	}	
////	for(int i=0;i<arr.length();i++) {
////		if(target==arr.charAt(i)) {
////			
////			return true;
////		}
////	}
//	return false;
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//     int arr[]= {12,34,13,35,-1,67,78,98};
//     int target=-13198 ;
//	boolean checkvalue=chack(arr,target);	
//	System.out.println(checkvalue);	
//	}
//	
//static boolean chack(int []arr,int target) {
//		
//		if(arr.length==0) {
//			return false;
//		}
//		for(int ind1=0;ind1<arr.length;ind1++) {
//			int value=arr[ind1];
//           if(value==target) {
//        	   return true;
//           }			
//		}
//		return false;
//	}
	
	
	
	
	
//	static int chack(int []arr,int target) {
//		
//		if(arr.length==0) {
//			return -1;
//		}
//		for(int ind1=0;ind1<arr.length;ind1++) {
//			int value=arr[ind1];
//           if(value==target) {
//        	   return ind1;
//           }			
//		}
//		return -1;
//	}
	
	
	
	
	
	
	
	
