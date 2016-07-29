package com.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class JavaStringCompare {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        String word = in.next();
        word = "                        ";
        word=word.trim();
        System.out.println(word.length());
        int k = in.nextInt();
        in.close();
        List<String> wordList = new ArrayList<>();
        int maxindex = word.length()-k;
        for(int i=0; i<=maxindex;i++){
        	wordList.add(word.substring(i,i+k));
        }
        System.out.println(wordList);
        Collections.sort(wordList);
        
        System.out.println(wordList.get(wordList.size()-1));
        System.out.println(wordList.get(0));
	}
}
