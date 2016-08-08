package com.algo;

public class AcmIcpcTeam {

	public static void main(String[] args) {
		int n =4;
		int m =5;
		String topic[] = {"10101","11100","11010","00101"};
		int highestTopicsKnown = 0;
		int highestTopicTeamsCount =0;
		for (int i = 0; i < topic.length-1; i++) {
			for (int j = i+1; j < topic.length; j++) {
				int temp =  getMaxTopicsKnown(topic[i], topic[j]);
				if(temp>highestTopicsKnown){
					highestTopicTeamsCount=1;
					highestTopicsKnown=temp;
				}else if(temp == highestTopicsKnown){
					highestTopicTeamsCount++;
				}
			}
		}
		System.out.println(highestTopicsKnown);
		System.out.println(highestTopicTeamsCount);
	}
	
	static int getMaxTopicsKnown(String s1,String s2){
			int bitwiseOrCount=0;
			for (int i = 0; i < s1.length(); i++) {
			bitwiseOrCount	=bitwiseOrCount+(Character.getNumericValue(s1.charAt(i)) | Character.getNumericValue(s2.charAt(i)));
			}
			return bitwiseOrCount;
	}
}
