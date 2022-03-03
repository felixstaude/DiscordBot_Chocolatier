package de.felixstaude.BotStates.States;

import de.felixstaude.BotStates.BotState;
import de.felixstaude.main.BotMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Online {

    public static void setOnline(){

        /*while(true){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                if(reader.readLine().equalsIgnoreCase("shutdown")) {
                    System.out.println("Exit");
                    reader.close();
                    Shutdown.shutdownBot();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
         }*/

        BotMain.setActivity(BotState.ONLINE);
    }
}
