package edu.csumb.cst438fa16qa.rest;

import edu.csumb.cst438fa16qa.QuestionsAnswers;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 * REST service that greets requests.
 *
 * This is a "root resource class" as explained in
 * https://jersey.java.net/documentation/latest/jaxrs-resources.html
 */
@Path("/")
public class QuestionsAnswersService {
    /*
    @GET
    @Path("/today")
    public String today() {
	return DayOfWeek.today();
    }
    */

    /*
    @GET
    @Path("/hello")
    public Response hello(@QueryParam("name") String name) {
        if (name == null || name.isEmpty()) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        } else {
            return Response.ok("hello " + name).build();
        }
    }
    */
    
    public static QuestionsAnswers questionsAnswers;
    
    public void instantiateQuestionsAnswers() {
        if (questionsAnswers == null) {
            questionsAnswers = new QuestionsAnswers();
            
            questionsAnswers.put("Who ate the cookies?", "Cookie Monster");
            questionsAnswers.put("Why does the sky appear blue?", "Rayleigh Scattering");
            questionsAnswers.put("What is Chad's favorite color?", "Black");
        }
    }

    
    @GET
    @Path("/randomquestion")
    public String randomquestion() {
        instantiateQuestionsAnswers();
        return questionsAnswers.getRandomQuestion();
    }
    
    @GET
    @Path("/testanswer")
    public Response testanswer(@QueryParam("question") String question,
                               @QueryParam("answer") String answer
                               ) {
        instantiateQuestionsAnswers();
        if (question == null || question.isEmpty() ||
            answer == null || question.isEmpty()
            ) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        else {
            return Response.ok(questionsAnswers.testAnswer(question, answer) ).build();
        }
    }
}