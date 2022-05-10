package com.excecise.recruitmentapplication;

import java.util.*;

public class RecruitmentApplication {

    public static void main(String[] args) {
        args = new String[]{"MyApp JavaAcademy"};
        countEachArgumentLetter(args[0]);
    }

    public static Map<Character, Integer> countEachArgumentLetter(String arg) {
        Map<Character, Integer> characterMap = new HashMap<>();
        arg = arg.toLowerCase();
        char[] characterArray = arg.toCharArray();

        for (char character : characterArray) {
            if(character != ' ') {
                if (characterMap.containsKey(character)) {
                    characterMap.put(character, characterMap.get(character) + 1);
                } else {
                    characterMap.put(character, 1);
                }
            }
        }

        characterMap.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByKey())
                .forEach(System.out::println);

        return characterMap;
    }
}
