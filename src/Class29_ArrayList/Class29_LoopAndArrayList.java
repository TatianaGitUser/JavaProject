package Class29_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Class29_LoopAndArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//set method takes (int index, element) -> updates the element at the given index to a new element

        list.add("Lamborghini");
        list.add("Ferrari");
        list.add("Bugatti");
        System.out.println(list);
//        suitable iteration methods: traditional for loops, for each loop, while loop
        for ( int i = 0; i < list.size(); i++) {
            //list.get(i);
            System.out.println(list.get(i));
            System.out.println("=======");
        }
        for (String var : list){
                System.out.println(var);
            }
        System.out.println("================");
            //skip Ferrari
            for (int i = 0; i<list.size(); i++){
                String var = list.get(i);
                if(!var.equalsIgnoreCase("Ferrari")){
                    System.out.println(var);
                }
            }
System.out.println("=====================");
            for (String var : list){
                if(!var.equalsIgnoreCase(("Ferrari"))){
                    System.out.println(var);
                }
            }
        }
    }

