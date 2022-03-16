package com.inxane.tymbarklib;

import java.util.ArrayList;
import java.util.Random;

public class TymbarkGenerator {
    private ArrayList<String> words;
    private Random random;

    public TymbarkGenerator(ArrayList<String> words) {
        this.words = words;
        this.random = new Random();
    }

    public String generate(int count) {
        ArrayList<String> words = new ArrayList<>();

        while (words.size() != count) {
            String word = this.words.get(random.nextInt(this.words.size()));

            if (!words.contains(word)) {
                words.add(word);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Tymbark ");

        for (int i = 0; i < count; i++) {
            sb.append(words.get(i));
            if (i != count - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
