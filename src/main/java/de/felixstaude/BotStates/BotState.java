package de.felixstaude.BotStates;

import net.dv8tion.jda.api.OnlineStatus;

public enum BotState {
    BOOTUP("BOOT UP"),
    ONLINE("ONLINE"),
    SHUTDOWN("SHUTDOWN"),
    OFFLINE("OFFLINE"),
    MAINTENANCE("MAINTENANCE");

    public final String label;

    private BotState(String label) {
        this.label = label;
    }
}
