package bucky_intermediate.lesson2;

public class String {
    public static void main(java.lang.String[] args) {
        java.lang.String s = "Buckyrobertsbuckyroberts";

        System.out.println(s.indexOf("rob", 10));

        java.lang.String a = "Bacon ";
        java.lang.String b = "      monster     ";
        System.out.println(a.concat(b));
        System.out.println(a.replace("B", "F"));
        System.out.println(b.toUpperCase());
        System.out.println(b.trim());
    }
}
