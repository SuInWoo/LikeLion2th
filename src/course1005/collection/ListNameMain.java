package course1005.collection;

import java.util.List;

public class ListNameMain {
    public static void main(String[] args) {
        LikeLion2th likeLion2th = new LikeLion2th();
        List<String> students = likeLion2th.getStudentList();
        List<Student> studentObjs = likeLion2th.getStudentObjsList();

        for (String student : students) {
            System.out.println(student);
        }

        for (Student studentObj : studentObjs) {
            System.out.println(studentObj);
        }

        System.out.println(students.size());
        System.out.println(studentObjs.size());
    }
}