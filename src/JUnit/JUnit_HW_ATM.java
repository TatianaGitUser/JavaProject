//package JUnit;
//
//public class JUnit_HW_ATM {import java.util.ArrayList;
//import java.util.List;
//import org.junit.jupiter.api.Test;
//
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//    class ATM {
//        private String location;
//        private String city;
//        private String zipCode;
//
//        public ATM(String location, String city, String zipCode) {
//            this.location = location;
//            this.city = city;
//            this.zipCode = zipCode;
//        }
//
//        public String getLocation() {
//            return location;
//        }
//        public void setLocation(String location){
//            this.location = location;
//        }
//
//        public String getCity() {
//            return city;
//        }
//        public void setCity(String city){
//            this.city = city;
//        }
//
//        public String getZipCode() {
//            return zipCode;
//        }
//        public void setZipCode(String zipCode){
//            this.zipCode = zipCode;
//        }
//
//        public static List<ATM> findATMsNearZipCode(String zipCode, List<ATM> allATMs) {
//            List<ATM> atmsNearZipCode = new ArrayList<>();
//
//            for (ATM atm : allATMs) {
//                if (atm.getZipCode().equals(zipCode)) {
//                    atmsNearZipCode.add(atm);
//                }
//            }
//
//            if(atmsNearZipCode.isEmpty()){
//                System.out.println("No Matching ATMs found");
//            }
//            else if(atmsNearZipCode.size() == 1) {
//                System.out.println("1 matching atm found");
//            }
//            else if(atmsNearZipCode.size() > 1) {
//                System.out.println("multiple matching atms found");
//            }
//            else if(allATMs.isEmpty()){
//                System.out.println("Empty ATM list provided");
//            }
//
//            return atmsNearZipCode;
//        }
//    }
//
//
//
//    class MainTest {
//        @Test
//        public void testFindATMsNearZipCode_SingleMatchingATM(){
//            ATM VirgniaBeach = new ATM("Virginia", "Virginia Beach", "23454");
//
//            ATM Suffolk = new ATM("Virginia", "Suffolk", "23434");
//
//            ATM Norfolk = new ATM("Virginia", "Norfolk", "23518");
//
//            List<ATM> allATMs = new ArrayList<>();
//
//            allATMs.add(VirgniaBeach);
//            allATMs.add(Suffolk);
//            allATMs.add(Norfolk);
//            List<ATM> result = ATM.findATMsNearZipCode("23434", allATMs);
//
//            assertEquals(1, result.size());
//
//        }
//        @Test
//        public void testFindATMsNearZipCode_MultipleMatchingATMs(){
//            ATM VirgniaBeach = new ATM("Virginia", "Virginia Beach", "23454");
//            ATM MainStr = new ATM ("Virginia", "Suffolk", "23434");
//            ATM Suffolk = new ATM("Virginia", "Suffolk", "23434");
//
//            ATM Norfolk = new ATM("Virginia", "Norfolk", "23518");
//
//            List<ATM> allATMs = new ArrayList<>();
//            allATMs.add(MainStr);
//            allATMs.add(VirgniaBeach);
//            allATMs.add(Suffolk);
//            allATMs.add(Norfolk);
//            List<ATM> result = ATM.findATMsNearZipCode("23434", allATMs);
//
//            assertEquals(2, result.size());
//
//        }
//        @Test
//        public void testFindATMsNearZipCode_NoMatchingATMs(){
//            ATM VirgniaBeach = new ATM("Virginia", "Virginia Beach", "23454");
//            ATM MainStr = new ATM ("Virginia", "Suffolk", "23434");
//            ATM Suffolk = new ATM("Virginia", "Suffolk", "23434");
//
//            ATM Norfolk = new ATM("Virginia", "Norfolk", "23518");
//
//            List<ATM> allATMs = new ArrayList<>();
//            allATMs.add(MainStr);
//            allATMs.add(VirgniaBeach);
//            allATMs.add(Suffolk);
//            allATMs.add(Norfolk);
//            List<ATM> result = ATM.findATMsNearZipCode("23451", allATMs);
//
//            assertEquals(0, result.size());
//
//        }
//        @Test
//        public void testFindATMsNearZipCode_EmptyATMList(){
//            ATM VirgniaBeach = new ATM("Virginia", "Virginia Beach", "23454");
//            ATM MainStr = new ATM ("Virginia", "Suffolk", "23434");
//            ATM Suffolk = new ATM("Virginia", "Suffolk", "23434");
//
//            ATM Norfolk = new ATM("Virginia", "Norfolk", "23518");
//
//            List<ATM> allATMs = new ArrayList<>();
//
//            List<ATM> result = ATM.findATMsNearZipCode("23451", allATMs);
//
//            assertEquals(0, result.size());
//
//        }
//    }
//
//}
