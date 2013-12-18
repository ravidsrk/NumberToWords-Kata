package com.ravidsrk.algorithms;

import org.junit.Test;

import com.ravidsrk.algorithms.NumbersToWords;

import static org.junit.Assert.*;

public class NumberToWordsTests {

	@Test
	public void setupTest() {
		assertEquals(true, true);
	}

	@Test
	public void convertsZero() {
		expectConversion(0, "zero");
	}

	@Test
	public void convertsSingleDigits() {
		expectConversion(1, "one");
		expectConversion(2, "two");
		expectConversion(3, "three");
		expectConversion(4, "four");
		expectConversion(5, "five");
		expectConversion(6, "six");
		expectConversion(7, "seven");
		expectConversion(8, "eight");
		expectConversion(9, "nine");
	}

	@Test
	public void convertsTenToNineteen() {
		expectConversion(10, "ten");
		expectConversion(11, "eleven");
		expectConversion(12, "twelve");
		expectConversion(13, "thirteen");
		expectConversion(14, "fourteen");
		expectConversion(15, "fifteen");
		expectConversion(16, "sixteen");
		expectConversion(17, "seventeen");
		expectConversion(18, "eighteen");
		expectConversion(19, "nineteen");
	}

	@Test
	public void convertsMultiplesOfTenUpToNinety() {
		expectConversion(20, "twenty");
		expectConversion(30, "thirty");
		expectConversion(40, "forty");
		expectConversion(50, "fifty");
		expectConversion(60, "sixty");
		expectConversion(70, "seventy");
		expectConversion(80, "eighty");
		expectConversion(90, "ninety");
	}

	@Test
	public void convertsArbitraryTwoDigitNumbers() {
		expectConversion(42, "forty-two");
		expectConversion(69, "sixty-nine");
	}

	@Test
	public void convertsHundreds() {
		expectConversion(100, "one hundred");
		expectConversion(300, "three hundred");
	}

	@Test
	public void convertsArbitraryThreeDigitNumbers() {
		expectConversion(123, "one hundred and twenty-three");
		expectConversion(360, "three hundred and sixty");
		expectConversion(501, "five hundred and one");
	}

	@Test
	public void convertsThousands() {
		expectConversion(4000, "four thousand");
		expectConversion(9000, "nine thousand");
	}

	@Test
	public void convertsArbitraryFourDigitNumbers() {
		expectConversion(1234, "one thousand two hundred and thirty-four");
		expectConversion(9600, "nine thousand six hundred");
		expectConversion(2050, "two thousand and fifty");
		expectConversion(7008, "seven thousand and eight");
	}

	@Test
	public void convertsArbitraryFiveAndSixDigitNumbers() {
		expectConversion(123456,
				"one hundred and twenty-three thousand four hundred and fifty-six");
		expectConversion(200003, "two hundred thousand and three");
		expectConversion(340000, "three hundred and forty thousand");
		expectConversion(400500, "four hundred thousand five hundred");
		expectConversion(600070, "six hundred thousand and seventy");
		expectConversion(800000, "eight hundred thousand");
		expectConversion(90000, "ninety thousand");
		expectConversion(10020, "ten thousand and twenty");
		expectConversion(12300, "twelve thousand three hundred");
	}

	@Test
	public void convertsArbitrarySevenEightAndNineDigitNumbers() {
		expectConversion(
				123456789,
				"one hundred and twenty-three million four hundred and fifty-six thousand seven hundred and eighty-nine");
		expectConversion(100000002, "one hundred million and two");
		expectConversion(345000067,
				"three hundred and forty-five million and sixty-seven");
		expectConversion(12300400,
				"twelve million three hundred thousand four hundred");
		expectConversion(5000000, "five million");
	}

	@Test(expected = IllegalArgumentException.class)
	public void rejectsNumbersOver999999999() {
		NumbersToWords.convert(1000000000);
	}

	private void expectConversion(final int number, final String expectedWords) {
		assertEquals(expectedWords, NumbersToWords.convert(number));
	}

}
