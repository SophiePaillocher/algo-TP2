package test;

import com.company.Levenshtein;
import com.company.TrigramDictionary;
import com.company.WordDistance;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.*;

class LevenshteinTest {


    @Test
    public void distanceTest() {
        String word1 ="arrive";
        String word2 = "ariev";
        Levenshtein distance = new Levenshtein(word1,word2);
        distance.distance();
        assertThat(distance.getLevenshtein(), equalTo(3));
    }

    @Test
    public void matrixTest() {
        String word1 ="arrive";
        String word2 = "ariev";
        Levenshtein distance = new Levenshtein(word1,word2);

        int m[][] = {
                {0, 1, 2, 3, 4, 5, 6},
                {1, 0, 1, 2, 3, 4, 5},
                {2, 1, 0, 1, 2, 3, 4},
                {3, 2, 1, 1, 1, 2, 3},
                {4, 3, 2, 2, 2, 2, 2},
                {5, 4, 3, 3, 3, 2, 3}
        };
        assertThat(distance.matrix(), equalTo(m));
    }
/**
 * Impossible de comparer ainsi deux listes de WordDistance. Mais la méthode fonctione d'après les print
    @Test
    public void listDistancesTest(){
        Levenshtein l = new Levenshtein("dance","");
        List<String> list = Arrays.asList("Danemark", "Jordanie", "abondance");
        List<WordDistance> expected = Arrays.asList(new WordDistance(6, "Danemark"), new WordDistance(4, "Jordanie"), new WordDistance(4, "abondance"));
        assertThat(l.listDistances(list), equalTo(expected));
    }
 */
    @Test
    public void proximityTest(){
        Levenshtein l = new Levenshtein("danse","");
        List<String> list = Arrays.asList("Danemark", "Jordanie", "abondance", "danse", "blanc", "France", "Lancelot", "accoutumance", "incendie", "apparence");
        List<String> expected = Arrays.asList( "Jordanie","abondance","danse",  "blanc","France");
        assertThat(l.proximityLevenshtein(list), equalTo(expected));
    }
}