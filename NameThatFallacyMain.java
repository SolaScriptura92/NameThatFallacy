import java.util.Scanner;
import java.util.ArrayList;

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
		
		q1.setQuestion("John enjoys reading, hiking, writing, and mathematics.\n"
				+ "Peter also enjoys reading, hiking, and writing.\n"
				+ "Therefore, it is likely that Peter enjoys mathematics as well.\n");
		
		q1.setOption("a", "Slippery Slope");
		q1.setOption("b", "Weak Analogy");
		q1.setOption("c", "False Cause");
		q1.setOption("d", "Hasty Generalization");
		q1.setAnswer("b");
		
		myQuiz.add(q1);
		
		System.out.print("1. " + q1.getQuestion());
		q1.printOptions();
		System.out.print("Your answer: ");
		choice = scan.next();
		
		if(q1.isCorrect(choice))
		{
			correctAnswers++;
			System.out.println(":D\n\n");
		}
		
		else
		{
			System.out.println("\nSorry, that is not the correct answer. The correct answer is: \n");
			System.out.println(q1.getAnswer());
		}
		
	}

}
