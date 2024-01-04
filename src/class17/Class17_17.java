package class17;

public class Class17_17 {
    public static void main(String[] args) {
        String str = login("Hello@wedevx.co","Hello123");
        String str2 = login("Hello@wedevx.co","ABC123$$");
        System.out.println(str);
        System.out.println(str2);

    }public static String login(String userName, String password){
        if (userName.equals("Hello@wedevx.co")&&password.equals("ABC123$$")){
            return "welcome "+ userName;
        }else{
            return "invalid user name or password.";
        }
    }
}
