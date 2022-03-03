package de.felixstaude.main;

import de.felixstaude.BotStates.BotState;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class BotMain {

    public static JDA shardMan;
    public static JDABuilder builder;

    public static void main(String[] args) throws LoginException {

        builder = JDABuilder.createDefault("OTQ5MDA2ODk2NTUwMDAyNzQ4.YiEFiw.hG5tUL910s_J-_e627C_OcLj8EU");
        shardMan = builder.build();

    }

    public static void setActivity(BotState state) {
        switch (state){
            case ONLINE:
                builder.setStatus(OnlineStatus.ONLINE);
                builder.setActivity(Activity.playing(BotState.ONLINE.label));

                break;
            case BOOTUP:
                builder.setStatus(OnlineStatus.IDLE);
                builder.setActivity(Activity.playing(BotState.BOOTUP.label));

                break;
            case SHUTDOWN:
                builder.setStatus(OnlineStatus.DO_NOT_DISTURB);
                builder.setActivity(Activity.playing(BotState.SHUTDOWN.label));
                break;
            case MAINTENANCE:
                builder.setStatus(OnlineStatus.DO_NOT_DISTURB);
                builder.setActivity(Activity.playing(BotState.MAINTENANCE.label));
                break;
        }
    }

}
