package course1006;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    //변경을 막기위해 private로 선언
    private List<String> students;  //초기화를 하지 않으면 add시 에러가 남(NullPointerException)

    public ListExercise(){
        this.students = new ArrayList<>();
        students.add("우수인");

    }

    public List<String> getStudents() {
        return this.students;
    }
}
