package lv.homework.lesson4.level1;

class LightColorDetector {
    String detect(int waveLength) {
        if (waveLength >= 380 && waveLength < 450) {
            return "Violet";
        } else if (waveLength >= 450 && waveLength < 495) {
            return "Blue";
        } else if (waveLength >= 495 && waveLength < 570) {
            return "Green";
        } else if (waveLength >= 570 && waveLength < 590) {
            return "Yellow";
        } else if (waveLength >= 590 && waveLength < 620) {
            return "Orange";
        } else if (waveLength >= 620 && waveLength < 750) {
            return "Red";
        }
        return "Can not see color";
    }
}


/*
public class LightColorDetector {
    public String detect(int wavelenght){ //camelCase!!

        //šeit labak izmantot "if-elseif-else" jo var iestāties tiek viens no noteiktajiem stāvokļiem
        if ((wavelenght >= 380) && (wavelenght < 450)){ //nav nepieciešams tik daudz iekavu
//            if (wavelenght >= 380 && wavelenght < 450){ //ir tas pats
            return "Violeta";
        }
        if ((wavelenght >= 450) && (wavelenght < 495)){
            return "Zila";
        }
        if ((wavelenght >= 495) && (wavelenght < 570)){
            return "Zalja";
        }
        if ((wavelenght >= 570) && (wavelenght < 590)){
            return "Dzeltena";
        }
        if ((wavelenght >= 590) && (wavelenght < 620)){
            return "Oranza";
        }
        if ((wavelenght >= 620) && (wavelenght < 750)){
            return "Sarkana";
        }
        return "Gaisma nav redzama";
    }
}*/
