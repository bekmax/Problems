package crackingthecodinginterview.chapter3.data;

public interface Stack<T>{

    void push(T item);
    T pop();
    T peek();
    boolean isEmpty();
    default T min(){
      return null;
    };
}
