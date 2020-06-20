package com.sda.strings;

public class StringOperationApp {
    public static void main(String[] args) {
        StringOperation stringOperation = new TextUpperCase();
        String before = "dupa";
        String after = stringOperation.modify(before);
        System.out.println(before + " " + after);

        stringOperation = new TextDuplicate();
        System.out.println(stringOperation.modify("dupa"));

        StringOperation costam = new TextUpperCase();

        
        printModification(before, costam);

    }

    public static void printModification(String text, StringOperation operation) {
        String modified = operation.modify(text);
        String message = String.format("Before: [%s]; After: [%s]", text, modified);
        System.out.println(message);

    }
}
