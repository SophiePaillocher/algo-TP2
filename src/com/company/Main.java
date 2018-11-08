package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String word1 ="dance";
        String word2 = "apparence";
        Levenshtein test = new Levenshtein(word1,word2);
        test.distance();
        System.out.println(test.getLevenshtein());
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
