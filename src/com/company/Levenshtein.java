package com.company;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.min;

public class Levenshtein {
    int Levenshtein;
    String word1;
    String word2;

    public Levenshtein(String word1, String word2) {
        Levenshtein = 0;
        word1 = word1;
        word2 = word2;
    }

    /**
     * Méthode get
     * @return la distance de Levenshtein
     */
    public int getLevenshtein() {
        return Levenshtein;
    }


    /**
     * Crée le tableau des distances des préfixes
     * @return le tableau des distances
     */
    public List<List<Integer>> matrix (){
        List<List<Integer>> matrix = new ArrayList<>(word2.length());
        List<Integer> line = new ArrayList<>(word1.length());
        for (int indiceColonne = 0; indiceColonne<=word1.length();indiceColonne++) line.add(indiceColonne);
        matrix.add(line);
        for (int indiceLigne=1; indiceLigne<= word2.length(); indiceLigne++)
        {
            line.clear();
            line.add(indiceLigne);
            for (int indiceColonne = 1; indiceColonne <= word1.length(); indiceColonne++)
            {
                int up = matrix.get(indiceLigne - 1).get(indiceColonne);
                int left = matrix.get(indiceLigne).get(indiceColonne - 1);
                int diag = matrix.get(indiceLigne - 1).get(indiceColonne - 1);
                // condition si dernières lettres différentes ou non
                //si dernière lettre égale line.add(diag) sinon ...
                line.add(min(min(up,left),diag)+1);
            }
            matrix.add(line);
        }
        return matrix;
    }

    /**
     * Donne la distance d'édition en faisant appelle à la méthode matrix
     */
    public void distance(){

    }
}
