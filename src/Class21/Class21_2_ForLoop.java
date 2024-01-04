package Class21;

public class Class21_2_ForLoop {
    public static void main(String[] args) {
//        write a method that returns int number and takes a String input
//        the method should count the num of words in a String
       int result = countWords("Hello superstar");/*calling the method!!<--*/
        System.out.println(result);

    }
        public static int countWords(String str){
//            str = "Hello world superstars"
//            if there are no spaces and String is not empty, then theres only 1 word
//            if there is 1 or more spaces - that means the num of words will be num of spaces + 1
if(str.trim().isEmpty()){
    return 0;
}
            int spaceCounter = 0;
         for(int index = 0; index<= str.length()-1; index++){
             if (str.charAt(index) == ' '){
           spaceCounter++;
             }
         }
return spaceCounter +1;
    }
}
