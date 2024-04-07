package CharacterCounter;

import java.util.ArrayList;
import java.util.List;

public class CharacterCounter {
    public static boolean validateWord(String word) {
        int highescount = 0;
        boolean firstround = true;
        List<Character> usedword = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {

            char c = Character.toLowerCase(word.charAt(i));
            if (usedword.contains(c)) {
                continue;
            }
            usedword.add(c);
            int counter = 0;
            for (int j = i + 1; j < word.length(); j++) {
                if (Character.toLowerCase(word.charAt(j)) == c)
                    counter++;
            }
            if (firstround) {
                highescount = counter;
                firstround = false;
            } else if (counter != highescount)
                return false;
        }
        return true;
    }
}
