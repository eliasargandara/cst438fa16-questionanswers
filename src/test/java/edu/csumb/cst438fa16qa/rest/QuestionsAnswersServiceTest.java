package edu.csumb.cst438fa16qa.rest;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

/**
 * See:
 * https://jersey.java.net/documentation/latest/test-framework.html
 * https://jersey.java.net/apidocs/latest/jersey/index.html
 */
public class QuestionsAnswersServiceTest extends JerseyTest {
    /*
    @Override
    protected Application configure() {
        return new ResourceConfig(HelloService.class);
    }

    @Test
    public void testTodayEndsWithDay() {
        WebTarget webTarget = target("today");                             // arrange
        String theday = webTarget.request().get(String.class);             // act
        assertThat(theday, endsWith("day"));                               // assert
    }

    @Test
    public void testHelloWithNonEmptyName() {
        WebTarget webTarget = target("hello").queryParam("name", "Alan");  // arrange
        String thehello = webTarget.request().get(String.class);           // act
        assertThat(thehello, equalTo("hello Alan"));                       // assert
    }

    @Test
    public void testHelloWithEmptyName() {
        WebTarget webTarget = target("hello").queryParam("name", "");      // arrange
        Response response = webTarget.request().get();                     // act
        assertThat(response.getStatus(),
                   equalTo(Response.Status.BAD_REQUEST.getStatusCode()));  // assert
    }

    @Test
    public void testHelloWithoutName() {
        WebTarget webTarget = target("hello");                             // arrange
        Response response = webTarget.request().get();                     // act
        assertThat(response.getStatus(),
                   equalTo(Response.Status.BAD_REQUEST.getStatusCode()));  // assert
    }
    */
}
