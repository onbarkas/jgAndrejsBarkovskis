package lv.homework.lesson8;

class Bus extends Car {

    //šeit nepieciešams vismaz vienu specefisku stāvokli autobusam

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    @Override
    public String toString() {
        return "Bus " + super.toString();
    }
}
