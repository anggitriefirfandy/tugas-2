/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriks;

/**
 *
 * @author anggit rief irfandy
 */
public class No1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matrix[][] = new int[3][3];
        matrix[0][0] = 34;
        matrix[0][1] = 56;
        matrix[0][2] = 41;
        matrix[1][0] = 45;
        matrix[1][1] = 36;
        matrix[1][2] = 37;
        matrix[2][0] = 51;
        matrix[2][1] = 32;
        matrix[2][2] = 46;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(matrix[1][0]);
                System.out.println();
        System.out.println("Anggit Rief Irfandy");
    }
}
