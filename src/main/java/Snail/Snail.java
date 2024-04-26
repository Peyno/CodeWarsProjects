package Snail;

/*

Given an n x n array, return the array elements arranged from outermost elements to the middle element, traveling clockwise.

array = [[1,2,3],
         [4,5,6],
         [7,8,9]]
snail(array) #=> [1,2,3,6,9,8,7,4,5]
For better understanding, please follow the numbers of the next array consecutively:

array = [[1,2,3],
         [8,9,4],
         [7,6,5]]
snail(array) #=> [1,2,3,4,5,6,7,8,9]
 */
public class Snail {



    public static int[] snail(int[][] array) {
        if(array.length == 1){
            int[] r = new int[1];
            r[0] = array[0][0];
            return r;
        }
        if(array == null){
            return null;
        }

        int[] result = new int[array.length* array.length];
        int index = 0;
        boolean lastline = false;
        boolean umrandet = false;




        int t = array.length;
        while(t >= 2) {

                if(umrandet){
                    ////
                    int[][] newarray = new int[array.length / 2][array.length / 2];
                    int i1 = 0;
                    int i2 = 0;

                    for(int a = 1; a < array.length-1; a++){
                        for(int b = 1; b < array.length-1; b++){
                            newarray[i1][i2] = array[a][b];
                            i1++;
                            i2++;
                        }
                    }
                    t = array.length / 2;
                    array = newarray;
                    /////
                }
            if(t == 1){
                result[index] = array[0][0];
                break;
            }
            for (int i = 0; i < array.length; i++) {
                if (i == 0) {
                    for (int j = 0; j < array.length; j++) {
                        result[index] = array[i][j];
                        index++;
                    }
                }
                if (i == array.length - 1) {
                    for (int j = array.length - 1; j >= 0; j--) {
                        result[index] = array[i][j];
                        index++;
                        lastline = true;
                    }
                }
                if (lastline == false && i > 0) {
                    result[index] = array[i][array.length - 1];
                    index++;
                }
                if (lastline) {
                    for (int k = 1; k < array.length - 1; k++) {
                        result[index] = array[i - k][0];
                        index++;
                    }
                    umrandet = true;

                }

            }

        }




        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]+"\t");
        }

        return result;
    }
}
