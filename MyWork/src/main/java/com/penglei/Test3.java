package com.penglei;

public class Test3 {
    static int pinggai = 20;
    static int pingshen = 20;
    static int pingshu = 20;

    public static void main(String[] args) {
        System.out.println(huanyinliao());
    }

    static int huanyinliao() {
        if (pinggai >= 3) {
            pinggai = pinggai - 2;
            pingshen++;
            pingshu++;
            huanyinliao();
            return pingshu;
        } else if (pinggai < 3 && pingshen >= 2) {
            pingshen = pingshen - 1;
            pinggai++;
            pingshu++;
            huanyinliao();
            return pingshu;
        } else {
            return pingshu;
        }

    }
}
