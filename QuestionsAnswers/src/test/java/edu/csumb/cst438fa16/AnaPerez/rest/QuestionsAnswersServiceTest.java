package edu.csumb.cst438fa16.AnaPerez.rest;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;


public class QuestionsAnswersServiceTest extends JerseyTest {

	@Override
	protected Application configure() {
		return new ResourceConfig(QuestionsAnswersService.class);
	}
	
	@Test
	public void testTestAnswerWithNonEmptyAnswer() {
		WebTarget webTarget = target("testanswer").queryParam("question", "what is my favorite video game?").queryParam("answer", "call of duty");
		String theanswer = webTarget.request().get(String.class);
		assertThat(theanswer, equalTo("Correct!"));
	}
	
	@Test
	public void testTestAnswerwithEmptyAnswerAndQuestion() {
		WebTarget webTarget = target("testanswer").queryParam("question", "").queryParam("answer", "");
		Response response = webTarget.request().get();
		assertThat(response.getStatus(), equalTo(Response.Status.BAD_REQUEST.getStatusCode()));
	}
	

}
