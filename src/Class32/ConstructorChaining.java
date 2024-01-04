package Class32;

public class ConstructorChaining {
    public static void main(String[] args) {
        StudentCheckingAccount sc = new StudentCheckingAccount("Elon Musk", 1000000.00,
                "24742354343534", 55164574);
        StudentCheckingAccount sc2 = new StudentCheckingAccount("Bill Gates",
                "4245245757", 454554);
        System.out.println(sc2.routingNum);
        System.out.println(sc2.studentName);
        System.out.println(sc2.balance);

        StudentCheckingAccount sc3 = new StudentCheckingAccount("Beyonce", "09090765564");
        System.out.println(sc3.studentName);
        System.out.println(sc3.routingNum); // used default value


    }
}
class StudentCheckingAccount {
    public String studentName;
    public double balance;
    public String accountNum;
    public int routingNum;

    public StudentCheckingAccount(String studentName, double balance,
                                  String accountNum, int routingNum){
        this.studentName = studentName;
        this.balance = balance;
        this.accountNum = accountNum;
        this.routingNum = routingNum;
    }
//    in programming having duplicate code is a bad practice, we should avoid it
//    public StudentCheckingAccount(String studentName, String accountNum, int routingNum){
//        this.studentName = studentName;
//        this.accountNum = accountNum;
//        this.routingNum = routingNum;
//    }


//    this() -> this with parenthesis
//    *what is a difference between "this." and "this()" in  Java?
//    "this()" keyword helps you access other constructors within same class
//    and use them
//    this() keyword enables you to use constructor chaining
//    constructor chaining - is calling one constructor from another

//    ctrl+left mouse takes you to original constructor location in your code
    public StudentCheckingAccount(String studentName, String accountNum, int routingNum){
//this("John Doe", -1, "00000000000000000", 458447522);
//^hardcode^
        this(studentName, 0.0, accountNum, routingNum);

    }
//    1235678978 - default routing num
    public StudentCheckingAccount(String studentName, String accountNum){
        this(studentName, accountNum, 1235678978);
    }
}
