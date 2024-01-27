package Service;

import java.util.ArrayList;
import java.util.List;
import Data.Student;
import Data.Teacher;
import Data.Type;
import Data.User;



public class DataService {
    private List<User> usersList = new ArrayList<>();

    public void create (Type type, String secondName, String firstName, String lastName) {
        User user = null;
        int id = getLastId(type);
        if (Type.STUDENT == type) {
            user = new Student(secondName, firstName, lastName, id);
        }
        if (Type.TEACHER == type) {
            user = new Teacher(secondName, firstName, lastName, id);
        }
        usersList.add(user);
    }

    private int getLastId(Type type) {
        boolean isStudent = Type.STUDENT == type;
        int lastId = 1;
        for (User user: usersList) {
            if (user instanceof Student && isStudent) {
                lastId = ((Student) user).getStudentId() + 1;
            }
            if (user instanceof Teacher && !isStudent) {
                lastId = ((Teacher) user).getTeacherId() + 1;
            }
        }
        return lastId;
    }

    public List<User> getUsersList() {
        return usersList;
    }
}