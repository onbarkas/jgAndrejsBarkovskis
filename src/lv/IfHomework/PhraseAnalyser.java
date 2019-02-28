package lv.IfHomework;

public class PhraseAnalyser {
    String text = "Make education great again";
    String result;


    public String analyse(){
                if ((text.charAt(0) == 'M'
                && text.charAt(1) == 'a'
                && text.charAt(2) == 'k'
                && text.charAt(3) == 'e')) {
                    if (text.charAt(15) == 'g'
                    && text.charAt(16) == 'r'
                    && text.charAt(17) == 'e'
                    && text.charAt(18) == 'a'
                    && text.charAt(19) == 't'
                    && text.charAt(20) == ' '
                    && text.charAt(21) == 'a'
                    && text.charAt(22) == 'g'
                    && text.charAt(23) == 'a'
                    && text.charAt(24) == 'i'
                    && text.charAt(25) == 'n'){
                result = "It Stands no change";
            } else
            result = "It could be worse";
        } else
        {result = "It is fine, really";}
        return result;
    }
}
