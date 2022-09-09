/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p.segitiganim;

/**
 *
 * @author ASUS
 */
public class jumlahnim {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int[] array = { 2, 1, 4, 1, 7, 6, 2, 1, 1, 0 };
        int sum = 0;
        // Advanced for loop
        for (int num : array) {
            sum = sum + num;
        }
        System.out.println("Jumlah Dari Semua Elemen Array Adalah:" + sum);
    }
}