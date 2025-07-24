package com.rays.javabasic;

import java.util.Arrays;

public class ThirdHighMethod {
	
	public static void main(String[] args) {
		//int arr[] = { 1, 43, 224, 66, 32, 323, 24, 35, 34, 3 };
		int arr[] = {3, 25, 645, 40, 212, 865, 10 };
		Arrays.sort(arr);
		for (int i = arr.length - 3; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
