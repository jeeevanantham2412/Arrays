package javalearn.java;

public class BinarySesrch {

	public static void main(String[] args) {
 int []arr= {2,7,10,15,17,20,28,30,43,52,80};
	//int[]arr= {85,70,63,55,20,18,16,14,9,-6,-4};	
	 int target=100;
	 int ans=arraybinary(arr,target);
 System.out.println(ans	);
	}
	
	static int arraybinary(int []arr, int target) {   
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
		int mid=start+(end-start)/2;
		boolean asc=arr[start]<arr[end];
	
		if(asc) {
			 if(target>arr[mid]) {
				 start=	mid+1;
				 }
			
		   else if (target<arr[mid]) {
			   end=  mid-1;
			   }
		}
		
		if(!asc)
		  if(target>arr[mid]) {
				end =	mid-1;}
		   else if (target<arr[mid]) {
			   start=  mid+1;
			   }
		   else {
			   return mid;
		   }   
		   
	}
		return -1;
	}}


//static int arraybinary(int []arr, int target) {
//	int start=0;
//	int end=arr.length-1;
//	while(start<=end) {
//	int mid=start+(end-start)/2;
//	  if(target>arr[mid]) {
//			 start=	mid+1;
//			 System.out.print(start+" ");}
//		
//	   else if (target<arr[mid]) {
//		   end=  mid-1;
//		   System.out.print(end);}
//	   
//	   else {
//		   return  mid;
//		   }   
//}
//	return -1;
//}}