// enums/SpicinessEnum.java
package cn.cnhoyun.chapter19;

import static cn.cnhoyun.chapter19.SpicinessEnum.*;

enum SpicinessEnum {
    NOT, MILD, MEDIUM, HOT, FLAMING
}

// enums/Burrito2.java
// {java enums.Burrito2}
public class Burrito2 {
    SpicinessEnum degree;

    public Burrito2(SpicinessEnum degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Burrito is " + degree;
    }

    public static void main(String[] args) {
        System.out.println(new Burrito2(NOT));
        System.out.println(new Burrito2(MEDIUM));
        System.out.println(new Burrito2(HOT));
    }
}
