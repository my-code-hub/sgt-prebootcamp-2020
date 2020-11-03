package com.accenture.bootcamp.interfaces.exercise20;

public class Exercise20 {

    public static void main(String[] args) {
        CharSequence sequence1 = new ArrayCharSequenceReverse("abcdef");

        System.out.println(sequence1.length());

        System.out.println(sequence1.subSequence(1, 3));

        System.out.println(sequence1.toString());

        System.out.println(sequence1.charAt(1));


        sequence1.subSequence(1, 7);
        sequence1.subSequence(7, 1);

        sequence1.subSequence(-1, 3);
        sequence1.subSequence(1, -3);
    }
}
