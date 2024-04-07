package Array.diff;

/*
Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.

        It should remove all values from list a, which are present in list b keeping their order.

        Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
        If a value is present in b, all of its occurrences must be removed from the other:

        Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
*/

import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static int[] arrayDiff(int[] a, int[] b) {
        System.out.println("START");
        int index;
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < a.length; i++){
            list.add(a[i]);
        }

       index = a.length;



        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < b.length; j++){
                if(a[i] == b[j])
                    index--;
            }
        }

        int[] result = new int[index];

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < b.length; j++){
                if(a[i] == b[j]){
                   // list.remove(a[i]);
                    for(int k = 0; k < list.size(); k++){
                        if(list.get(k) == a[i])
                            list.remove(k);
                    }
                }

            }
        }

        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }

        return result;
    }
}
