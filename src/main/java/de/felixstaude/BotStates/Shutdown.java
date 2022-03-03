package de.felixstaude.BotStates;

import de.felixstaude.main.BotMain;

public class Shutdown {

    public static void shutdownBot(){

        BotMain.setActivity(BotState.SHUTDOWN);
        Offline.setOffline();
    }
}
