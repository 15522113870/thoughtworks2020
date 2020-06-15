package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;



public class FizzBuzzTest {
  
    @Test
	public void should_return_2_when_fizzBuzz_given_2() {
		//given
		int number=2;
		//when
		String word = FizzBuzz.fizzBuzz(number);
        //then
        assertEquals(word, "2");
	}


	

}
