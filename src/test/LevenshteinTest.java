package test;

import com.company.Levenshtein;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.*;

class LevenshteinTest {
    String word1 ="arrive";
    String word2 = "ariev";
    Levenshtein distance = new Levenshtein(word1,word2);

    @Test
    public void distanceTest() {
        distance.distance();
        assertThat(distance.getLevenshtein(), equalTo(3));
    }

    @Test
    public void matrixTest() {
        List<List<Integer>> matrix = new ArrayList<>();
        List<Integer> line = new ArrayList<>();
        line.add(0); line.add(1); line.add(2); line.add(3); line.add(4); line.add(5); line.add(6);
        matrix.add(line);
        line.clear();
        line.add(1); line.add(0); line.add(1); line.add(2); line.add(3); line.add(4); line.add(5);
        matrix.add(line);
        line.clear();
        line.add(2); line.add(1); line.add(0); line.add(1); line.add(2); line.add(3); line.add(4);
        matrix.add(line);
        line.clear();
        line.add(3); line.add(2); line.add(1); line.add(1); line.add(1); line.add(2); line.add(3);
        matrix.add(line);
        line.clear();
        line.add(4); line.add(3); line.add(2); line.add(2); line.add(2); line.add(2); line.add(2);
        matrix.add(line);
        line.clear();
        line.add(5); line.add(4); line.add(3); line.add(3); line.add(3); line.add(2); line.add(3);
        matrix.add(line);
        assertThat(distance.matrix(), equalTo(matrix));
    }
}