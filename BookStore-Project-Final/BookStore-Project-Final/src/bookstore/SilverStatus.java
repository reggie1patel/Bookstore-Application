package bookstore;

public class SilverStatus implements State {

    @Override
    public void next(Context c) {
        
        if(c.cust.points >= 1000){
            c.setState(new GoldStatus());
        }
        
    }

    @Override
    public void prev(Context c) {
        System.out.println("No previous state");
    }
    

    @Override
    public String printStatus() {
        return "Silver";
    }
    
}
