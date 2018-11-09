package test;


import com.company.TrigramDictionary;
import org.junit.Test;

import java.util.*;

import static com.company.TrigramDictionary.trigram;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class TrigramDictionaryTest {

    @Test
    public void testTrigram() {
        ArrayList<String> trigrams = new ArrayList<String>();
        trigrams.add("alg");
        trigrams.add("lgo");
        trigrams.add("gor");
        trigrams.add("ori");
        trigrams.add("rit");
        trigrams.add("ith");
        trigrams.add("thm");
        trigrams.add("hme");
        assertThat(trigram("algorithme"), equalTo(trigrams));
    }

    @Test
    public void testDictionary() {
        List<String> words = new ArrayList<String>();
        words.add("Chat");
        words.add("Java");
        words.add("Achat");
        ArrayList<String> entry1 = new ArrayList<String>();
        entry1.add("Chat");
        entry1.add("Achat");
        ArrayList<String> entry2 = new ArrayList<String>();
        entry2.add("Java");
        ArrayList<String> entry3 = new ArrayList<String>();
        entry3.add("Achat");
        Map<String, ArrayList<String>> dictionary = new HashMap<String, ArrayList<String>>();
        dictionary.put("cha",entry1);
        dictionary.put("hat",entry1);
        dictionary.put("jav", entry2);
        dictionary.put("ava",entry2);
        dictionary.put("ach",entry3);
        TrigramDictionary trigramDico = new TrigramDictionary();
        trigramDico.dictionary(words);
        assertThat(trigramDico.get(), equalTo(dictionary));
    }

    @Test
    public void testProximityTrigrams(){
        List<String> words = Arrays.asList("Danemark", "Jordanie", "abondance", "danse", "blanc", "France", "Lancelot", "accoutumance", "incendie", "apparence", "Lambda", "Alaska", "conception", "docteur", "table", "ordianteur", "cookie", "lit");
        TrigramDictionary dico = new TrigramDictionary();
        dico.dictionary(words);
        List<String> expected = Arrays.asList("Danemark", "Jordanie", "danse", "blanc", "France", "Lancelot", "accoutumance", "incendie", "apparence", "conception");
        assertThat(dico.proximityTrigrams("dance", 10), equalTo(expected));
    }
}