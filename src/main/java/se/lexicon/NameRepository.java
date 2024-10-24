package se.lexicon;

import java.util.Arrays;

public class NameRepository {

    private static String[] names = new String[0];


    public static int getSize() {
        return names.length;

    }

    public static void setName(String[] names) {
        NameRepository.names = names;
        //System.out.println(Arrays.toString(NameRepository.names));


    }

    public static void clear() {
        NameRepository.names = new String[0];
        //System.out.println(Arrays.toString(NameRepository.names));
    }

    public static String[] findAll() {
        return NameRepository.names;
    }

    public static String find(final String fullName) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(fullName)) {
                return names[i];
            }
        }
        return null;
    }

    public static boolean add(final String fullName) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(fullName)) {
                return false;
            }
        }
        names = Arrays.copyOf(names, names.length + 1);
        names[names.length - 1] = fullName;
        return true;
    }

    public static boolean update(final String original, final String updatedName) {
        if(find(updatedName) != null) {
            return false;
        }
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(original)) {
                names[i] = updatedName;
                return true;
            }
        }
        return false;

    }

    public static boolean remove(final String fullName){


        for(String s : names) {
            String[] example = new String[names.length-1];
            boolean found = false;
            int index = 0;
            for (int i = 0; i < names.length; i++) {
                if (names[i].equalsIgnoreCase(s)) {
                    found = true;
                }
            }
        }
        return true;
    }


}





