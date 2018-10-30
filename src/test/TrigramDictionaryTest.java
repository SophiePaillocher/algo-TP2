package test;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
    }

    @Test
    public void testProximityWords(){}
}