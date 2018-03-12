/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice2;

/**
 *
 * @author renob
 */
import java.util.Scanner;

public class Exercice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "Thomas Sanchez 16";
        Scanner sc = new Scanner(s);
        System.out.println(
                           "prenom : " + sc.next() +
                           ".\nnom : " + sc.next() +
                           ".\nage : " + sc.nextInt() +
                           "."
                           );
    }
    
}
