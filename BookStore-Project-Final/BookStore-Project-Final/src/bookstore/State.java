package bookstore;

public interface State {
    
    void next(Context c);
    void prev(Context c);
    String printStatus();
    
}
