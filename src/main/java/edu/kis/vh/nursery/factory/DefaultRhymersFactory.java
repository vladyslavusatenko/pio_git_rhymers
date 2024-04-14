package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.CountingOut;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.RhymersFactory;

public class DefaultRhymersFactory implements RhymersFactory {

    @Override
    public CountingOut GetStandardRhymer() {
        return new CountingOut();
    }

    @Override
    public CountingOut GetFalseRhymer() {
        return new CountingOut();
    }

    @Override
    public CountingOut GetFIFORhymer() {
        return new FIFORhymer();
    }

    @Override
    public CountingOut GetHanoiRhymer() {
        return new HanoiRhymer();
    }

}
