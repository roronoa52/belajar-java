package Loop;

public class For {
    public static void main(String[] args) {

        for(var counter = 1; counter <= 10; counter++){
            if(counter % 2 == 0){
                continue;
            }

            System.out.println(counter);
        }

    }
}
