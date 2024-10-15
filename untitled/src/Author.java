public class Author {
    private String Name;
    private String Email;
    private char Gender;
    public Author(String Name, String Email, char Gender) {
        this.Name=Name;
        this.Email=Email;
        this.Gender=Gender;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public char getGender() {
        return Gender;
    }

    public void setGender(char gender) {
        Gender = gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", Gender=" + Gender +
                '}';
    }
}
