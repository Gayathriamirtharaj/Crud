package vo;
public class User {
    private Integer id;
    private Long index;
    private String firstName;
    private String lastName;
    private String fullName;
    private String email;
    private String password;
    //private static List<String> roles=new ArrayList<>();
    public User(){}
    public User( int id,String firstName,String lastName,String fullName,String email,String password)
    {
        this.id=id;
       // this.index=index;
        this.firstName=firstName;
        this.lastName=lastName;
        this.fullName=fullName;
        this.email=email;
        this.password=password;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return id;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

  //  public static void setRoles(List<String> roles) {
    //    User.roles = roles;
    //}

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

   /* public void setIndex(Long index) {
        this.index=index;
    }

    public Long getIndex() {
        return index;
    }*/
    //public static List<String> getRoles() {
      //  return roles;
    //}
}
