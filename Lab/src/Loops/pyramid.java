package Loops;

import sun.lwawt.macosx.CSystemTray;

/**
 * @author Ni Yutong 倪钰彤
 * @version 1.0
 */
public class pyramid {

    public static void printPyramid(int n){


//        if(n>0){
//
//           // printPyramid(n-1);
//        // System.out.println(" ");
//
//        int j = 0 ;
//        while(j<n-1){
//            System.out.print(" ");
//            j++;
//        }
//
//        for(int i = n; i>0  ;i--){
//
//                System.out.print(n+" ");
//        }
//
//            System.out.println();
//
//            printPyramid(n-1);
//        }

       // public static void triangle(int n) {
            // makes the triangle up to row n
            // row n will be a total of n + n - 1 characters
            // e.g. 5 5 5 5 5 = 9 characters
            for(int i=1;i<=n;i++) {
                // make the initial spaces
                // it will be n-i
                for(int j=0;j<n-i;j++) {
                    System.out.print(" ");
                }
                // print the character i times with spaces
                for(int j=0;j<i;j++) {
                    System.out.print(i + " ");
                }
                // Add a new line
                System.out.println();
            }
       // }

//
//
//

//            int q = n;
//            for(int j = 1; j <= n;j++){
//
//                for(int i = 0;i<q-1;i++){
//                    System.out.print(" ");
//                }
//                for(int m = 0;m<j;m++){
//
//                    System.out.print(j+" ");
//                }
//                System.out.println();
//
//                q--;





       // }



    }
//    public static void printSpace(int n ){
//
//
//        for(int j = 0;j<)
//
//        System.out.println(" ");
//
//    }


    public static void main(String[] args) {
        printPyramid(20);
    }
}
