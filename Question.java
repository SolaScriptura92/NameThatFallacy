
public class Question 
{
	private String inquiry;
	private String answer;
	private String letterChoice;
	
	private String optionA = "a) ";
	private String optionB = "b) ";
	private String optionC = "c) ";
	private String optionD = "d) ";
	
	public void setQuestion(String question)
	{
		inquiry = question + "\n"; 
	}
	
	public String getQuestion()
	{
		return inquiry;
	}
	
	public void setOption(String letter, String option)
	{	
		letter.toLowerCase();
		
		if(letter == "a")
		{
			optionA += option;
		}
		
		else if(letter == "b")
		{
			optionB += option;
		}
		
		else if(letter == "c")
		{
			optionC += option;
		}
		
		else if(letter == "d")
		{
			optionD += option;
		}
	}
	
	public void printOptions()
	{
		System.out.println(optionA);
		System.out.println(optionB);
		System.out.println(optionC);
		System.out.println(optionD);
		System.out.println();
	}
	
	public void setAnswer(String ans)
	{
		letterChoice = ans.toLowerCase();
		
		if(letterChoice == "a")
		{
			answer = optionA;
		}
		
		else if(letterChoice == "b")
		{
			answer = optionB;
		}
		
		else if(letterChoice == "c")
		{
			answer = optionC;
		}
		
		else if(letterChoice == "d")
		{
			answer = optionD;
		}
	}
	
	public String getAnswer()
	{
		return answer;
	}
	
	public boolean isCorrect(String choice)
	{
		if(letterChoice.equals(choice))
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
}
