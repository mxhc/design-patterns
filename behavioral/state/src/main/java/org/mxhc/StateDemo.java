package org.mxhc;

import org.mxhc.ui.Player;
import org.mxhc.ui.UI;

public class StateDemo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}