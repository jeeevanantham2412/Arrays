package javalearn.java;

public class FindMountainArray {

	public static void main(String[] args) {
	int arr[]= {2,3,4,6,8,4,3,2};
	int target=2;
	System.out.println(arr[search(arr,target)]);
	}
	static int search(int arr[],int target) {
		int peak=asending(arr);
		int firsttry=desending(arr,target,0,peak);
		if(firsttry!=-1) {
			return firsttry;
		}
		else
		return desending(arr,target,peak+1,arr.length);
	}
	static int asending(int arr[]) {
    int start=0;
    int end=arr.length-1;
    while(start<end) {
    	int mid =start+(end-start)/2;
    	if(arr[mid]>arr[mid+1]) {
    		end=mid;
    	}
    	if(arr[mid]<arr[mid+1]) {
    		start=mid+1;
    	}
    	
    	
    }
    return start;
	}
	static int desending(int arr[],int target,int start,int end) {
	   boolean asc=true;
	    while(start<end) {
	    	int mid =start+(end-start)/2;
	    //	if(target==arr[mid]) {
	    	
	    //	}
	    	if(asc){
	    	if(target<arr[mid]) {
	    		end=mid-1;
	    	}
	    	else if(target>arr[mid]) {
	    		start=mid+1;
	    	}return start;
	    }
	    	else if(!asc) {
	    		if(target>arr[mid]) {
	    			end=mid-1;
	    		}    		
	    		else if(target<arr[mid]) {
	    			start=mid+1;
	    		}return start;
	    	
	    		}
	    	}return -1;
	    }
}
