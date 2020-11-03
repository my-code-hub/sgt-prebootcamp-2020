package com.accenture.bootcamp.interfaces.exercise20;

public class ArrayCharSequence implements CharSequence {

    private char[] array;

    public ArrayCharSequence(char[] sequence) {
        this.array = sequence;
    }

    public ArrayCharSequence(String sequence) {
        array = sequence.toCharArray();
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
        return new ArrayCharSequence(sequence);
    }

    @Override
    public String toString() {
        return new String(array);
    }

    private boolean isNotInRange(int index) {
        int length = length();
        return index < 0 || index >= length;
    }
}
