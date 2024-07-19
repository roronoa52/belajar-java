package belajar.testing;

public class Calculator {

    public Integer add(Integer first, Integer second){
        return first + second;
    }

    public Integer divide(Integer first, Integer second){
        if(first == 0 || second == 0){
            throw new IllegalArgumentException("Cannot divde by zero");
        }
        return first / second;
    }

}
