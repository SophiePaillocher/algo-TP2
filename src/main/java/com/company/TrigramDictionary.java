package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * But : Obtenir la liste des mots bien orthographiés ayant le plus de
 * trigrammes communs avec un mot mal orthographié donné
 */

public class TrigramDictionary {

	Map<String, ArrayList<String>> trigramDictionary;

	// constructeur à partir d'un dictionnaire de trigrammes

	public TrigramDictionary(Map<String, ArrayList<String>> trigramDictionary) {
		this.trigramDictionary = trigramDictionary;
	}

	// constructeur initialisant un dictionnaire vide

	public TrigramDictionary() {
		this.trigramDictionary = new HashMap<>();
	}

	public Map<String, ArrayList<String>> get() {
		return trigramDictionary;
	}

	/**
	 * Retourne la liste des trigrammes d'un mot
	 *
	 * @param word le mot dont on cherche les trigrammes
	 * @return la liste de ses trigrammes
	 */

	// Si le mot fait moins de 3 lettres, retourner le mot tel quel ?

	static public List<String> trigram(String word) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < (word.length() - 2); i++) {
			list.add(word.substring(i, i + 3));
		}
		return list;
	}

	/**
	 * Remplit le dictionnaire de trigrammes à partir d'une liste de mots
	 *
	 * @param words la liste de mots
	 */

	public void dictionary(List<String> words) {
		trigramDictionary.clear();
		for (String word : words) {
			word = "<" + word + ">";
			List<String> trigrams = trigram(word);
			for (String trigram : trigrams) {
				ArrayList<String> entry;
				if (trigramDictionary.containsKey(trigram)) {
					entry = trigramDictionary.get(trigram);
				} else {
					entry = new ArrayList<>();
				}
				entry.add(word);
				trigramDictionary.put(trigram, entry);
			}
		}
	}

	/**
	 * Retourne la liste des mots du dictionnaire et leur nombre de trigrammes en
	 * commun avec word
	 *
	 * @param word
	 * @return
	 */
	public List<WordDistance> numbersOfCommonTrigrams(String word) {
		word = "<" + word + ">";

		Map<String, Integer> counters = new HashMap<>();

		for (String trigram : trigram(word)) {
			List<String> similarWords = trigramDictionary.get(trigram);
			if (similarWords == null) {
				continue;
			}
			for (String similarWord : similarWords) {

				Integer count = counters.get(similarWord);
				counters.put(similarWord, count == null ? 1 : count + 1);
			}
		}
		List<WordDistance> wordDistances = new ArrayList<>();

		for (Map.Entry<String, Integer> e : counters.entrySet()) {
			wordDistances.add(new WordDistance(e.getValue(), e.getKey()));
		}

		/**
		 * for(WordDistance wordDistance : wordDistances) {
		 * System.out.println(wordDistance.getWord() + " : " +
		 * wordDistance.getDistance()); }
		 */
		return wordDistances;
	}

	/**
	 * Retourner la liste des mots du dictionnaire ayant le plus de trigrammes en
	 * commun avec word
	 *
	 * @param word
	 * @param numberMax le nombre maximal de mots à retourner
	 * @return
	 */
	public List<String> proximityTrigrams(String word, int numberMax) {
		List<WordDistance> wordDistances = numbersOfCommonTrigrams(word);
		int size = wordDistances.size();

		List<String> toReturn = new ArrayList<>();

		int max = 0;
		for (WordDistance w : wordDistances) {
			if (max < w.getDistance()) {
				max = w.getDistance();
			}
		}

		while (toReturn.size() <= numberMax && toReturn.size() < size) {
			for (WordDistance w : wordDistances) {
				if (toReturn.size() > numberMax) {
					break;
				}
				if (w.getDistance() == max) {
					toReturn.add(w.word);
				}
			}
			max--;
		}
		return toReturn;
	}

}
