package org.mxhc.iterators;

import org.mxhc.profile.Profile;
import org.mxhc.social_network.Facebook;

import java.util.ArrayList;
import java.util.List;

public class FacebookIterator implements ProfileIterator {
    private final Facebook facebook;
    private final String type;
    private final String email;
    private final List<String> emails = new ArrayList<>();
    private final List<Profile> profiles = new ArrayList<>();
    private int currentPosition = 0;
    
    public FacebookIterator(Facebook facebook, String type, String email) {
        this.facebook = facebook;
        this.type = type;
        this.email = email;
    }
    
    private void lazyLoad() {
        if (emails.isEmpty()) {
            List<String> profiles = facebook.requestProfileFriendsFromFacebook(this.email, this.type);
            for (String profile : profiles) {
                this.emails.add(profile);
                this.profiles.add(null);
            }
        }
    }
    
    @Override
    public boolean hasNext() {
        lazyLoad();
        return currentPosition < emails.size();
    }
    
    @Override
    public Profile getNext() {
        if (!hasNext()) {
            return null;
        }
        
        String friendEmail = emails.get(currentPosition);
        Profile friendProfile = profiles.get(currentPosition);
        if (friendProfile == null) {
            friendProfile = facebook.requestProfileFromFacebook(friendEmail);
            profiles.set(currentPosition, friendProfile);
        }
        currentPosition++;
        return friendProfile;
    }
    
    @Override
    public void reset() {
        currentPosition = 0;
    }
}
