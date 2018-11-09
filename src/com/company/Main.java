package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Danemark", "Jordanie", "abondance", "danse", "blanc", "France", "Lancelot", "accoutumance", "incendie", "apparence", "Lambda", "Alaska", "conception", "docteur", "table", "ordianteur", "cookie", "lit");
        TrigramDictionary dico = new TrigramDictionary();
        dico.dictionary(words);
        System.out.println(dico.proximityTrigrams("dance",10));
    }

    /**
     * Lit le fichier fileName et retourne les mots contenus dans le fichier sous la forme d'une liste
     * @param fileName le fichier à lire
     * @return la liste des mots du fichier
     */

    static List<String> read (String fileName)
    {
        return null;
        // Path dicoPath = Paths.get("dico.txt");
        // List<String> lines = null;
        //            try {
        //                     lines = Files.readAllLines(dicoPath);
        //                     } catch (IOException e1) {
        //                     e1.printStackTrace();
        //                     }

    }

}
