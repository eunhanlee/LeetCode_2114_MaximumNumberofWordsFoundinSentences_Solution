package org.example;

public class Main {
    public static void main(String[] args) {
        Solution tt = new Solution();
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(tt.mostWordsFound(sentences));
    }
}