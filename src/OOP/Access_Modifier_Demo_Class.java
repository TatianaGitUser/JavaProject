package OOP;
import java.util.*;
import Class32.AccessModifierClass;

public class Access_Modifier_Demo_Class {
    public static void main(String[] args) {
        AccessModifierClass var = new AccessModifierClass();
        var.name = "Hello";
        var.id = 1;
//        var.price = 2.2; ->not accesible from another package
//        var.hobbies;-> can be acceesed only from within same package;
int [] one = new int[0];
List<int []> ss = Arrays.asList(one);


    }

}
