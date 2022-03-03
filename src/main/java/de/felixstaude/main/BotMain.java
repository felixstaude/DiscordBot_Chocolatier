package de.felixstaude.main;

import de.felixstaude.BotStates.BootUp;
import de.felixstaude.BotStates.BotState;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class BotMain {
    static BotState botState = BotState.BOOTUP;
    public static JDABuilder builder = JDABuilder.createDefault("OTQ5MDA2ODk2NTUwMDAyNzQ4.YiEFiw.3TuZ7DD6DVhGlFwhtrdcgk3RX6M");

    public static void main(String[] args) throws LoginException, InterruptedException {
        BootUp.bootBot();
    }

    public static void setActivity(BotState state) {
        JDA jda = null;
        try {
            jda = builder.build();
        } catch (LoginException e) {
            e.printStackTrace();
        }
        switch (state){
            case ONLINE:
                botState = BotState.ONLINE;
                jda.getPresence().setStatus(OnlineStatus.ONLINE);
                jda.getPresence().setActivity(Activity.playing(BotState.ONLINE.label));
                break;
            case BOOTUP:
                botState = BotState.BOOTUP;
                jda.getPresence().setStatus(OnlineStatus.IDLE);
                jda.getPresence().setActivity(Activity.playing(BotState.BOOTUP.label));
                break;
            case OFFLINE:
                botState = BotState.OFFLINE;
                jda.getPresence().setStatus(OnlineStatus.OFFLINE);
                jda.getPresence().setActivity(Activity.playing(BotState.OFFLINE.label));
                break;
            case SHUTDOWN:
                botState = BotState.SHUTDOWN;
                jda.getPresence().setStatus(OnlineStatus.DO_NOT_DISTURB);
                jda.getPresence().setActivity(Activity.playing(BotState.SHUTDOWN.label));
                break;
            case MAINTENANCE:
                botState = BotState.MAINTENANCE;
                jda.getPresence().setStatus(OnlineStatus.DO_NOT_DISTURB);
                jda.getPresence().setActivity(Activity.playing(BotState.MAINTENANCE.label));
                break;
        }
    }

}
