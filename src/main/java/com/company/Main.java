package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		long start = System.nanoTime();
		List<String> words = read("src/dictionnaire.txt");
		TrigramDictionary t = new TrigramDictionary();
		t.dictionary(words);
		List<String> mistakes = read("src/mistakes.txt");
		for (String mistake : mistakes) {
			if (isNotInDictionary(mistake, words)) {
				Levenshtein l = new Levenshtein(mistake, null);
				List<String> correction = l.proximityLevenshtein(t.proximityTrigrams(mistake, 100));
				System.out.println(mistake + " : " + correction);
			}
		}
		long end = System.nanoTime();
		System.out.println("Temps d'exécution : " + (end - start) / 1000000000.0 + " sec");
	}

	/**
	 * Lit le fichier fileName et retourne les mots contenus dans le fichier sous la
	 * forme d'une liste
	 *
	 * @param filePath le fichier à lire
	 * @return la liste des mots du fichier
	 */

	static public List<String> read(String filePath) throws FileNotFoundException {
		File file = new File(filePath);
		Scanner scanner = new Scanner(file);
		List<String> words = new ArrayList<>();
		while (scanner.hasNextLine()) {
			words.add(scanner.nextLine());
		}
		scanner.close();
		return words;
	}

	static public boolean isNotInDictionary(String word, List<String> dictionary) {
		for (String w : dictionary) {
			if (word == w) {
				return false;
			}
		}
		return true;
	}

}
