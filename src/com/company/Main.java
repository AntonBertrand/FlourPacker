package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(0, 5, 4));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        bigCount = bigCount * 5;

        if (bigCount + smallCount == goal) {
            return true;
        } else if ((bigCount >= goal && bigCount % goal == 0) || (bigCount >= goal && goal % 5 <= smallCount)) {
            return true;
        } else if (smallCount >= goal) {
            return true;
        } else if (bigCount + smallCount > goal && goal % bigCount <= smallCount) {
            return true;
        } else {
            return false;
        }
    }


}

