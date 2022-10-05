package course1005.collection;

import java.util.List;

public class LikeLion2th {

    private ListName names = new ListName();
    private List<String> students;
    private List<Student> studentObjs;

    public LikeLion2th() {
        students = names.getNameList();
        studentObjs = names.getStudentObjs();
    }

    public List<Student> getStudentObjsList() {
        return this.studentObjs;
    }

    public List<String> getStudentList() {
        return this.students;
    }
}