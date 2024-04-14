package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.CountingOut;

    public interface RhymersFactory {
    
        public CountingOut GetStandardRhymer();
        
        public CountingOut GetFalseRhymer();
        
        public CountingOut GetFIFORhymer();
        
        public CountingOut GetHanoiRhymer();
        
    }
