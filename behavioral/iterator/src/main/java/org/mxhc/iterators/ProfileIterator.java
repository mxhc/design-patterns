package org.mxhc.iterators;

import org.mxhc.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();
    
    Profile getNext();
    
    void reset();
}
