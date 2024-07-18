package Error;

import RecordClass.LoginRequest;

public class Main {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest(null, "tes");
        try {

            ValidationUtil.validate(loginRequest);

        }catch (ValidationExecption | NullPointerException e){
            System.out.println(e.getMessage());
        }

    }
}
