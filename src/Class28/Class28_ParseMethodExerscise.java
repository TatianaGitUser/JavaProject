package Class28;

public class Class28_ParseMethodExerscise {
    public static void main(String[] args) {
        String values = "Acme Inc.,123456.78,7890.12,3456.78\n"+
                "Globex Corporation,987654.32,5432.10,2109.87\n"+
                "Initech Industries,456789.01,1234.56,7890.12";
//        calculate total revenue of 3 companies
//        revenue is the value between first and second commas


        int indexOfFirstComma = values.indexOf(",");
        int indexOfSecondComma = values.indexOf(",", indexOfFirstComma+1);
        System.out.println(indexOfFirstComma);
        System.out.println(indexOfSecondComma);

        String firstCompanyRevenue = values.substring(indexOfFirstComma+1, indexOfSecondComma);
       double firstCompRev =  Double.parseDouble(firstCompanyRevenue);
System.out.println(firstCompanyRevenue);
System.out.println(firstCompRev);
System.out.println("--------------------------------");

int indexOfFirstNewLine = values.indexOf("\n");
int secondCompanyFirstComma = values.indexOf(",", indexOfFirstNewLine);
int secondCompanySecondComma = values.indexOf(",", secondCompanyFirstComma+1);
String secondCompanyRevenue = values.substring(secondCompanyFirstComma+1, secondCompanySecondComma);
System.out.println(secondCompanyRevenue);
double secCompRev = Double.parseDouble(secondCompanyRevenue);
System.out.println(secCompRev);
System.out.println("---------------------");

int indexOfSecNewLine = values.indexOf("\n", indexOfFirstNewLine+1);
int indexOfFirstCommaOfThirdComp = values.indexOf(",", indexOfSecNewLine);
int thirdCompSecondComma = values.indexOf(",", indexOfFirstCommaOfThirdComp+1);
String thirdCompRevsubStr = values.substring(indexOfFirstCommaOfThirdComp+1, thirdCompSecondComma);
double thirdCompRev = Double.parseDouble(thirdCompRevsubStr);
System.out.println(thirdCompRev);

System.out.println("---------------------");
System.out.println(firstCompRev+secCompRev+thirdCompRev);
    }
}
