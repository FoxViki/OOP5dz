package Service;

import Data.Student;
import Data.GroupLearn;
import Data.Teacher;
import java.util.List;

public class GroupLearnService {
    public GroupLearn createGroupLearn (Teacher teacher, List<Student> studentsList) {
        return new GroupLearn(teacher, studentsList);
    }
}