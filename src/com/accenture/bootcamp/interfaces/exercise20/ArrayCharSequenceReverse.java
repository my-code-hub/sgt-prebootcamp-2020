package com.accenture.bootcamp.interfaces.exercise20;

public class ArrayCharSequenceReverse implements CharSequence {

    private char[] array;

    public ArrayCharSequenceReverse(char[] sequence) {
        this(sequence, true);
    }

    public ArrayCharSequenceReverse(String sequence) {
        this(sequence.toCharArray(), true);
    }

    private ArrayCharSequenceReverse(char[] sequence, boolean reverseSequence) {
        this.array = sequence;
        if (reverseSequence) {
            reverseArray(array);
        }
    }

    @Override
    public int length() {
        return array.length;
    }

    @Override
    public char charAt(int index) {
        if (isNotInRange(index)) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (isNotInRange(start) || isNotInRange(end) || start >= end) {
            throw new IndexOutOfBoundsException();
        }
        int sequenceLength = end - start;
        char[] sequence = new char[sequenceLength];
        for (int i = start, j = 0; i < end; i++, j++) {
            sequence[j] = array[i];
        }

        return new ArrayCharSequenceReverse(sequence, false);
    }

    @Override
    public String toString() {
        return new String(array);
    }

    private boolean isNotInRange(int index) {
        int length = length();
        return index < 0 || index >= length;
    }

    private void reverseArray(char[] sequence) {
        int length = sequence.length;

        if (length == 0)
            return;

        for (int i = 0; i < (length / 2); i++) {
            char l = sequence[i];
            sequence[i] = sequence[length - i - 1];
            sequence[length - i - 1] = l;
        }
    }
}
