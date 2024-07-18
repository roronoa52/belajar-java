package StaticKeyword;

public class MathUtil {

    public static int sum(int... datas){

        int total = 0;
        for(var data:datas){

            total = total + data;

        }

        return total;
    }

}
