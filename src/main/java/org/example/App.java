package org.example;

import java.time.LocalDate;
import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        ex7();
    }

    private static void ex1() {
        Pet cat1 = new Pet("Nisse","Cat");

        Pet cat2 = new Pet("Nisse","Cat");

        System.out.println(cat1);
        System.out.println(cat2);

        System.out.println( cat1.hashCode() );
        System.out.println( cat2.hashCode() );

        System.out.println( cat1.equals(cat2) );

        System.out.println( cat1.hashCode() == cat2.hashCode() );

        List<Pet> pets = new ArrayList<>();

        pets.add(cat1);
        pets.add(cat2);

        boolean result = pets.contains(new Pet("Nisse","Cat"));

        System.out.println(result);
    }

    private static void ex2() {
        Map<String,Pet> onePerBreedPetList = new HashMap<>();

        Pet cat1 = new Pet("Nisse","Cat");
        Pet cat2 = new Pet("Nisse","Cat");

        Pet dog1 = new Pet("Pluto","Dog");

        onePerBreedPetList.put(cat1.getBreed(), cat1);
        onePerBreedPetList.put(dog1.getBreed(), dog1);

        for (String key : onePerBreedPetList.keySet()) {
            System.out.println(onePerBreedPetList.get(key));
        }

        System.out.println("-------------");
        onePerBreedPetList.put(cat2.getBreed(), cat2);

        for (String key : onePerBreedPetList.keySet()) {//notice that map is using a Set to hold the keys and this is why there are no duplicate keys.
            System.out.println(onePerBreedPetList.get(key));
        }

        System.out.println("------ duplicated values -------");
        onePerBreedPetList.put("key1", dog1);
        onePerBreedPetList.put("key2", dog1);

        for (String key : onePerBreedPetList.keySet()) {
            System.out.println(onePerBreedPetList.get(key));
        }

        System.out.println("------ list of keys -------");

        for (String key : onePerBreedPetList.keySet()) {
            System.out.println(key);
        }
    }

    private static void ex3() {
        Pet cat1 = new Pet("Nisse","Cat");
        Pet cat2 = new Pet("Nisse","Cat");
        Pet dog1 = new Pet("Pluto","Dog");

        Map<Integer,Pet> idPetList = new HashMap<>();

        idPetList.put(cat1.getId(), cat1);
        idPetList.put(cat2.getId(), cat2);
        idPetList.put(dog1.getId(), dog1);

        for (int key : idPetList.keySet()) {
            System.out.println(idPetList.get(key));
        }
    }

    private static void ex4() {
        Map<String,String> nicknameEmails = new HashMap<>();

        nicknameEmails.put("Uffe", "ulf.bengtsson@lexicon.se");
        nicknameEmails.put("Mehrdad", "mehrdad.javan@lexicon.se");
        nicknameEmails.put("Fredde", "fredrik.odin@lexicon.se");

        for (String nickname: nicknameEmails.keySet()) {
            System.out.println("Mail to: " + nickname);
            System.out.println("Program send email to: " + nicknameEmails.get(nickname));
        }
    }

    private static void ex5() {
        LocalDate today = LocalDate.now();

        System.out.println(today);

        LocalDate birthday = LocalDate.parse("2020-08-25");

        System.out.println(birthday);

        LocalDate xmas = LocalDate.of(2020,12,24);

        System.out.println(xmas);

        /* old system to handel time in Java, more manual work and no nice pre-made helper methods.
            Date oldDate = new Date();

            System.out.println(oldDate);
         */
    }

    private static void ex6() {
        HashMap<String,String> testMap = new HashMap<>();
        testMap.put("Test1","Test11");
        testMap.put("Test3","Test33");
        testMap.put("Test2","Test22");

        System.out.println(testMap.get("Test1"));
        System.out.println(testMap.remove("Test1"));

        System.out.println("----------");

        for (String key:testMap.keySet()) {
            System.out.println(key);
        }
    }

    private static void ex7() {
        Set<String> nameList = new HashSet<>();

        nameList.add("Ulf");
        nameList.add("Mehrdad");

        System.out.println(nameList.contains("Ulf"));
    }
}
/*
    double primetivDouble = 8.8;
    Double number = primetivDouble;
*/