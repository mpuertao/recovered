package com.springframework.recovered;

import com.springframework.recovered.model.Recovered;
import com.springframework.recovered.repository.RecoveredRepository;
import com.springframework.recovered.service.RecoveredService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RecoveredServiceTests {

	@InjectMocks
	private RecoveredService recoveredService;

	@Mock
	private RecoveredRepository recoveredRepository;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void givenRecoveredServiceWhenQueriedWithAnIdThenGetExpectedRecovered() {
		Recovered recovered = new Recovered(50, "ana pulido", 25);
		Mockito.when(recoveredRepository.findById(50))
				.thenReturn(Optional.ofNullable(recovered));
		Recovered result = recoveredService.retrieveRecovered(50);
		Assert.assertEquals(recovered.getName().toLowerCase(), result.getName());
	}
}
