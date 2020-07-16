package Service;
import org.springframework.stereotype.Component;
import vo.User;
import java.util.*;
@Component

public class UserServiceBaseimpl {
    private static final Map<Integer, User> usermap= new HashMap<Integer, User>();
    private static int index=3;
    static{
    User a=new User(1,"Gayathri","Amirtharaj","Gayathri Amirtharaj","gayathriamirtharaj@gmail.com","123456");
    usermap.put(1,a);
    User b=new User(2,"Anjana","Trivedi","Anjana Trivedi","sonu@gmail.com","arnav");
    usermap.put(2,b);
    User c=new User(3,"Vaishnavi","Ashokan","Vaishnavi ashokan","vaishu@gmail.com","vaishu");
    usermap.put(3,c);}
//showing the user values
    public static List<User> showUser() {
        return new ArrayList<User>(usermap.values());
    }
//creating a new user
    public static User create(User u)
    {
        index+=index;
        u.setId(index);
        usermap.put(index,u);
        return u;
    }
//deleting the user
    public static User delete(int id)
    {
        return usermap.remove(id);
    }
//updating the user
    public static User update(int id, User u)
    {
        usermap.put(id, u);
        return u;
    }





}
