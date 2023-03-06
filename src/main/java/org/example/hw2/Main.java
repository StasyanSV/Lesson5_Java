package org.example.hw2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = sc.nextLine();
        System.out.print("Введите слово для поиска: ");
        String findWord = sc.nextLine();
        System.out.printf("Слово \"%s\" встречается %d раз(а).", findWord, countWord(text, findWord));

    }

    public static int countWord(String text, String findWord) {
        findWord = findWord.toLowerCase();
        text = text.replaceAll("[^а-яА-я\\s]", "").replaceAll("\\s{2,}", " ");
        String[] word = text.toLowerCase().split(" ");
        Map<String, Integer> countWordMap = new HashMap<>();
        countWordMap.put(findWord, 0);
        for (String s : word) {
            if (countWordMap.containsKey(s)) countWordMap.put(s, countWordMap.get(s) + 1);
        }
        return countWordMap.get(findWord);
    }
}
