public class Customer {

    private String firstName;
    private String lastName;
    private String userName;
    private int id;
    private static int counter = 0;



    Customer (String firstName, String lastName, String userName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        counter++;
        this.id = counter;
    }

    public String getFirstName () {
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName (){
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getUserName () {
        return userName;
    }
    public void setUserName(String UserName){
        this.userName = userName;
    }
    public int getId(){
        return id;
    }
    public String toString(){
        return "Kunden: " + firstName + " " + lastName + "; " + "Brugenavn: " + userName;

    }
}
