package com.gargoylesoftware.training.fizzbuzz;

import com.gargoylesoftware.training.fizzbuzz.fizzbuzz0.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class FizzBuzz0Test {
    @Test
    public void whenThreeThenReturnFizz() {
        assertThat( new FizzBuzz0().convert(3), is("Fizz") );
    }

    @Test
    public void whenMultipleOfThreeThenReturnFizz() {
        assertThat( new FizzBuzz0().convert(21), is("Fizz") );
    }

    @Test
    public void whenFiveThenReturnFizz() {
        assertThat( new FizzBuzz0().convert(5), is("Buzz") );
    }

    @Test
    public void whenMultipleOfFiveThenReturnFizz() {
        assertThat( new FizzBuzz0().convert(25), is("Buzz") );
    }

    @Test
    public void whenMultipleOfThreeAndFiveThenReturnFizzBuzz() {
        assertThat( new FizzBuzz0().convert(15), is("FizzBuzz") );
    }

    @Test
    public void whenAnyOtherNumberThenReturnThatNumber() {
        assertThat( new FizzBuzz0().convert(8), is("8") );
    }

    @Test
    public void whenZeroThenReturnZero() {
        assertThat( new FizzBuzz0().convert(0), is("0") );
    }
}
