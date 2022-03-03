package de.felixstaude.BotStates.States;

import de.felixstaude.BotStates.BotState;
import de.felixstaude.main.BotMain;
import net.dv8tion.jda.api.JDA;

import java.io.IOException;

public class Shutdown {

    public static void shutdownBot() throws IOException {
        BotMain.setActivity(BotState.SHUTDOWN);
        BotMain.shardMan.shutdown();
        System.exit(1);
    }
}
