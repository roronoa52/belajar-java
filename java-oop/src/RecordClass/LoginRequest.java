package RecordClass;

public record LoginRequest(String username, String password) {

    // constructor untuk record
    public LoginRequest{
        System.out.println("Cunstructor yang pertama kali di panggil");
    }

    public LoginRequest(String username){
        this(username, null);
    }
}
