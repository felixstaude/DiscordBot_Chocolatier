package de.felixstaude.BotStates.States;

import de.felixstaude.BotStates.BotState;
import de.felixstaude.main.BotMain;

public class BootUp {

    public static void bootBot() {
        BotMain.setActivity(BotState.BOOTUP);

        Online.setOnline();
    }
}
