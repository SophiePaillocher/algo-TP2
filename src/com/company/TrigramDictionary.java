package com.company;

import java.util.*;

/**
 * But : Obtenir la liste des mots bien orthographiés ayant le plus de trigrammes communs avec un mot mal orthographié donné
 */

public class TrigramDictionary {

    Map<String, ArrayList<String>> trigramsDictionary;      // le dictionnaire de trigrammes

    // constructeur à partir d'un dictionnaire de trigrammes

    public TrigramDictionary(Map<String, ArrayList<String>> trigramsDictionary) {
        this.trigramsDictionary = trigramsDictionary;
    }

    //constructeur initialisant un dictionnaire vide

    public TrigramDictionary(){
        this.trigramsDictionary = new HashMap<String, ArrayList<String>>();
    }

    /**
     * Retourne la liste des trigrammes d'un mot
     * @param word le mot dont on cherche les trigrammes
     * @return la liste de ses trigrammes
     */

    static public List<String> trigram (String word)
    {
        List<String> list = new ArrayList<>();
        for (int i=0; i<word.length()-2; i++){
            list.add(word.substring(i, i + 3));
        }
        return list;
    }

    /**
     * Remplit le dictionnaire de trigrammes à partir d'une liste de mots
     * @param words la liste de mots
     */

    public void dictionary (List<String> words)
    {

    }

    /**
     * Retourner la liste des mots du dictionnaire ayant le plus de trigrammes en commun avec word
     * @param word
     * @return
     */
    public List<String> proximityWords (String word){return null;}
}



   // Path dicoPath = Paths.get("dico.txt");
   // List<String> lines = null;
    //            try {
   //                     lines = Files.readAllLines(dicoPath);
   //                     } catch (IOException e1) {
   //                     e1.printStackTrace();
   //                     }
