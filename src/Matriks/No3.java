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
public class No3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] A ={
            {1, 3, 1},
            {5, 8, 3}
        };
        int[][] B ={
            {1, 5},
            {6, 8},
            {4, 9}
        };
        if(A.length == B[0].length){
            int C[][] = new int[A.length][B[0].length];
            for(int i=0; i<A.length; i++){
                for(int j=0; j<B[0].length; j++){
                    for(int k=0; k<A[0].length; k++){
                        C[i][j] += A[i][k]*B[k][j];
                    }
                }
            }
            for(int[]c: C){
                for(int i:c){
                    System.out.print(i+"");
                }
                System.out.println();
            }
            
        }else {
            System.out.print("Ukuran Baris A Tidak Sama Dengan Kolom B");
        }
        System.out.println();
        System.out.println("Anggit Rief Irfandy");
        
    }
    
}
