package com.accenture.bootcamp.collections.examples;

//TODO you can find out more about comparable interface:
// https://dzone.com/articles/java-comparable-interface-in-five-minutes
public class SortedObject implements Comparable<SortedObject> {

    private int number;
    private String text;

    public SortedObject(int number, String text) {
        this.number = number;
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public String getText() {
        return text;
    }

    //Note: This is not NPE prone. If number or text property will be null
    //this implementation will fail with NullPointerException
    @Override
    public int compareTo(SortedObject o) {
        // compare by number first
        int result = Integer.compare(number, o.number);
        if (result != 0) {
            return result;
        }
        return text.compareTo(o.text);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SortedObject{");
        sb.append("number=").append(number);
        sb.append(", text='").append(text).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
