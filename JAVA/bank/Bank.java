package bank;
class Account {
    public String name;
    protected String email;
    private String password;
    

    public String getPassword(){
        return this.password;
    }
    // public String getPassword(){
    //     setPassword(randomPassword);
    //     return this.password;
    // }

    private String setPassword(String pass){
        this.password = pass;
        return pass;
    }
    // public String setPassword(String pass){
    //     this.password = pass;
    //     return pass;
    // }
}
public class Bank {
public static void main(String[] args) {
    Account account1 = new Account();
    account1.name = "John Doe";
    account1.email = "john.doe@example.com";
    // account1.setPassword("password");
    System.out.println(account1.getPassword());
}
}

