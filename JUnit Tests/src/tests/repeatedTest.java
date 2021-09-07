package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

class repeatedTest {
	@BeforeEach
    void beforeEach(RepetitionInfo repetitionInfo) {
        int currentRepetition = repetitionInfo.getCurrentRepetition();
        int totalRepetitions = repetitionInfo.getTotalRepetitions();
        System.out.println("Current repetition is "+currentRepetition+" of "+totalRepetitions);
       
    }

	@RepeatedTest(4)
	void repeatTest() {
		
	}

}
