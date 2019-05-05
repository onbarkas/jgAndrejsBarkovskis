package bucky_intermediate.lesson1;

public class String {
    public static void main(java.lang.String[] args) {
        java.lang.String[] words = {"funk", "chunk", "furry", "baconator"};
        for (java.lang.String w : words){
            if (w.startsWith("fu")) {
            System.out.println(w + " Starts with fu");}
        }

        for (java.lang.String w : words){
            if (w.endsWith("unk")) {
                System.out.println(w + " Ends with unk");}
        }
    }
}
