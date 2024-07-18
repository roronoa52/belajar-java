package Error;

import RecordClass.LoginRequest;

public class ValidationUtil {

    public static  void validate(LoginRequest loginRequest) throws ValidationExecption, NullPointerException{

        if(loginRequest.username() == null){
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationExecption("Username is blank");
        }

    }

    // runtime exception tidak wajib try catch
    public static  void Runtimevalidate(LoginRequest loginRequest){

        if(loginRequest.username() == null){
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankException("Username is blank");
        }

    }

}
