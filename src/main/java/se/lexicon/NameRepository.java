package se.lexicon;

import java.util.Arrays;

public class NameRepository {

    private static String[] names = new String[0];


    public static int getSize() {
        return names.length;

    }

    public static void setName(String[] names) {
        NameRepository.names = names;
        System.out.println(Arrays.toString(NameRepository.names));


    }

    public static void clear() {
        NameRepository.names = new String[0];
        System.out.println(Arrays.toString(NameRepository.names));
    }

    public static String[] findAll() {
        return NameRepository.names;
    }
}

