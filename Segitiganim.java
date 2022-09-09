/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package p.segitiganim;

/**
 *
 * @author ASUS
 */
public class Segitiganim {
//    public static void main(String args[]) {
//
//        int[] nim = { 2, 1, 4, 1, 7, 6, 2, 1, 1, 8 };
//        int x = 0, n = 5, i = 1;
//        while (i <= n) {
//        int j = n, k = 1;
//        while (j > i) {
//        System.out.print(" ");
//        j--;
//        }
//        while (k <= i) {
//            if (x > 9) {
//                System.out.print(" ");
//                    } else {
//                        System.out.print(nim[x] + " ");
//                        x = x + 1;
//                    }
//        k++;
//        }
//        System.out.println();
//        i++;
//        }
//    }
//}
    
public static void main(String[] args) {
    int nim[] = {2,1,4,1,7,6,2,1,1,0};
    int n = 0;
    int i = 0;
    do{
        int j = i;
        do{
            System.out.print(" ");
            j++;
        }while(j<nim.length);
        int k=0;
        do{
            System.out.print(nim[n]+" ");
            n++;
            k++;
        }while(k<=i);
        System.out.println();
        i++;
    }while(i<4);
    }
}