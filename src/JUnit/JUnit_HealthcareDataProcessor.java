//import java.util.HashMap;
//import java.util.Map;
//
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//class HealthcareDataProcessor {
//
//    // Business function to process healthcare data and create a transformed data map
//    public Map<String, String> processHealthcareData(Map<String, String> originalDataMap) {
//        Map<String, String> transformedDataMap = new HashMap<>();
//
//        // Apply the mapping logic here to transform the original data into the new format
//        // For this example, we'll just use a simple mapping scheme
//
//        // Patient Name mapping
//        String patientName = originalDataMap.get("patientName");
//        if(patientName!= null) {
//            transformedDataMap.putIfAbsent("PT_NAME", patientName);
//        }
//
//        // Age mapping
//        String age = originalDataMap.get("age");
//        if(age != null) {
//
//            transformedDataMap.putIfAbsent("PT_AGE", age);
//        }
//
//        // Gender mapping
//        String gender = originalDataMap.get("gender");
//        if(gender != null) {
//            transformedDataMap.putIfAbsent("PT_GENDER", mapGender(gender));
//        }
//
//        // Diagnosis mapping
//        String diagnosis = originalDataMap.get("diagnosis");
//        if(diagnosis != null) {
//            transformedDataMap.putIfAbsent("DIAGNOSIS_DESC", diagnosis);
//        }
//        // Medication mapping
//        String medication = originalDataMap.get("medication");
//        if(medication != null) {
//            transformedDataMap.put("MED_NAME", medication);
//        }
//
//        // Add more healthcare data points mapping here as necessary
//
//        return transformedDataMap;
//    }
//
//    // Helper method to map gender to the desired format
//    public String mapGender(String originalGender) {
//        // For simplicity, let's assume we just convert "Male" to "M" and "Female" to "F"
//        if ("Male".equalsIgnoreCase(originalGender)) {
//            return "M";
//        } else if ("Female".equalsIgnoreCase(originalGender)) {
//            return "F";
//        } else {
//            return "Unknown";
//        }
//    }
//}
//
//class MainTest {
//    @Test
//    public void testProcessHealthcareData_WithCompleteData() {
//
//        Map<String, String> Map = new HashMap<>();
//        Map.put("patientName", "Jeena Ro");
//        Map.put("age", "52");
//        Map.put("gender", "Female");
//        Map.put("diagnosis", "Smart Assiness");
//        Map.put("medication", "buttkick");
//
//        Map<String, String> transformed = new HashMap<>();
//        transformed.put("PT_NAME", "Jeena Ro");
//        transformed.put("PT_AGE", "52");
//        transformed.put("PT_GENDER", "F");
//        transformed.put("DIAGNOSIS_DESC", "Smart Assiness");
//        transformed.put("MED_NAME", "buttkick");
//        HealthcareDataProcessor one = new HealthcareDataProcessor();
//        Map<String, String> actualTransformed = one.processHealthcareData(Map);
//        assertEquals(transformed, actualTransformed);
//    }
//
//    @Test
//    public void testProcessHealthcareData_WithMissingData() {
//        Map<String, String> Map = new HashMap<>();
//        Map.put("patientName", "Jeena Ro");
//        Map.put("age", "52");
//
//        Map<String, String> transformed = new HashMap<>();
//        transformed.put("PT_NAME", "Jeena Ro");
//        transformed.put("PT_AGE", "52");
//
//        HealthcareDataProcessor one = new HealthcareDataProcessor();
//        Map<String, String> actualTransformed = one.processHealthcareData(Map);
//        assertEquals(transformed, actualTransformed);
//    }
//
//    @Test
//    public void testProcessHealthcareData_WithInvalidGender() {
//
//
//        Map<String, String> Map = new HashMap<>();
//        Map.put("patientName", "Jeena Ro");
//        Map.put("age", "52");
//        Map.put("gender", "Female");
//        Map.put("diagnosis", "Smart Assiness");
//        Map.put("medication", "buttkick");
//
//        Map<String, String> transformed = new HashMap<>();
//        transformed.put("PT_NAME", "Jeena Ro");
//        transformed.put("PT_AGE", "52");
//        transformed.put("PT_GENDER", "F");
//        transformed.put("DIAGNOSIS_DESC", "Smart Assiness");
//        transformed.put("MED_NAME", "buttkick");
//        HealthcareDataProcessor one = new HealthcareDataProcessor();
//        Map<String, String> actualTransformed = one.processHealthcareData(Map);
//        assertEquals(transformed, actualTransformed);
//    }
//}