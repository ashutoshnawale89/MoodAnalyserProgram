package com.moodanalzrProgram;

public class MoodAnalyserProgram {
	String message;
	public MoodAnalyserProgram() {
		this.message=message;
	}
	public MoodAnalyserProgram(String message) {
		this.message=message;
	}
	 
	public String analyseMood(String message) throws MoodAnalysisException {
		this.message=message;
		return analyseMood();
	}
	public String analyseMood() throws MoodAnalysisException {
		try {
			if (message.contains("Sad")) {
				System.out.println("Sad");
				return "Sad";
			}
			else {
				System.out.println("Sad"); 
				return "Happy";
			}
		}
		catch (NullPointerException e) {
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,"Please enter Valid Emotion");
		}
	}
	
	public static void main(String[] args) throws MoodAnalysisException {
		MoodAnalyserProgram obj=new MoodAnalyserProgram();
        obj.analyseMood();
	}

}
