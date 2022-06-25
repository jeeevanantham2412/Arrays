package javalearn.java;

public class MountainArray {

	public static void main(String[] args) {
		int arr[]= {2,4,5,7,8,6,3,1,0};
		
System.out.println(arr[mountain(arr)]);
	}
	static int mountain(int arr[]) {
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int mid=start+(end-start)/2;
			if(arr[mid]>arr[mid+1]) {
				end=mid;
			}
			else if(arr[mid]<arr[mid+1]) {
				start=mid+1;
			}
		}
		return start;
	}

}
