package CountingDuplicates;

import java.util.ArrayList;
import java.util.List;


/*

Count the number of Duplicates

Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.

Example

"abcde" -> 0  # no characters repeats more than once
"aabbcde" -> 2  # 'a' and 'b'
"aabBcde" -> 2  # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1  # 'i' occurs six times
"Indivisibilities" -> 2  # 'i' occurs seven times and 's' occurs twice
"aA11" -> 2  # 'a' and '1'
"ABBA" -> 2  # 'A' and 'B' each occur twice
 */
public class CountingDuplicates {
    public static int duplicateCount(String text) {
        int result = 0;

        char[] chars = text.toCharArray();

        for(int i = 0; i < chars.length; i++){
            if(Character.isUpperCase(chars[i])){
                chars[i] = Character.toLowerCase(chars[i]);
            }
        }

        List<Character> list = new ArrayList<>();

        for(int i = 0; i < chars.length; i++){
            char c = chars[i];

            for(int j = i+1; j < chars.length; j++){
                if(chars[j] == c ){

                    if(!list.contains(chars[j])){
                        result++;
                    }
                    list.add(c);

                }
            }
        }

        return result;
    }
}
