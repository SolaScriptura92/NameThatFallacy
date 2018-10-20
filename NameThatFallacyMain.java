import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.math.BigDecimal;

public class NameThatFallacyMain 
{
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		int questionsAttempted = 0;
		int correctAnswers = 0;
		
		String choice;
		
		double percentage;
		
		ArrayList<Question> myQuiz = new ArrayList<>();
		
		Question q1 = new Question();
		Question q2 = new Question();
		Question q3 = new Question();
		Question q4 = new Question();
		Question q5 = new Question();
		Question q6 = new Question();
		Question q7 = new Question();
		Question q8 = new Question();
		Question q9 = new Question();
		Question q10 = new Question();
		Question q11 = new Question();
		Question q12 = new Question();
		Question q13 = new Question();
		Question q14 = new Question();
		Question q15 = new Question();
		Question q16 = new Question();
		Question q17 = new Question();
		Question q18 = new Question();
		Question q19 = new Question();
		Question q20 = new Question();
			
		q1.setQuestion("John enjoys reading, hiking, writing, and mathematics.\n"
				+ "Peter also enjoys reading, hiking, and writing.\n"
				+ "Therefore, it is likely that Peter enjoys mathematics as well.\n");
		
		q1.setOption("a", "Slippery Slope");
		q1.setOption("b", "Weak Analogy");
		q1.setOption("c", "False Cause");
		q1.setOption("d", "Hasty Generalization");
		q1.setAnswer("b");
		myQuiz.add(q1);
		
		q2.setQuestion("Charles argues that Christianity is the only religion that is true.\n"
				+ "However, Charles is poor, uneducated, and impatient.\n"
				+ "Clearly, then, his claim that Christianity is the only true religion is false.\n");
		
		q2.setOption("a", "Hasty Generalization");
		q2.setOption("b", "Straw Man");
		q2.setOption("c", "Argumentum ad Hominem");
		q2.setOption("d", "Slippery Slope");
		q2.setAnswer("c");
		myQuiz.add(q2);
		
		q3.setQuestion("The Bible teaches that Christian wives are to submit to their husbands.\n"
				+ "Jami is a Christian, therefore she should submit to her husband's desire for her to lie to her employer.\n");
		
		q3.setOption("a", "Accident");
		q3.setOption("b", "Appeal to Force");
		q3.setOption("c", "Missing the Point");
		q3.setOption("d", "Red Herring");
		q3.setAnswer("a");
		myQuiz.add(q3);
		
		q4.setQuestion("Theists argue that creationism or intelligent design should be taught in public schools.\n"
				+ "Obviously these theists would have us to eradicate the teaching of true science from our schools.\n"
				+ "But consider the wonderful contributions the evolution of science has made to our world!\n"
				+ "Do we really want our society to regress?\n"
				+ "Well then, it is clear that their proposal should be rejected.\n");
		
		q4.setOption("a", "Red Herring");
		q4.setOption("b", "Straw Man");
		q4.setOption("c", "Missing the Point");
		q4.setOption("d", "Argumentum ad Hominem");
		q4.setAnswer("b");
		myQuiz.add(q4);
		
		q5.setQuestion("Every time that I have failed an exam, I only slept 6 hours the night before the exam.\n"
				+ "Therefore, I should get at least 7 hours of sleep the night before an exam to ensure that I pass it.\n");
		
		q5.setOption("a", "Suppressed Evidence");
		q5.setOption("b", "Hasty Generalization");
		q5.setOption("c", "Slippery Slope");
		q5.setOption("d", "False Cause");
		q5.setAnswer("d");
		myQuiz.add(q5);
		
		Collections.shuffle(myQuiz);
		
		for(int i = 0; i < myQuiz.size(); i++)
		{
			System.out.print("\n" + (i + 1) + ". \n" + myQuiz.get(i).getQuestion());
			myQuiz.get(i).printOptions();
			System.out.print("Your answer -> ");
			choice = scan.next();
			
			//make sure you check for valid input in a while loop here.
			
			questionsAttempted++;
			
			if(myQuiz.get(i).isCorrect(choice))
			{
				correctAnswers++;
			}
			
			else
			{
				System.out.println("\nSorry, that is not the correct answer. The correct answer is: \n");
				System.out.println(myQuiz.get(i).getAnswer() + "\n");
			}
		}
		
		percentage = ((double)correctAnswers / questionsAttempted) * 100;
		
		BigDecimal rounded = new BigDecimal(Double.toString(percentage));
		rounded = rounded.setScale(2, BigDecimal.ROUND_HALF_EVEN);
		
		System.out.print("\nYour final score is: " + correctAnswers + "/" + questionsAttempted);
		System.out.println(" (" + rounded + "%)\n");
		
		if(percentage >= 90)
		{
			System.out.println("Great job! Aristotle would be proud! :D");
		}
		
		else if(percentage >= 80)
		{
			System.out.println("Good job! I know you can do better though! :)");
		}
		
		else if(percentage >= 70)
		{
			System.out.println("Well...you passed! :)");
		}
		
		else
		{
			System.out.println("You failed...but don't worry! Study hard and try again! :D");
		}	
	}

}
