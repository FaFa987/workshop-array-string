package se.lexicon;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(NameRepository.getSize());
        NameRepository.setName(new String[]{"fafa khaleghi"});
        NameRepository.clear();
        System.out.println("findAll: " + Arrays.toString(NameRepository.findAll()));
    }
}