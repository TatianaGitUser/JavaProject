package Class30;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
public class HW_UserName_SetUpdate_ShoppingList {
    public static void main(String[] args) {
        Set<String> userList = new LinkedHashSet<>();
        userList.add("alice");
        userList.add("bob");
        userList.add("carol");
        String oldUserName = "bob";
        String newUsername = "dave";
        System.out.println(updateUserList(userList, oldUserName,newUsername));

        Set<String> shoppingCart = new LinkedHashSet<>();
        shoppingCart.add("Apples");
        shoppingCart.add("Bananas");
        shoppingCart.add("Milk");
        boolean isAdd = true;
        String item = "Bread";
        System.out.println(manageCart(shoppingCart, isAdd, item));

        Set<String> shoppingList = new HashSet<>();
        shoppingList.add("Apples");
        shoppingList.add("Oranges");
        shoppingList.add("Bananas");
        String itemToAdd = "Oranges";
        System.out.println(organizeShoppingList(shoppingList, itemToAdd));
    }
    public static Set<String> updateUserList(Set<String> userList, String oldUsername, String newUserName){
        Set<String> updatedList = new LinkedHashSet<String>(userList);
        if(updatedList.contains(oldUsername)){
            updatedList.remove(oldUsername);
            updatedList.add(newUserName);
        }else{
            return userList;
        }

        return updatedList;
    }
    public static Set<String> manageCart(Set<String> shoppingCart, boolean isAdd, String item){
        if(isAdd){
            shoppingCart.add(item);
        }else{
            shoppingCart.remove(item);
        }return shoppingCart;
    }
    public static Set<String> organizeShoppingList(Set<String> shoppingList, String itemToAdd){
        if(!shoppingList.contains(itemToAdd)){
            shoppingList.add(itemToAdd);
        }else{
            System.out.println("Item " + itemToAdd + " is already in the list");
        }return shoppingList;
    }

}
