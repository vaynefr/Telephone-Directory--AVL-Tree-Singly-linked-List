
package phonebook;



public class Person {   
    private String name;
    private String number;
    private String email;

    Person (){ }
    
    String getName(){
        return this.name;
    }
    
    void setName(String name){
        this.name = name;
    }
    
    String getNumber(){
        return this.number;
    }
    
    void setNumber(String number){
        this.number = number;
    }
    
    String getEmail() {
        return this.email;
    }
    
    void setEmail(String email) {
        this.email = email;
    }
    
    
    @Override
    public String toString() {
        return "Name : " + this.name + ", " + "Number : " + this.number + ", " + "Email : " + this.email;
    }
}
