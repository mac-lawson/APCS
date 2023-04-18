/**
 * Contact.java
 *
 * @author Mac Lawson
 * @version 2/07/23
 */
public class Contact {
    private String name;
    private String relation;
    private String birthday;
    private String phone;
    private String email;
    
    public Contact(String name, String relation, String birthday, String phone, String email) {
        this.name = name;
        this.relation = relation;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
    }
    
    public String getName() {
        return name;
    }
    
    public String getRelation() {
        return relation;
    }
    
    public String getBirthday() {
        return birthday;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String toString() {
        return "Name: " + name + "\nRelation: " + relation + "\nBirthday: " + birthday + "\nPhone: " + phone + "\nEmail: " + email;
    }
}
