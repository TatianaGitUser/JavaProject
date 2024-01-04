package class17;

public class Class17_16 {
    public static void main(String[] args) {
       boolean scenario1 = isEligibleForDiscount(200, false);
    System.out.println(scenario1);
    }
    public static boolean isEligibleForDiscount(double amountSpent, boolean isMembershipMember){
        if (amountSpent>100||isMembershipMember){
            return true;

        }else
            return false;
    }
}
