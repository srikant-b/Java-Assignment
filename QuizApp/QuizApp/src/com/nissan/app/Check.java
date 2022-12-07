package com.nissan.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.nissan.lib.QuestionList;
import com.nissan.model.ReportCard;

public class Check {
	public static void main(String[] args) {
		HashMap<String, String> hashMap = QuestionList.hashSet();
		int question_No=0;
		String question="";
		String correct_Answer="";
		String your_Answer="";
		int score=0;
		int marks = 0;
		int noOfAnswer = 0;
		ReportCard reportCard=null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your FirstName");
		String name = scanner.next();
		System.out.println("Enter Your LastName");
		String lastname = scanner.next();
		List<ReportCard> list = new ArrayList<ReportCard>();

		while (noOfAnswer < 4) {
			for (HashMap.Entry<String, String> set : hashMap.entrySet()) {

				System.out.println("What is the capital of " + set.getKey() + "?");
				question_No++;
				question=set.getKey();
				correct_Answer=set.getValue();
				//System.out.println("Enter your Answer?");
				String answer = scanner.next();
				your_Answer=answer;
				if (set.getValue().toLowerCase().equals(answer.toLowerCase()))
				// Printing all elements of a Map
				{
					System.out.println("Correct Answer");
					marks = marks + 2;
					System.out.println("Your score is: +1");
					score=1;
					noOfAnswer++;
					if (noOfAnswer > 4) {
						break;
					}
				} else {
					System.out.println("Incorrect Answer");
					System.out.println("your score is 0");
					score=0;
					noOfAnswer++;
					if (noOfAnswer > 4) {
						break;
					}
				}
				reportCard = new ReportCard(question_No, question,
						correct_Answer, your_Answer, score);
				list.add(reportCard);
				
			}
		}
		while(true){
			
			System.out.println("Do u WANT YOUR REPORT CARD");
			System.out.println("press 1 for Yes :");
			System.out.println("press 2 for No");
			int x=scanner.nextInt();
			switch(x)
			{case 1:
System.out.println("-----------------------------------------------------------------------------------------------");		
System.out.println("---------------REPORT CARD---------------------------------------------------------------------");		

System.out.println(String.format("%-20s%20s%50s%40s%20s",
        "Ques No.", "Question", "Correct Answer",
        "Your Answer", "Score"));
System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");		
		for(ReportCard lis:list )
		{			
			System.out.println(	String.format("%-20s%20s%50s%40s%20s",
					lis.getQuestion_No(), lis.getQuestion(), lis.getCorrect_Answer(),
					lis.getYour_Answer(), lis.getScrore()));
		
		
		}
		break;
			case 2:
		System.out.println("DONE!!!!");
		break;
	}
		}
	}
}
