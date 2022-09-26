package org.mxhc;

import org.mxhc.devices.Device;
import org.mxhc.devices.Radio;
import org.mxhc.devices.Tv;
import org.mxhc.remotes.AdvancedRemote;
import org.mxhc.remotes.BasicRemote;
import org.mxhc.remotes.Remote;

public class BridgeDemo {
    public static void main(String[] args) {
        Device tv = new Tv();
        Radio radio = new Radio();
    
        Remote remote = new BasicRemote(radio);
        AdvancedRemote advancedRemote = new AdvancedRemote(tv);
        
        remote.power(); remote.channelUp(); remote.volumeUp(); radio.printStatus();
        
        advancedRemote.power(); advancedRemote.mute(); tv.printStatus();
    }
}
