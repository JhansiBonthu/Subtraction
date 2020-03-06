package com.sub.java;

public class SubNumbers {

	 public String supportSubFunctionality(int num1,int num2){
			try {
				
				int temp =  Math.subtractExact(num1, num2);
				return String.valueOf(temp);
				
			} catch (Exception e) {

				return e.getMessage();
			}

		}

}
