package com.moodanalzrProgram;

import java.util.Scanner;

public class MoodAnalyserProgram {
	public String mood() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mood");
		String mood=sc.next(); 
			return mood;
	}
	public static void main(String[] args) {
		MoodAnalyserProgram obj=new MoodAnalyserProgram();
		System.out.println(obj.mood());

	}

}
