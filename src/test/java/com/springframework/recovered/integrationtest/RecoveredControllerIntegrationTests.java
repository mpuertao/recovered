package com.springframework.recovered.integrationtest;


import com.springframework.recovered.unittest.controller.RecoveredController;
import com.springframework.recovered.unittest.model.Recovered;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SuppressWarnings("ALL")
@RunWith(SpringRunner.class)
@SpringBootTest
public class RecoveredControllerIntegrationTests {

    @Autowired
    private RecoveredController recoveredController;

    @Test
    public void givenRecoveredControllerWhenQueriedWithAnIdThenGetExpectedRecovered() {
        Recovered recovered = new Recovered(50, "Mauricio Puerta", 25);
        recoveredController.createRecovered(recovered);
        Recovered result = recoveredController.retrieveRecovered(50);
        Assert.assertEquals(recovered.getName().toLowerCase(), result.getName());
    }
}
