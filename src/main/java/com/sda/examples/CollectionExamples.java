package com.sda.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionExamples {
    public static void main(String[] args) {

        ArrayList<String> textList = new ArrayList<>();

        textList.add("dom");
        textList.add("zupa");
        textList.add("kot");

        for (int i=0; i<textList.size(); i++) {

            System.out.println(textList.get(i));
        }

        Map<String, String> phonebook = new HashMap<>();
        phonebook.put("Roman", "3333");
        phonebook.put("Mary", "9999");

        System.out.println(phonebook.get("Roman"));

        Set<Map.Entry<String, String>> entries = phonebook.entrySet();
        for (Map.Entry<String, String> entry : entries) {

        }
    }
}
