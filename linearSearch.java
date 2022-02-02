package com.Govind;

public class linearSearch {
	public static void main(String[] args) {
		int arr[]= {2,5,8,6,7,10,25,26,28,19,20,14,18,26};
		int target=10;
		int ans=LS(arr,target);
		System.out.println("Given number present at index:" +ans);
	}
	
	static int LS(int[] arr,int target) {
		if(arr.length==0) {
			return -1;
		}
		for(int index=0;index<arr.length;index++) {
			if(arr[index]==target) {
				return index;
			}
		}
		return -1;
	}
}
