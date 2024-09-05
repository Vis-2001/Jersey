package spring.api0;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    public List<User> getAllUser() {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1, "Madhu", "Teacher", "madhu@gmail.com"));
        userList.add(new User(2, "Sri", "Student", "sri1@gamil.com"));
        userList.add(new User(3, "Haritha", "Student", "haritha12@gamil.com"));
        userList.add(new User(4, "Priya", "Teacher", "priya@gamil.com"));
        userList.add(new User(5, "Poorna", "Student", "poorna@gamil.com"));
        userList.add(new User(6, "Dharani", "Teacher", "dharani12@gamil.com"));
        return userList;
    }
}

