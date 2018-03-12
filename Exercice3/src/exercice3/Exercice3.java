/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice3;

/**
 *
 * @author renob
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercice3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        try {
            sc = new Scanner(new File("essai.txt"));
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());}   
            } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            }
        
    }
    
}
