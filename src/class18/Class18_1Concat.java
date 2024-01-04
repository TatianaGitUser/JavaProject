package class18;

public class Class18_1Concat {
    public static void main(String[] args) {
        String str = "Hello ";
        String str2 = "Superstars ";
        String finalString = str.concat(str2);
        System.out.println(finalString);

        String finalStr2 = str2.concat(str);
        System.out.println(finalStr2);

//        reassigning value of a String
        String str4 = "Mars";
        str4 = str4.concat(" is future!");
        System.out.println(str4);

        String str5 = "Space X";
        String strFinal5 = str5.concat(": :").concat("is going to take us to Mars");
        System.out.println(strFinal5);
    }
}


//    public static String getMiddleChars(String inputLength){
//        if (inputLength.isEmpty()) {
//            return "???";
//        }
//        int length = inputLength.length();
//        if (length == 1 || length == 2) {
//            return inputLength;
//        }
//        int mid = length / 2;
//        if (length % 2 == 0) {
//            return inputLength.substring(mid - 1, mid + 1);
//        } else {
//            return inputLength.substring(mid, mid + 1);
//        }
//
//
//        if(a.isEmpty()){
//            return "???";
//        }
//        else if(a.length()==1){
//            return "" + a.charAt(0);
//        }
//        else if(a.length()==2){
//            return "" + a.charAt(0) + a.charAt(a.length()-1);
//        }
//        else if(a.length()%2==0){
//            int num1 = a.length()/2;
//            return "" + a.charAt(num1-1) + a.charAt(num1);
//        }
//        else if(a.length()%2!=0){
//            int num2 = a.length()/2;
//            return "" + a.charAt(a.length()-num2-1);
//        }else{
//            return "";
//        }
//    }