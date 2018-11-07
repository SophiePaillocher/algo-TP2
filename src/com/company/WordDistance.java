package com.company;

import java.util.Comparator;

public class WordDistance implements Comparable<WordDistance> {
    int distance;
    String word;

    @Override
    public int compareTo(WordDistance wordDistance) {
        return Integer.compare(distance, wordDistance.distance);
    }

    public String getWord(){
        return word;
    }
}
