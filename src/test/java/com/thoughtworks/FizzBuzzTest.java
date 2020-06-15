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

    @Test
	public void should_return_Fizz_when_fizzBuzz_given_3() {
		//given
		int number=3;
		//when
		String word = FizzBuzz.fizzBuzz(number);
        //then
        assertEquals(word, "Fizz");
	}
	

}