package com.company;

import java.util.*;

/**
 * But : Obtenir la liste des mots bien orthographiés ayant le plus de trigrammes communs avec un mot mal orthographié donné
 */

public class TrigramDictionary implements{

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
                ArrayList<String> entry;
                if (trigramDictionary.containsKey(trigram))
                    entry = trigramDictionary.get(trigram);
                else entry = new ArrayList<>();
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
    public List<String> proximityTrigrams (String word, int numberMax){

        List<WordDistance> similarWords = new ArrayList<>();

        for (String trigram : trigram(word)){
            for (String similarWord : trigramDictionary.get(trigram)) {

            }
        }

        List<String> toReturn = new ArrayList<String>();

        int wordNumber = 0;
        for(int i = entry.getMaxValue(); i > 0; i-- ) {
            for (String word : entry) {
                if (entry.get(word) ==
            }

        }

        return toReturn;
    }a


}



