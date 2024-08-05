package com.siprikorea.util;

public class Main {
    public static String maskPersonalInfo(String input, int startIndex, int endIndex) {
        if (input == null || input.isEmpty() || startIndex < 0 || endIndex >= input.length() || startIndex > endIndex) {
            return input;
        }

        StringBuilder masked = new StringBuilder(input);
        for (int i = startIndex; i <= endIndex; i++) {
            masked.setCharAt(i, '*');
        }
        return masked.toString();
    }


    public static void main(String[] args) {
        String name = "홍길동";
        String phoneNumber = "01022223333";
        String cardNumber = "1111222233334444";
        String ci = "MGU1OTM2Y2FmODE2OTRmMTI4MWZlMzBlMWM3NWViM2E3NDljNmQwODE4OWI3MjZjMWM0YzBlYjA5ZDNjOTI2Yg==";
        String di = "134d322ced5d227d3a280d00829070ee40c8638d01ca70c27fbd1f3998be14d8";
        String maskedString;

        // 이름
        maskedString = maskPersonalInfo(name, 1, name.length() - 2);
        System.out.println("이름: " + maskedString);

        // 전화번호
        maskedString = maskPersonalInfo(phoneNumber, 3, phoneNumber.length() - 5);
        System.out.println("전화번호: " + maskedString);

        // 카드번호
        maskedString = maskPersonalInfo(cardNumber, cardNumber.length() - 7, cardNumber.length() - 1);
        System.out.println("카드번호: " + maskedString);

        // CI
        maskedString = maskPersonalInfo(ci, 7, ci.length() - 1);
        System.out.println("CI: " + maskedString);

        // DI
        maskedString = maskPersonalInfo(di, 2, di.length() - 1);
        System.out.println("DI: " + maskedString);
    }
}