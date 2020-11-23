package com.accenture.bootcamp.other;

import java.util.ArrayList;

public class PlayGround {

    public static void main(String[] args) {
        String [] colors = {"red", "blue", "pink", "black", "white", "yellow", "green"};
        ArrayList<String> colorsList;
        colorsList = new ArrayList<>();
        ArrayList <String> colorsSublist;
        colorsSublist= new ArrayList<>();
        colorsList.add("red");
        colorsList.add("blue");
        colorsList.add("pink");
        colorsList.add("black");
        colorsList.add("white");
        colorsList.add("yellow");
        colorsList.add("green");
        colorsList.remove(2);
        colorsList.add("grey");
        colorsList.add(0,"purple");
        for (String color: colorsList ) {
            System.out.println(color + " ");
        }
        for (String color: colorsList ) {
            colorsSublist.add(color.substring(2,5));
        }
        for (String subColor:colorsSublist) {
            System.out.println(subColor + " ");
        }
    }
}
