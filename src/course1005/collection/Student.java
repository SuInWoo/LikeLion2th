package course1005.collection;

public class Student {
    private int classNo;
    private String name;
    private String gitRepositoryAddress;

    public Student(int classNo, String name, String gitRepositoryAddress) {
        this.classNo = classNo;
        this.name = name;
        this.gitRepositoryAddress = gitRepositoryAddress;
    }

    /**
     * 객체가 가진 정보를 문자열로 만들어 출력하기 위해 오버라이드
     * @return 출력 형태
     */
    @Override
    public String toString() {
        return "소속 : "+ classNo + "반, 이름 : " + name + ", repAddress : " + gitRepositoryAddress;
    }
}