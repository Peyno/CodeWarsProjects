package SquareEveryDigit;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SquareDigitTest {




        @Test
        public void test() {
            assertEquals(811181, new SquareDigit().squareDigits(9119));
            assertEquals(0, new SquareDigit().squareDigits(0));
        }
}