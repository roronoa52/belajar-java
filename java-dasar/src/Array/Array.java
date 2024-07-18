package Array;

public class Array {
    public static void main(String[] args) {

//        Cara pertama memasukan array
        String[] StringArray = new String[3];
        StringArray[0] = "Farhan";
        StringArray[1] = "Yudha";
        StringArray[2] = "Pratama";
        System.out.println(StringArray[0]);

//        Cara keedua memasukan array
        Integer[] StringArray2 = {
                1, 2, 3
        };
        System.out.println(StringArray2[0]);

//        Array di dalam array
        Integer[][] StringArray3 = {
                {1,2,3},
                {4,5,6}
        };
        System.out.println(StringArray3[0][2]);

        System.out.println(StringArray.length);
    }
}
