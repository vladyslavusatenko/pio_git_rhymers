package edu.kis.vh.nursery;

public class FIFORhymer extends CountingOut {

    public CountingOut temp = new CountingOut();
    
    @Override
    public int countOut() {
        while (!callCheck())
            
        temp.countIn(super.countOut());
        
        int ret = temp.countOut();
        
        while (!temp.callCheck())
            
        countIn(temp.countOut());
        
        return ret;
    }
}
