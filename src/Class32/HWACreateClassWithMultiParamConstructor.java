package Class32;

public class HWACreateClassWithMultiParamConstructor {
    public String investmentId;
    public String investmentName;
    public double initialInvestment;
    public double currentValue;
    public boolean isProfitable;

    public HWACreateClassWithMultiParamConstructor(String id, String name, double initial, double current, boolean isProfitable2) {
        investmentId = id;
        investmentName = name;
        initialInvestment = initial;
        currentValue = current;
        isProfitable = isProfitable2;
    }
    public HWACreateClassWithMultiParamConstructor() {

    }
}
       class Investment2 {
            public static void main(String[]args){
            HWACreateClassWithMultiParamConstructor transaction = new HWACreateClassWithMultiParamConstructor("123 ID", "tesla stocks", 100000.0, 300000.0, true);
        System.out.println(transaction.investmentId);
        System.out.println(transaction.investmentName);
        System.out.println(transaction.initialInvestment);
        System.out.println(transaction.currentValue);
        System.out.println(transaction.isProfitable);
        }
    }


