package javalearn.java;

public class CeilingSearch {

	public static void main(String[] args) {
		int arr[]= {2,6,12,13,24,35,46,56,76,87};
        int target=100;
        int ans=ceiling(arr,target);
        System.out.println(ans );
	}
	// celing search is less number grater target >=
//floor search is greter number less target
	static int ceiling(int arr[],int target) {
		int start=0;
		int end=arr.length;
		if(target>arr[arr.length-1]) {
			return -1;
		}
		
		while(start<=end) {
			
			int mid=start+(end-start)/2;
		
			    if(target<arr[mid]){
					end=mid-1;
					}
			    else if( target>arr[mid]) {
					start=mid+1;
					}
				
				else{
					return mid;
				}
		
			
			}
		return arr[start];
		
		
		
	}

}
