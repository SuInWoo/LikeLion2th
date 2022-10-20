package course1007.fileparse;

import java.util.List;

/*
    List<T>를 리턴하는 인터페이스를 설계
    T는 구현체에서 바꿀수 있기 때문
 */
public interface DoSomething<T> {
    List<T> work(String str);
}
