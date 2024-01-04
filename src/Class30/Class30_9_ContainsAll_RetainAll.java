package Class30;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Class30_9_ContainsAll_RetainAll {
    public static void main(String[] args) {
//        Arrays.asList(arrVar)
//        int num[] = {12, 4,5, 6,7}
//        Arrays.asList(12,3,5,6,7);
        Set<Integer> nums1 = new HashSet<>(Arrays.asList(12, 3, 5, 6, 7, 2));
        Set<Integer> nums2 = new HashSet<>(Arrays.asList(2, 5, 20));
        boolean result = nums1.containsAll(nums2);
        System.out.println(result);

        Set<String> invitedSpeakers = new HashSet<>(Arrays.asList("Elon", "Steve", "Jeff", "Michelle"));
        Set<String> registeredSpeakers = new HashSet<>(Arrays.asList("Michelle", "Jeff", "Tatiana"));
        if (invitedSpeakers.containsAll(registeredSpeakers)) {
            System.out.println("Ready to send all registered speakers onboarding docs");
        } else {
            System.out.println("Someone is trying to sneak in. Please, double check all registered speakers and remove " +
                    "the ones who are not invited");

            for (String var : registeredSpeakers) {
                if (!invitedSpeakers.contains(var)) {
                    System.out.println(var + " is trying to sneak in");
                    System.out.println("removing " + var);
                    //registeredSpeakers.remove(var);

                }
            }
        }
        System.out.println(registeredSpeakers);
        System.out.println("---------------------");

        Set<String> invitedSpeakers1 = new HashSet<>(Arrays.asList("Elon", "Steve", "Jeff", "Michelle"));
        Set<String> registeredSpeakers1= new HashSet<>(Arrays.asList("Michelle", "Jeff", "Tatiana"));
        if (invitedSpeakers.containsAll(registeredSpeakers)){
            System.out.println("2 - Ready to send all registered speakers onboarding docs");

        }else{
            registeredSpeakers1.retainAll(invitedSpeakers1);//common elem in both sets
        }
        System.out.println(registeredSpeakers1);
    }
}