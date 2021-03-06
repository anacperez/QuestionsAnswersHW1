package edu.csumb.cst438fa16.AnaPerez;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


/**
*	A half-secretive map of	questions to answers (at most one answer per question).
*	Gives out random questions (keys) from the map,	and
*	can	be	queried	to test	if a given	question maps to a given answer.
*/

public	class	QuestionsAnswers {

	private Map<String, String> quesAndAns = new HashMap<String, String>();
	/**
	* Maps question to answer.
	*/
	public QuestionsAnswers() {
		put("what is my favorite video game?", "call of duty");
		put("what is my favorite holiday?", "christmas");
		put("what color is the sky?", "blue");
		put("what is my favorite hobby?", "video games");
		put("what do I want to be when I grow up?", "fun");
	}
	public void put(String	question,	String	answer)	{
		if(!question.equals("") && !answer.equals(""))
			quesAndAns.put(question, answer);
	}

	/**
	* Queries if question maps to answer.
	*/
	public boolean	testAnswer(String	question,	String	answer)	{
		if(quesAndAns.containsKey(question) && quesAndAns.containsValue(answer)) {
			return true;
		}
		return false;
	}

	/**
	* Gives	out	a random question from the key set.
	*/
	public String getRandomQuestion()	{
		Random rand = new Random();
		int index = rand.nextInt(quesAndAns.size());
		ArrayList<String> keys = new ArrayList<String>(quesAndAns.keySet());
		return keys.get(index);
	}
}
