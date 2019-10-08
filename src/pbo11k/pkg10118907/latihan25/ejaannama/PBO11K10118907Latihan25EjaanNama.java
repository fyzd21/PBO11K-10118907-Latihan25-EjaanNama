/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan mengeja nama
 * 
 */
public class PBO11K10118907Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Masukkan nama depan Anda untuk dieja : ");
        Scanner scanner = new Scanner(System.in);
        String nilai = scanner.next();
        
        System.out.println("Ejaan untuk "+nilai+" adalah");
        for(int i=0;i<nilai.length();i++) {
            /**
             * Taken and inspired from
             * https://stackoverflow.com/questions/11229986/get-string-character-by-index-java
             * Question from Bluefire - https://stackoverflow.com/users/1175276/bluefire
             * Solution from Ricardo Altamirano - https://stackoverflow.com/users/869912/ricardo-altamirano and Matthias Braun - https://stackoverflow.com/users/775954/matthias-braun
             */
            System.out.println("Huruf ke-"+(i+1)+" : "+nilai.charAt(i));
        }
    }
    
}
