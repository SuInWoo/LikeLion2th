package course1005;

public class UserDao {

    public void plus(int first, int second){
        System.out.println(first + second);

    }
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        userDao.plus(10, 20);
    }
}
