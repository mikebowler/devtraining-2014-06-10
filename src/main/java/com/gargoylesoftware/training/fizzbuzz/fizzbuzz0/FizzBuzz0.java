package com.gargoylesoftware.training.fizzbuzz.fizzbuzz0;

public class FizzBuzz0 {
    public String convert(final int number) {
    	String result = null;
    	if( number == 0 ) {
    		result = "0";
    	}
    	else if( number % 15 == 0 ) {
    		result = "FizzBuzz";
    	}
    	else if( number % 3 == 0 ) {
    		result = "Fizz";
    	}
    	else if( number % 5 == 0 ) {
    		result = "Buzz";
    	}
    	else {
    		result = String.valueOf(number);
    	}
    	return result;
    }
}
