package org.mxhc.social_network;

import org.mxhc.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);
    
    ProfileIterator createCoworkersIterator(String profileEmail);
}
