package bookstore;


public class GoldStatus implements State {

    @Override
    public void next(Context c){
        
        if(c.cust.points < 1000){
             c.setState(new SilverStatus());
        }
        
    }

    @Override
    public void prev(Context c) {
        c.setState(new SilverStatus());
    }
    
    @Override
    public String printStatus() {
        return "Gold";
    }

    
}
