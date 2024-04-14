package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.CountingOut;

    public interface RhymersFactory {
    
        public CountingOut getStandardRhymer();
        
        public CountingOut getFalseRhymer();
        
        public CountingOut getFIFORhymer();
        
        public CountingOut getHanoiRhymer();
        
    }
