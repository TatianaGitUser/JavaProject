package Class31_Maps;

import java.util.HashMap;

import java.util.Map;

public class    HW_PhoneNumbersValidator {
    public static void main(String[] args) {
        //HW1
        //Description: Implement a method called validatePhoneNumbers() that accepts a String
        // input representing a list of phone numbers separated by commas. The method should
        // validate each phone number and return a map object where the key is the valid phone
        // number and the value is an index indicating the order of the phone number in input.
        // Ignore invalid numbers and non-digit characters. If no valid phone is provided,
        // return the map with the key "0" and the value "EMPTY".
        //Params: String input representing a list of phone numbers separated by commas.
        //Return: Map object with valid phone numbers and index in the input. Both key and value
        // are String data types.
        //Validation Rules:
        //A valid phone number should consist of exactly 10 digits.
        //A valid phone starts with 0.
        //A valid phone can't have 9 as the last digit.
        String input = "023-456-7890, 555-5555, 0876543210, 0123456789";
        System.out.println(validatePhoneNumbers(input));
    }

    public static Map<String, String> validatePhoneNumbers(String input) {
        Map<String, String> resultMap = new HashMap<>();
        String[] phoneNumbers = input.split(",");
        for (int i = 0; i < phoneNumbers.length; i++) {
            String originalPhoneNumber = phoneNumbers[i].trim();
            String phoneNumber = originalPhoneNumber.replaceAll("[^0-9]", "");
            if (isValidPhoneNumber(phoneNumber)) {
                resultMap.put(originalPhoneNumber, String.valueOf(i)); // Store the original phone number as key
            }
        }
        if (resultMap.isEmpty()) {
            resultMap.put("0", "EMPTY");
        }
        return resultMap;
    }

    private static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.length() == 10 && phoneNumber.startsWith("0") && phoneNumber.charAt(9) != '9';
    }

}

