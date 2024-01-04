package Class36;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
method1();
    }
    public static void method1(){
        try{
            System.out.println("Try strart");
            String var = null;
            var.toLowerCase();//supposed to throw nullPointerException
            System.out.println("Done with start");

            Class.forName("jfjfjf"); //misspelled class name etc
            System.out.println("Done with class for Name");

double result = 10/0;

        }catch(ClassNotFoundException e){
            System.out.println("Couldn't find the class");

        }catch (NullPointerException e){
            System.out.println("Second catch");

            System.out.println(e);
        }catch(Exception e){  //Exception is a parent class of all the unchecked exceptions
            System.out.println(e);
        }

    }
}
