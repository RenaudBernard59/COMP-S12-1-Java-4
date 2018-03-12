/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice1;

/**
 *
 * @author renob
 */
import java.util.Scanner;

public class Exercice1 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = "";
       while(s.compareTo("ok") != 0) {
           System.out.println("Tapez quelques chose ou \"ok\" pour sortir.");
           s = sc.nextLine();
           System.out.println(s);
           }
    }
    
}
