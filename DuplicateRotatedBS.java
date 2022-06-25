package javalearn.java;

public class DuplicateRotatedBS {

	public static void main(String[] args) {
	
		int arr[]= {2,2,5,6,7,8,1,2,2};
		int target=2;
System.out.println(rbs(arr));
	}
//	static int search(int []arr,int target) {
//		int pivot=rbs(arr);
//		//if pivot not found ,array is not rotated
//		if(pivot==-1) {
//			//normal binary search
//			return binarysearch(arr,target,0,arr.length-1);
//		}
//		//if pivot found ,have 2 ase sorted array
//		if(arr[pivot]==target) {
//			return pivot;
//		}
//		if(target>=arr[0]) {
//			return binarysearch(arr,target,0,pivot-1);
//		}
//	else {
//			return binarysearch(arr,target,pivot+1,arr.length-1);
//		}
//		
//	}
//	static int binarysearch(int arr[],int target,int start,int end) {
//		
//		while(start<=end) {
//			int mid =start+(end-start)/2;
//			boolean asc=arr[start]<arr[end];
//		
//			if(asc) {
//				if(target<arr[mid]) {
//					end=mid-1;
//				}
//				if(target>arr[mid]) {
//					start=mid+1;
//				}
//			}
//			else {
//				if(target>arr[mid]) {
//				end=mid+1;
//			}
//			if(target<arr[mid]) {
//				start=mid-1;
//			}
//			else {
//			return mid;
//			}	
//		}
//		}
//		return -1;
//	}
	static int rbs(int arr[]) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if (mid<end&&arr[mid]>arr[mid+1]) {
				return mid;
			}
			if(start<mid&&arr[mid]<arr[mid-1]) {
				return mid-1;
			}
			//if start,mid,end equal to check
			if(arr[start]==arr[mid]&&arr[mid]==arr[end]) {
				//remove duplicate
				if(arr[start]>arr[start+1]) {
					return start;
				}
	         			start++;
				if(arr[end]<arr[end-1]) {
					return end;
				}
	         		end--;
			}
			else if(arr[start]<arr[mid]||arr[start]==arr[mid]&&arr[mid]>arr[end]) {
				 start=mid+1;
			}else {
				end=mid-1;
			}
		}
		return -1;
	}


}
