package DuplicateEncoder;


/*
The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if that character appears only once in the original string, or ")" if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.

Examples

"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))(("
Notes

Assertion messages may be unclear about what they display in some languages. If you read "...It Should encode XXX", the "XXX" is the expected result, not the input!
 */

public class DuplicateEncoder {

    static String encode(String word){
        String result = "";

        char[] chars = word.toCharArray();
       for(int i = 0; i < chars.length; i++){
           chars[i] = Character.toLowerCase(chars[i]);
       }
        char currentchar;
        boolean doppelt;
        for(int i = 0; i < chars.length; i++){
          doppelt   = false;
            currentchar = chars[i];

            for(int j = 0; j < chars.length; j++){
                if(j == i){
                   continue;
                }
                if(chars[j] == currentchar){
                    doppelt = true;
                    break;
                }
            }
            if(doppelt){
                result += ")";

            }else
             result += "(";
        }

        return result;
    }
}
