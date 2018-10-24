package com.company;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * But : Obtenir la liste des mots bien orthographiés ayant le plus de trigrammes communs avec un mot mal orthographié donné
 */

public class TrigramDictionary {

    Map<String, ArrayList<String>> trigrams;

    // constructeur à partir d'un dictionnaire de trigrammes

    public TrigramDictionary(Map<String, ArrayList<String>> trigrams) {
        this.trigrams = trigrams;
    }

    //constructeur initialisant un dictionnaire vide

    public TrigramDictionary(){
        this.trigrams = new HashMap<String, ArrayList<String>>();
    }

    /**
     * Retourne la liste des trigrammes d'un mot
     * @param word le mot dont on cherche les trigrammes
     * @return la liste de ses trigrammes
     */

    static public List<String> trigram (String word)
    {
        return null;
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
