package spring.api0;


public class User {
    private int id;
    private String name;
    private String profession;
    private String email;

    // Default constructor
    public User() {}

    // 4-argument constructor
    public User(int id, String name, String profession, String email) {
        this.id = id;
        this.name = name;
        this.profession = profession;
        this.email = email;
    }

    // Getters and Setters
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
