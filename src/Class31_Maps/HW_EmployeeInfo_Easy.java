package Class31_Maps;
import java.util.HashMap;
import java.util.Map;

public class HW_EmployeeInfo_Easy {
    public static void main(String[] args) {
        Map<String, String> employees = new HashMap<>();
        employees.put("E101", "John Doe,Manager,60000");
        employees.put("E102", "Jane Smith,Engineer,75000");
        String employeeID =  "E101";
        String newInfo = "John Doe,Manager,70000";
        System.out.println(updateEmployeeInfo(employees, employeeID, newInfo));
    }
    public static Map<String, String> updateEmployeeInfo(Map<String, String> employees, String employeeID, String newInfo){
        if(employees.containsKey(employeeID)){
            employees.replace(employeeID, newInfo);
        }else{
            employees.put(employeeID, newInfo);
        }return employees;
    }
}
