package edu.csumb.cst438fa16.AnaPerez.rest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import edu.csumb.cst438fa16.AnaPerez.QuestionsAnswers;

@Path("/")
public class QuestionsAnswersService {
	@GET
	@Path("/randomquestion")
	public String randomQuestions() {
		QuestionsAnswers qa = new QuestionsAnswers();
		return qa.getRandomQuestion();
	}
	
	@GET
	@Path("/testanswer") 
	public Response testAnswer(@QueryParam("question") String question, @QueryParam("answer") String answer) {
		QuestionsAnswers qa = new QuestionsAnswers();
		if(answer == null || answer.isEmpty() || question == null || question.isEmpty()) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		else if(qa.testAnswer(question, answer)){
				return Response.ok("Correct!").build();
		}
		else{
			return Response.ok("Incorrect!").build();
		}
		
	}
	
	
	
}