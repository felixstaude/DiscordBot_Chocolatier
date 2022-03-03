package de.felixstaude.BotStates;

import de.felixstaude.main.BotMain;

public class Offline {

    public static void setOffline(){

        BotMain.setActivity(BotState.OFFLINE);
    }
}
