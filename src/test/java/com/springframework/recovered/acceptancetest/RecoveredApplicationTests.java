package com.springframework.recovered.acceptancetest;

import com.springframework.recovered.unittest.controller.RecoveredController;
import com.springframework.recovered.unittest.model.Recovered;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;

@SuppressWarnings("ALL")
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RecoveredApplicationTests {

    @Autowired
    private RecoveredController recoveredController;

    @LocalServerPort
    private int port;

    @Test
    public void givenRecoveredApplicationWhenQueriedWithAnIdThenGetExpectedRecovered() {
        Recovered recovered = new Recovered(50, "Mauricio Puerta", 25);
        recoveredController.createRecovered(recovered);
        when().get(String.format("http://localhost:%S/recovered/50", port))
                .then()
                .statusCode(is(200))
                .body(containsString("Mauricio Puerta!".toLowerCase()));
    }
}
