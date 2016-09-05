package com.courses.spalah;

import java.io.*;
import java.util.*;


/**
 * @author Ievgen Tararaka
 */
public class TextAnalyzer {
    /**
     * Ваш анализатор текста должен быть тут
     */
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Rita\\courses-2-2016\\module11\\src\\main\\resources\\text_sample.txt");
        File file = new File("C:\\Users\\Rita\\courses-2-2016\\module11\\src\\main\\resources\\output.txt");
        StringBuilder builder = new StringBuilder();
        try (FileReader reader = new FileReader(f)) {
            char[] buffer = new char[(int) f.length()];
            reader.read(buffer);
            String str = new String(buffer);
            //System.out.println(new String(buffer));
            try (FileWriter writer = new FileWriter(file)) {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                builder.append("Total amount of symbol: " + countChars(str) + "\n");
                builder.append("Amount of words: " + countWords(str) + "\n");
                builder.append("Amount of sentence: " + countSentence(str) + "\n");
                builder.append("Amount of unique words: " + countUniqueWords(str) + "\n");
                // builder.append("Most commonly used word: " + countCommonlyUsedWords(str) + "\n");
               // builder.append("The length of the shortest word: " + findShortWord(str) + "\n");
                bufferedWriter.write(builder.toString());
                bufferedWriter.flush();
                bufferedWriter.close();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int countChars(String str) {
        char[] chArray = str.toCharArray();
        int count = 0;
        for (int i = 0; i < chArray.length; i++) {
            if (Character.isWhitespace(chArray[i])) {
                count++;
            }
        }
        return chArray.length - count;
    }

    public static int countWords(String str) {
        String[] words = str.replaceAll("[-.?!)(,:]", " ").split(" ");
        Map<String, Integer> counter = new HashMap<>();
        int wordsCount = 0;
        for (String i : words) {
            if (!i.isEmpty()) {
                counter.get(i);
                wordsCount++;
            }
        }
        return wordsCount;
    }

    public static int countSentence(String str) {
        String[] words = str.split("\\.");
        Map<String, Integer> counter = new HashMap<>();
        int sentenceCount = 0;
        for (String i : words) {
            if (!i.isEmpty()) {
                counter.get(i);
                sentenceCount++;
            }
        }
        return sentenceCount;
    }

    public static int countUniqueWords(String str) {
        String[] words = str.replaceAll(".", "").split(" ");
        Map<String, Integer> uniqueWords = new HashMap<String, Integer>();
        for (String unique : words) {
            if (!unique.isEmpty()) {
                if (uniqueWords.containsKey(unique)) {
                    int count = uniqueWords.get(unique).intValue();
                    uniqueWords.put(unique, new Integer(count + 1));
                } else {
                    uniqueWords.put(unique, new Integer(1));
                }
            }
        }
        return uniqueWords.size();
}
    public static String countCommonlyUsedWords(String str) {
        String[] words = str.toLowerCase().split(" ");
        HashMap<String, Integer> usedWords = new HashMap();
        String frequentWord = "";
        int frequency = 0;
        for (String freqWords : words) {
            if () {

            }
        }

        return;
    }

   /* public static String findShortWord(String str) {
        String[] words = str.toLowerCase().replaceAll("[-.?!)(,:]", " ").split(" ");
        Map <String, Integer> map = new HashMap <String, Integer>();
        return ;
    }*/
}




