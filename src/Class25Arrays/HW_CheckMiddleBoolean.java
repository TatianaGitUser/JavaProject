package Class25Arrays;

public class HW_CheckMiddleBoolean {
    public static void main(String[] args) {
        boolean []input = {false, true, false, true, false, true, true};
        System.out.println(checkMiddle(input));
    }
    public static int checkMiddle(boolean []input){
        int length = input.length;
        if (length<=0){
            return -1;
        }
        if(length%2 == 0){
            if (input[length/2]&&input[length/2-1]){
                return 1;

            }else{
                return -1;
            }
        }else{
            if (input[length/2]){
                return 1;
            }else{
                return -1;
            }
        }
    }

}
