package com.courses.spalah;


import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TextAnalyzer {
    public void reader() {
        File f = new File("D:\\File.txt");
        try (FileReader reader = new FileReader(f)) {
            char[] buffer = new char[(int) f.length()];
            reader.read(buffer);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

     /*public void searchSentence(String s){
         reader();
         String[] words = s.split("\\.");
         StringBuilder searchSent = new StringBuilder();
         for (String i : words) {
            if (i.contains(s)) {
                searchSent.append(s);
            }
        }
    }*/
}


