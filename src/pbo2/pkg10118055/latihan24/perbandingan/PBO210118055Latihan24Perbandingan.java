/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118055.latihan24.perbandingan;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PBO210118055Latihan24Perbandingan {
    public static int nilai1,nilai2,hasil;
    public static String ulang;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        System.out.println("========Program Perbandingan Nilai========");
         
         Scanner userInput = new Scanner(System.in);
         System.out.print("Masukkan nilai pertama:");
         nilai1 = userInput.nextInt();
         
         System.out.print("Masukkan nilai kedua:");
          nilai2 = userInput.nextInt();
          
         if (nilai1<=nilai2){
             System.out.println("Hasil :"+nilai1+"lebih besar dari"+nilai2);
         }
         else if(nilai1>=nilai2) {
             System.out.println("Hasil :"+nilai2+"lebih kecil dari"+nilai1);
         }  
    
        System.out.println("ulangi aktifitas?(ya/tidak)"); 
          ulang = userInput.next();
          
          
          }
    }
    

