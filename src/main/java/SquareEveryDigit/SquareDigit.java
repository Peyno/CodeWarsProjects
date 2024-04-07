package SquareEveryDigit;

public class SquareDigit {
    public int squareDigits(int n) {
        String resultstring = "";
            String s = Integer.toString(n);
            for(int i = 0; i < s.length(); i++){
                resultstring += (s.charAt(i) - '0') *(s.charAt(i) - '0') ;

            }
            return Integer.parseInt(resultstring);
    }

}
