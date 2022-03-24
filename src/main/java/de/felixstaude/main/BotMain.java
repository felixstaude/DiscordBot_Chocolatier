package de.felixstaude.main;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class BotMain {

    public static void main(String[] args) throws LoginException {
        JDABuilder builder = JDABuilder.createDefault("OTQ5MDA2ODk2NTUwMDAyNzQ4.YiEFiw.Zt0qeUwzpfryyMDnoCJ9AxGvwG8");
        builder.build();
    }

}
