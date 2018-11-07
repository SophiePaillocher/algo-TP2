package com.company;

import java.util.Comparator;

public class WordDistance implements Comparator<WordDistance> {
    int distance;
    String word;

    public int compare(WordDistance w1, WordDistance w2){
        return Integer.compare(w1.distance,w2.distance);
    }
}
