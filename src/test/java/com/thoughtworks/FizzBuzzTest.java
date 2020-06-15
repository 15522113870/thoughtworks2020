package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;



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
    @Test
	public void should_return_Buzz_when_fizzBuzz_given_5() {
		//given
		int number=5;
		//when
		String word = FizzBuzz.fizzBuzz(number);
        //then
        assertEquals(word, "Buzz");
	}

    @Test
	public void should_return_Whizz_when_fizzBuzz_given_7() {
		//given
		int number=7;
		//when
		String word = FizzBuzz.fizzBuzz(number);
		//then
		assertEquals("Whizz",word);
    }

    @Test
	public void should_return_FizzBuzz_when_fizzBuzz_given_15() {
		//given
		int number=15;
		//when
		String word = FizzBuzz.fizzBuzz(number);
		//then
		assertEquals("FizzBuzz",word);
    }

    @Test
	public void should_return_FizzWhizz_when_fizzBuzz_given_21() {
		//given
		int number=21;
		//when
		String word = FizzBuzz.fizzBuzz(number);
		//then
		assertEquals("FizzWhizz",word);
    }

    @Test
	public void should_return_BuzzWhizz_when_fizzBuzz_given_35() {
		//given
		int number=35;
		//when
		String word = FizzBuzz.fizzBuzz(number);
		//then
		assertEquals("BuzzWhizz",word);
    }

    @Test
	public void should_return_FizzBuzzWhizz_when_fizzBuzz_given_105() {
		//given
		int number=105;
		//when
		String word = FizzBuzz.fizzBuzz(number);
		//then
		assertEquals("FizzBuzzWhizz",word);
    }

    @Test
	public void should_return_Fizz_when_fizzBuzz_given_13() {
		//given
		int number=13;
		//when
		String word = FizzBuzz.fizzBuzz(number);
		//then
		assertEquals("Fizz",word);
    }
    @Test
	public void should_return_Fizz_when_fizzBuzz_given_30() {
		//given
		int number=30;
		//when
		String word = FizzBuzz.fizzBuzz(number);
		//then
		assertEquals("Fizz",word);
    }
}
