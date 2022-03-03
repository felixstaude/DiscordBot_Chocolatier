package de.felixstaude.BotStates;

public enum BotState {
    BOOTUP("BOOT UP"),
    ONLINE("ONLINE"),
    SHUTDOWN("SHUTDOWN"),
    MAINTENANCE("MAINTENANCE");

    public final String label;

    private BotState(String label) {
        this.label = label;
    }
}
