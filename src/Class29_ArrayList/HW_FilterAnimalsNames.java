package Class29_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class HW_FilterAnimalsNames {
    public static void main(String[] args) {
        String [] animals = {"Lion", "Elephant", "Tiger", "Giraffe", "Leopard", "Zebra"};
        String letter = "L";
        System.out.println(filterAnimals(animals, letter));
    }
    public static List<String> filterAnimals(String [] animals, String letter){
        char thatLetter = Character.toUpperCase(letter.charAt(0));
        List <String> sortedAnimals = new ArrayList<>();
        if(Character.isDigit(thatLetter)){
            sortedAnimals.add("Not allowed");
        }
        for (int i=0; i<animals.length; i++){
            String currentAnimal = animals[i];
            char firstLetter = currentAnimal.charAt(0);
            if (thatLetter== firstLetter){
                sortedAnimals.add(currentAnimal);
            }
        }return sortedAnimals;
    }
}
