package javalearn.java;

import java.util.Arrays;

public class FindStart {

	public static void main(String[] args) {
		
	
			int arr[]= {5,7,7,7,7,8,8,8,8,10};
	        int target=8;
	        FindStart obj=new FindStart();
	       
	        System.out.println(Arrays.toString( obj.findstart(arr,target) ));
		}
		public int[] findstart(int arr[],int target) {
			int []ans= {-1,-1};
			// chaek for first occurence if target first
			int start=search(arr,target,true);
			int end=search(arr,target,false);
			ans[0]=start;
			ans[1]=end;
			return ans;
		}
		//this function just returns the  index value of target 
	static int search (int []arr,int target,boolean findStartIndex) {
		int ans=-1;
		int start=0;
		int end=arr.length;
		if(target>arr[arr.length-1]) {
			return -1;
		}
		
		while(start<=end ) {
			
			int mid=start+(end-start)/2;
		
			    if(target<arr[mid]){
					end=mid-1;
					}
			    else if( target>arr[mid]) {
					start=mid+1;
					}
				
				else{//potential ans found
					ans= mid;
					if (findStartIndex==true) {
						end=mid-1;
					}
					else if(findStartIndex==false){
						start=mid+1;
					}
				}
		
			
			}
		return ans;
		
		
	}
	}   


