package Loop;

public class While {
    public static void main(String[] args) {

        var counter = 1;
        while (true){

            System.out.println("perulangan ke " + counter);
            counter++;
            if (counter == 10){
                break;
            }
        }

    }
}
