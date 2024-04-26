package SpinWords;
/*

Write a function that takes in a string of one or more words, and returns the same string, but with all words that have five or more letters reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.

Examples:

"Hey fellow warriors"  --> "Hey wollef sroirraw"
"This is a test        --> "This is a test"
"This is another test" --> "This is rehtona test"
 */
public class SpinWords {
    public String spinWords(String sentence) {


       String[] words =  sentence.split(" ");

        for(int i = 0; i < words.length; i++){
           // System.out.println(words[i]);
            if(words[i].length() >= 5){
                char[] chars = words[i].toCharArray();
                String s = "";
                for(int j = chars.length-1; j >=0; j --){
                     s += chars[j];
                }
                words[i] =  s;
            }
        }
        String result = "";
        for(int i = 0; i < words.length; i++){
            if(i == words.length -1)
                result += words[i];
            else
                result += words[i] + " ";

        }


        return result;
    }
}
