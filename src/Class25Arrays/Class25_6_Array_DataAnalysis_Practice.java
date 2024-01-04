package Class25Arrays;

public class Class25_6_Array_DataAnalysis_Practice {
    public static void main(String[] args) {
//        fins average daily value
     double []dailyRevenueArr = {25.0, 10.2, 44.5, 14.7, 50.1};
//     sum of all nums divide by number of nums
//when use = -> you ovewrite the value
        double sum =0;
        for(int i = 0; i<dailyRevenueArr.length; i++){
           sum += dailyRevenueArr[i];
//           i = 0 +25.0
//           i = 25+10.2 ->35.2
//           i =  35.2+ 44.5 -> 79.7
//           i =  79.7 + 14.7 -> 94.4


        }
        System.out.println(sum);
        double average = sum/dailyRevenueArr.length;
        System.out.println(average + " Daily average revenue");
    }
}
