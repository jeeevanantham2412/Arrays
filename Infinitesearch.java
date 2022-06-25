/**
 * 
 */
package javalearn.java;

public class Infinitesearch {

	
	public static void main(String[] args) {
		int[]arr= {3,5,7,9,10,90,100,130,140,160,170,200,300,400,500,600,700,800};
		int target=100;
	System.out.println(infinitearray(arr,target));
	}
	static int infinitearray(int []arr,int target) {
		//initialised array
		int start=0;
		int end=1;
		//condition
		while(target>arr[end]) {
			int newStart=end+1;
			//double box
			//end=previous end+sizeofbox*2
			end=end+(end-start+1)*2;
			start=newStart;
			
		}
return binarysearch(arr,target,start,end);		
	}
static int binarysearch(int[]arr,int target,int start,int end) {
	     
	while(start<=end) {
		int mid=start+(end-start)/2;
		if(target<arr[mid]) {
			end=mid-1;
		}
		else if(target>arr[mid]){
			start=mid+1;
		}
		else {
		return	mid;
		}
	}
	return -1;
}
}
