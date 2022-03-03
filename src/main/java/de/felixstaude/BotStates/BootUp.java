package de.felixstaude.BotStates;

import de.felixstaude.main.BotMain;

public class BootUp {

    public static void bootBot(){

        BotMain.setActivity(BotState.BOOTUP);
        Online.setOnline();
    }
}
