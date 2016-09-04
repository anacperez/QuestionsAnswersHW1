package edu.csumb.cst438fa16.AnaPerez;

import org.junit.Test;
import junit.framework.TestCase;

/**
 * Unit tests for simple QuestionsAnswers Class.
 * Author: Ana Perez
 * Date: Sept 3, 2016
 */
public class QuestionsAnswersTest extends TestCase
{
    @Test
    public void testRandomQuestion() {
    	QuestionsAnswers quesAns = new QuestionsAnswers();
    	quesAns.put("What's my favorite sport?", "soccer");
    	quesAns.put("What's my favorite video game?", "black osp 3");;
    	quesAns.put("What's my favorite programming language", "java");
    	assertNotNull(quesAns.getRandomQuestion());
    }
    
    @Test
    public void testAnswer() {
    	QuestionsAnswers quesAns = new QuestionsAnswers();
    	quesAns.put("What's my favorite band?", "Tegan and Sara");
    	assertTrue(quesAns.testAnswer("What's my favorite band?", "Tegan and Sara"));
    }
}
