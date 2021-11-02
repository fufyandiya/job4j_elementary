package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float inEuro = 140;
        float expectedEuro = 2;
        float outEuro = Converter.rubleToEuro(inEuro);
        boolean passedEuro = expectedEuro == outEuro;
        float inDollar = 240;
        float expectedDollar = 4;
        float outDollar = Converter.rubleToDollar(inDollar);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("140 rubles are " + outEuro + " euro. Test result : " + passedEuro);
        System.out.println("240 rubles are " + outDollar + " dollar's. Test result : " + passedDollar);
    }
}
