package Method;

public class Method {
    public static void main(String[] args) {

//        System.out.println(penjumlahan(1,2));
//        nilaiUcapan("yp", 1,2,3,4,5,6,7,8,9,10);

//        SayHello();
//        SayHello("farhan");
//        SayHello("farhan", 23);

        System.out.println(Factorial(5));

    }

    static int penjumlahan(int a, int b){
        return a + b;
    }

    static void nilaiUcapan(String name, int... datas){
        int result = 0;
        for (var data:datas){
            result = result + data;
        }

        var avg = result / datas.length;
        System.out.println("result " + result);
        System.out.println("panjang " + datas.length);
        System.out.println("nilai " + name + " : " + avg);

    }

//    Method overloading
    static void SayHello (){
        System.out.println("Hi There");
    }

    static void SayHello (String name){
        System.out.println("Hi "+ name);
    }

    static void SayHello (String name, int age){
        System.out.println("Hi "+ name + " age: " + age);
    }

    static int Factorial(int number){
        if(number == 1){
            return 1;
        }else{
            return number *  Factorial(number - 1);
        }
    }
}
