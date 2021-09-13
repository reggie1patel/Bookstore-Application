package bookstore;

public class Context {

    Customer cust;
    private State state = new SilverStatus();

    public Context(Customer cust) {
        this.cust = cust;
    }

    public void nextState() {
        state.next(this);
    }
    
    public void previousState() {
        state.prev(this);
    }

    public String printStatus() {
        return state.printStatus();
    }

    public void setState(State state) {
        this.state = state;
    }
}
