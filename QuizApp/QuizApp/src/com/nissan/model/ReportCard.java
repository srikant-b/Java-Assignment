package com.nissan.model;

public class ReportCard {
	int question_No;
	String question;
	String correct_Answer;
	String your_Answer;
	int Scrore;
	public ReportCard(int question_No, String question, String correct_Answer,
			String your_Answer, int scrore) {
		super();
		this.question_No = question_No;
		this.question = question;
		this.correct_Answer = correct_Answer;
		this.your_Answer = your_Answer;
		Scrore = scrore;
	}
	public int getQuestion_No() {
		return question_No;
	}
	public void setQuestion_No(int question_No) {
		this.question_No = question_No;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getCorrect_Answer() {
		return correct_Answer;
	}
	public void setCorrect_Answer(String correct_Answer) {
		this.correct_Answer = correct_Answer;
	}
	public String getYour_Answer() {
		return your_Answer;
	}
	public void setYour_Answer(String your_Answer) {
		this.your_Answer = your_Answer;
	}
	public int getScrore() {
		return Scrore;
	}
	public void setScrore(int scrore) {
		Scrore = scrore;
	}
	@Override
	public String toString() {
		return "|question_No" + question_No + ":" + "Capital of"
				
				+ question +"|" + " |correct_Answer=" + correct_Answer + "|" +
				 " |your_Answer=" + your_Answer + "| Scrore=" + Scrore + "|";
	}
	
	
	

}
