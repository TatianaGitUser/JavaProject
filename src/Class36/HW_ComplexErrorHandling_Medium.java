package Class36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW_ComplexErrorHandling_Medium {
    private static ArrayList<Object> filteredResult = new ArrayList<>(); // Static variable to store the filtered result

    public static void main(String[] args) {
        Object[] objects = {50.1, 25.9, 80.0, 0.1, 'a', 123, 3.14, true, -5};
        double threshold = 2.5;

        ArrayList<Object> result = filterGreaterValues(objects, threshold);
        if (result != null) {
            System.out.println("Filtered Result: " + Arrays.asList(result));
        }
    }

    public static ArrayList<Object>filterGreaterValues(Object[]objects, double threshold){
        try{
            for(Object obj : objects){
                if(obj instanceof Double){
                    Double value = (Double) obj;
                    if(value > threshold){
                        filteredResult.add(obj);
                    }else{
                        filteredResult.add(0);
                        break;
                    }
                }
            }
            System.out.println("Filtered Result: "+filteredResult);
            return filteredResult;
        }catch(Exception e){
            System.out.println(filteredResult);
            return null;
        }finally{
            System.out.println("Resetting static result variable to default.");
            filteredResult = null;
            return filteredResult;
        }
    }

}