package com.company;

import java.util.*;

/**
 * But : Obtenir la liste des mots bien orthographiés ayant le plus de trigrammes communs avec un mot mal orthographié donné
 */

public class TrigramDictionary {

    Map<String, ArrayList<String>> trigramDictionary;

    // constructeur à partir d'un dictionnaire de trigrammes

    public TrigramDictionary(Map<String, ArrayList<String>> trigramDictionary) {
        this.trigramDictionary = trigramDictionary;
    }

    //constructeur initialisant un dictionnaire vide

    public TrigramDictionary(){
        this.trigramDictionary = new HashMap<String, ArrayList<String>>();
    }

    public Map<String, ArrayList<String>> get() {
        return trigramDictionary;
    }

    /**
     * Retourne la liste des trigrammes d'un mot
     * @param word le mot dont on cherche les trigrammes
     * @return la liste de ses trigrammes
     */

    // Si le mot fait moins de 3 lettres, retourner le mot tel quel ?

    static public List<String> trigram (String word)
    {
        List<String> list = new ArrayList<>();
        for (int i=0; i<word.length()-2; i++){
            list.add(word.toLowerCase().substring(i, i + 3));
        }
        return list;
    }

    /**
     * Remplit le dictionnaire de trigrammes à partir d'une liste de mots
     * @param words la liste de mots
     */

    public void dictionary (List<String> words)
    {
        trigramDictionary.clear();
        for (String word : words)
        {
            List<String> trigrams = trigram(word);
            for (String trigram : trigrams) {
                ArrayList<String> entry = new ArrayList<String>();
                if (trigramDictionary.containsKey(trigram)) entry = trigramDictionary.get(trigram);
                entry.add(word);
                trigramDictionary.put(trigram, entry);
            }
        }
    }


    /**
     * Retourner la liste des mots du dictionnaire ayant le plus de trigrammes en commun avec word
     * @param word
     * @param numberMax le nombre maximal de mots à retourner
     * @return
     */
    public List<String> proximityWords (String word, int numberMax){
      //  List<String> trigrams = trigram(word);
       // for (trigram : trigrams){
            // regarder les entrées associées à la clé trigram dans trigramDictionary
            // faire la liste entry des mots en entrée ?
            // compter les occurences de chaque mot de entry
       // }
        return null;}


}



