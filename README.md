# COMP-S12-1-Java-4

## Exemple 1: Lecture sur l'entrée standard
```Java
/*constructeur Scanner(InputStream source)
la variable in de la classe InputStream permet de lire le clavier:*/

public static final InputStream in;
import java.util.Scanner;
public class Essai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        while(s.compareTo("ok") != 0){
            s = sc.nextLine();
            System.out.println(s);
            }
    }
}
```

## Exemple 2: Découpage d'une chaîne de caractères en tokens
```Java
constructeur Scanner(String)
import java.util.Scanner;
    public class Essai {
        public static void main(String[] args) {
            String s = "Thomas Sanchez 16";
            Scanner sc = new Scanner(s);
            System.out.println("prenom : " + sc.next() + "\nnom : " + sc.next()
                                            + "\nage : " + sc.nextInt());
    }
}
```

## Exemple 3: Lecture dans un fichier
````Java
constructeur Scanner(File)
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Essai {
    public static void main(String[] args) {
        Scanner sc;
        try {
            sc = new Scanner(new File("essai.txt"));
            while(sc.hasNext())
            System.out.println(sc.nextLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
```