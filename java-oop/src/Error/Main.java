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

        LoginRequest loginRequest2 = new LoginRequest("", "tes");
        ValidationUtil.Runtimevalidate(loginRequest2);

        DatabaseConnection(null, null);

    }

    public static void DatabaseConnection(String username, String password){
        if (username == null || password == null){
            throw new DatabaseException("Database tidak bisa terkoneksi");
        }
    }
}
