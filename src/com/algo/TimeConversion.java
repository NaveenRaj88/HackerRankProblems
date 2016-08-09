package com.algo;

public class TimeConversion {

	public static void main(String[] args) {
		String time = "12:59:59AM";
		String amOrpm = time.substring(time.length()-2);
		String [] timeArray = time.replace(amOrpm, "").split(":");
		int startHours =new Integer(timeArray[0]);
		if(amOrpm.equals("PM") && startHours !=12){
			startHours+=12;
		}
		if(amOrpm.equals("AM") && new Integer(timeArray[0])==12){
			startHours=0;
		}
		if(startHours<10){
			System.out.print("0");
		}
		System.out.println(startHours+":"+timeArray[1]+":"+timeArray[2]);
	}
}
