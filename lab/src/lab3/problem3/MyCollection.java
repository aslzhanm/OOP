package lab3.problem3;

public interface MyCollection<T> {

    boolean add(T element);

    boolean remove(T element);

    boolean contains(T element);

    int size();

    void clear();

    boolean isEmpty();
}