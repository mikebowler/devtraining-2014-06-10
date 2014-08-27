package com.gargoylesoftware.training.phone.phone01;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class MyTest {
	@Test
	public void givenValidPhoneNumberParserReturnsValidAreaCode() {
		final String inputPhoneNumber = "905-123-4567";
		final String expectedAreaCode = "905";

//		final String actualAreaCode = callSomeRealCodeHere();
//		assertThat(actualAreaCode, equalTo(expectedAreaCode));
	}
}
