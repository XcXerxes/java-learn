package src.src.learn.generic;

/**
 * 结构中 泛型字母 只能使用在方法中， 不能使用在 全局常量中
 * @param <T>
 */

public interface Comparator<T> {
    void compare(T t);
}
