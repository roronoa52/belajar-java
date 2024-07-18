package GenericSingleParameter;

import GenericMultipleParameter.Pair;

public class Main {
    public static void main(String[] args) {

        MyData<String> stringData = new MyData<String>("Yp");
        System.out.println(stringData.getData());

    }
}
