package RecordClass;

public class Main {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("yp", "123456778");

        System.out.println(loginRequest);
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());

    }
}
