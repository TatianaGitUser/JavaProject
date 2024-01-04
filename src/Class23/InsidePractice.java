package Class23;

public class InsidePractice {
    public static void main(String[] args) {
//        public String notString(String str) {
//            return (str.startsWith("not")) ? str: "not " + str;
//        }
////Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not",
//// return the string unchanged. Note: use .equals() to compare 2 strings.
//    }
//}
//    public String middleThree(String str) {
//        int num = str.length()/2-1;
//
//        return str.substring(num,str.length()-num);
//return (num, num+3);
//
//        return str.substring(str.length()/2-1,(str.length()/2)-1+3);
    }
    public static void printSumTable(int n){
        for (int i = 1; i<=n; i++){
        for (int x = 1; x<= i; x++){
                System.out.print(x+i);
            }System.out.println("\t");
        }
    }
}