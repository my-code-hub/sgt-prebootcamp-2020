package com.accenture.prebootcamp.strings;

public class StringExamples {

    // ******** Agenda ********
    // String is an object (non-primitive)
    // String - under the hood
    // How and why we compare strings?
    // String pool - https://www.edureka.co/blog/java-string-pool/
    // Methods (immutability)
    // Calling methods on null String

    //read more:
    // https://www.w3schools.com/java/java_strings.asp
    // https://www.w3schools.com/java/java_ref_string.asp
    public static void main(String[] args) {
        String myName = "Ritvars";
        System.out.println("myName: " + myName);

        String name2 = "Ritvars";
        System.out.println("myName == name2 " + (myName == name2));

        String name3 = new String("Ritvars");
        System.out.println("name3 = " + name3);

        //incorrect way of comparing strings
        System.out.println("myName == name3 -> " + (myName == name3));
        System.out.println("name2 == name3 -> " + (name2 == name3));

        //correct way to compare string objects
        System.out.println("myName.equals(name3) -> " + myName.equals(name3));
        System.out.println("name2.equals(name3) -> " + name2.equals(name3));

        String name4 = null;
        // name4.equals(name3); this will result in null pointer error

        System.out.println("\"Hello\".equals(\"hello\") -> " + "Hello".equals("hello"));
        System.out.println("\"Hello\".equalsIgnoreCase(\"hello\") -> " + "Hello".equalsIgnoreCase("hello"));
        System.out.println("\" hello\".equals(\"hello\") -> " + " hello".equals("hello"));

        String str1 = "Foo";
        char char0 = str1.charAt(0);
        System.out.println("char0 - " + char0);

        str1.toUpperCase();
        System.out.println("str1 - " + str1);

        String str2 = str1.toUpperCase();
        System.out.println("str2 - " + str2);
        System.out.println("str1.toUpperCase() " + str1.toUpperCase());

        System.out.println("str2.length() " + str2.length());
        System.out.println("\"hello\".replace(\"o\", \"\") -> " + ("hello".replace("o", "")));

        System.out.println("foo oooooo hello".replace("o", ""));
        System.out.println("foo".replaceFirst("o", ""));

        char[] str2Array = str2.toCharArray();

        String str3 = "      John Doe        ";
        System.out.println("str3 - " + str3);
        System.out.println("str3.trim() - " + str3.trim());

        String str4 = "12345678";
        System.out.println("str4.substring(2): " + str4.substring(2));
        System.out.println("str4.substring(2, 6): " + str4.substring(2, 6));

        String sentence = "Hello, my name is John and I live in Riga!";
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(i + ". " + words[i]);
        }
    }
}
