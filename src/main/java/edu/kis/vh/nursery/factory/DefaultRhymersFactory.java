package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.CountingOut;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.RhymersFactory;

public class DefaultRhymersFactory implements RhymersFactory {

    @Override
    public CountingOut getStandardRhymer() {
        return new CountingOut();
    }

    @Override
    public CountingOut getFalseRhymer() {
        return new CountingOut();
    }

    @Override
    public CountingOut getFIFORhymer() {
        return new FIFORhymer();
    }

    @Override
    public CountingOut getHanoiRhymer() {
        return new HanoiRhymer();
    }

}
