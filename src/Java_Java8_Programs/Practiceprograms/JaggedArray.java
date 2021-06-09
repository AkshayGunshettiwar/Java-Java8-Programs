//An array having different size of column is called jagged array.

package Java_Java8_Programs.Practiceprograms;

public class JaggedArray {
    public static void main(String[] args) {

//        int a[]={1,2,3};
//        int b[]={4,2};
//        int c[]={1,6,9};

        //Instead

        int d[][]={
                {1,2,3},                      //jagged array
                {4,2},
                {1,6,9,5}
        };

        //SIMPLE FOR LOOP

//        for (int i=0; i<d.length; i++) {
//
//            for (int j = 0; j < d[i].length; j++) {
//                System.out.print(" " + d[i][j]);
//            }
//        System.out.println();

        //USING ENHANCED FOR LOOP
        for(int k[]: d){

            for (int l:k){

                System.out.print(" "+ l);
            }
            System.out.println();
        }
    }
}
