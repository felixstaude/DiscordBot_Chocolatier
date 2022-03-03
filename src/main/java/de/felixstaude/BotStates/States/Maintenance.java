package de.felixstaude.BotStates.States;

import de.felixstaude.BotStates.BotState;
import de.felixstaude.main.BotMain;

public class Maintenance {

    public static void maintenanceBot(){

        BotMain.setActivity(BotState.MAINTENANCE);
    }
}
