package com.sda.strings;

public class AnonStringOperationApp {

    public static void main(String[] args) {

        StringOperation truncateText = new StringOperation() {
            @Override
            public String modify(String text) {
                if (text.length()<5) {
                    return text;
                }
                return text.substring(0,5);
            }
        };
        System.out.println(truncateText.modify("sasanka"));
    }
}
