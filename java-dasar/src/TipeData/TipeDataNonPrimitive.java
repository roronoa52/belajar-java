package TipeData;

public class TipeDataNonPrimitive {
    public static void main(String[] args) {

//        Merupakan tipe data non primitive
        Integer iniInteger = 10;
        Long iniInt = 1000L;
        System.out.println(iniInteger);
        System.out.println(iniInt);

//        Melakukan konversi ke tipe data primitive

        Integer iniInt2 = 10;
        int iniInt1 = iniInt2;

        byte iniByte = iniInt2.byteValue();


    }
}
