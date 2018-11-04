package com.company;

import java.util.ArrayList;

public class Use {
    static public ArrayList<String> prefix (String word){
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i<word.length(); i++){
            list.add(word.substring(0,i));
        }
        return list;
    }
}
