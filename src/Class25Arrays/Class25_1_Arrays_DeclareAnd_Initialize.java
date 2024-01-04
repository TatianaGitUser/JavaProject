package Class25Arrays;

public class Class25_1_Arrays_DeclareAnd_Initialize {
    public static void main(String[] args) {
//        declare int array

        int [] variable;
        int variable2 [];
        int []variable3;

//        declore and initialize an array
//        whatever you put inside Square brackets after the "new" keyword ->
//        you are defining the size of an array -> how many rooms will this array have

//        Array has a fixed (static) size
        int [] arrayVar = new int[5];

//        use literal values to initialize: ({}-literal values storage)
        int [] arrVar2 = {4,3,2,7}; //created an array with size 4 (4 values separated by a comma)

//        the values inside an array are called ELEMENTS
//        since i have 5 elements in the array initialization,
//        the size of this array is 5
//        size of an array is called length.

        int [] arrVar3 = new int[]{2,5,8,3,3};//size of this array is 5
//        you must have brackets, but can leave 'em empty only if you give literal value ({value})
    }
}
