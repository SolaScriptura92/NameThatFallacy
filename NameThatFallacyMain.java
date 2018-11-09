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
		final int QUIZ_SIZE = 15; //This value not to exceed the size of the ArrayList containing the questions.
		
		String choice = "x";
		
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
		
		q6.setQuestion("Either you buy me a new set of makeup or you don't want me to look beautiful.\n"
				+ "I know you want me to look beautiful, therefore you will buy me a new set of makeup.\n");
		
		q6.setOption("a", "Hasty Generalization");
		q6.setOption("b", "Equivocation");
		q6.setOption("c", "False Dichotomy");
		q6.setOption("d", "Slippery Slope");
		q6.setAnswer("c");
		myQuiz.add(q6);
		
		q7.setQuestion("According to the sixth commandment, murder is contrary to the will of God.\n"
				+ "Therefore the mass shooting that occurred last week could not have possibly been in accordance with the will of God.\n");
		
		q7.setOption("a", "Composition");
		q7.setOption("b", "False Dichotomy");
		q7.setOption("c", "Amphiboly");
		q7.setOption("d", "Equivocation");
		q7.setAnswer("d");
		myQuiz.add(q7);
		
		q8.setQuestion("Pancho likes green enchiladas. He also likes butter pecan ice cream.\n"
				+ "Therefore, he would surely enjoy green enchiladas topped with butter pecan ice cream.\n");
		
		q8.setOption("a", "Equivocation");
		q8.setOption("b", "Suppressed Evidence");
		q8.setOption("c", "Composition");
		q8.setOption("d", "False Dichotomy");
		q8.setAnswer("c");
		myQuiz.add(q8);
		
		q9.setQuestion("Our school janitor Dave said that it is impossible to engineer a robot that performs his job duties.\n"
				+ "In view of Dave's mastery of the janitorial arts, we must conclude that it is indeed impossible to do so.\n");
		
		q9.setOption("a", "Appeal to Ignorance");
		q9.setOption("b", "Hasty Generalization");
		q9.setOption("c", "Slippery Slope");
		q9.setOption("d", "Appeal to Unqualified Authority");
		q9.setAnswer("d");
		myQuiz.add(q9);
		
		q10.setQuestion("The lax gun laws in our country have failed to prevent mass shootings.\n"
				+ "It's quite obvious that our government should ban citizens from possessing any firearms.\n");
		
		q10.setOption("a", "Straw Man");
		q10.setOption("b", "Slippery Slope");
		q10.setOption("c", "Missing the Point");
		q10.setOption("d", "Hasty Generalization");
		q10.setAnswer("c");
		myQuiz.add(q10);
		
		q11.setQuestion("If you go to a university, you will acquire a substantial amount of debt.\n"
				+ "Then your debt will continue to grow over time to the point where your credit score will be severely damaged.\n"
		        + "Then banks will refuse to lend you money and you will never be able to own a home.\n"
		        + "Therefore, you should not go to a university.\n");
		
		q11.setOption("a", "Slippery Slope");
		q11.setOption("b", "Red Herring");
		q11.setOption("c", "Equivocation");
		q11.setOption("d", "Weak Analogy");
		q11.setAnswer("a");
		myQuiz.add(q11);
		
		q12.setQuestion("Of course you want to study computer science at a university.\n"
				+ "Why, it is currently one of the most popular undergraduate majors in the U.S..\n");
		        
		q12.setOption("a", "Appeal to snobbery");
		q12.setOption("b", "Missing the Point");
		q12.setOption("c", "Appeal to the People");
		q12.setOption("d", "Slippery Slope");
		q12.setAnswer("c");
		myQuiz.add(q12);
		
		q13.setQuestion("People have been trying to prove the existence of aliens for many years, and no one has succeeded.\n"
				+ "Therefore, it is logical to conclude that they do not exist.\n");
		        
		q13.setOption("a", "Hasty Generalization");
		q13.setOption("b", "Appeal to the People");
		q13.setOption("c", "False Cause");
		q13.setOption("d", "Appeal to Ignorance");
		q13.setAnswer("d");
		myQuiz.add(q13);
		
		q14.setQuestion("It is the duty of police officers to uphold the law.\n"
				+ "Last night, officer Rodriguez's friend violated the law of non-contradiction in a debate the two of them were having.\n"
				+ "Therefore, officer Rodriguez should have given a citation to his friend last night.\n");
		        
		q14.setOption("a", "Suppressed Evidence");
		q14.setOption("b", "Equivocation");
		q14.setOption("c", "Hasty Generalization");
		q14.setOption("d", "Amphiboly");
		q14.setAnswer("d");
		myQuiz.add(q14);
		
		q15.setQuestion("Either you agree that there is no one religion that is objectively true and binding on all people,\n"
				+ "or you are a closed-minded bigot.\n");
		        
		q15.setOption("a", "Straw Man");
		q15.setOption("b", "Argumentum ad Hominem");
		q15.setOption("c", "False Dichotomy");
		q15.setOption("d", "Appeal to Force");
		q15.setAnswer("c");
		myQuiz.add(q15);
		
		q16.setQuestion("James said he is an honest and upright man who would never tell a lie.\n"
				+ "This being the case, we should accept his testimony in court as true.\n");
		        
		q16.setOption("a", "False Dichotomy");
		q16.setOption("b", "Appeal to Ignorance");
		q16.setOption("c", "Amphiboly");
		q16.setOption("d", "Begging the Question");
		q16.setAnswer("d");
		myQuiz.add(q16);
		
		Collections.shuffle(myQuiz);
		
		for(int i = 0; i < myQuiz.size() && i < QUIZ_SIZE; i++)
		{
			System.out.print("\n" + (i + 1) + ". \n" + myQuiz.get(i).getQuestion());
			myQuiz.get(i).printOptions();
			System.out.println("e) Quit\n");
			System.out.print("Your answer -> ");
			choice = scan.next();
			
			while(!choice.equalsIgnoreCase("a") && !choice.equalsIgnoreCase("b") && !choice.equalsIgnoreCase("c") && !choice.equalsIgnoreCase("d") && !choice.equalsIgnoreCase("e"))
			{
				System.out.println("\nOops! Looks like you entered an invalid option!");
				System.out.print("Please enter a valid option -> ");
				choice = scan.next();
			}
			
			if(choice.equals("e"))
			{
				break;
			}
			
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
