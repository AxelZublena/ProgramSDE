package com.hz.Facade;

import com.hz.ConsoleReader;
import com.hz.ConsoleWriter;
import com.hz.Template.GangnamStlyeSong;
import com.hz.Template.ItsMyLifeSong;
import com.hz.Template.LoseYourselfSong;
import com.hz.Template.Song;

public class Radio {
    ConsoleReader reader = new ConsoleReader();
    Song song = null;

    public void on(ConsoleWriter writer) {

        writer.printText("\nChoose a song for the radio:\n" +
                "1)Gangnam Style\n" +
                "2)It's my life\n" +
                "3)Lose Yourself");

        int choice = Integer.parseInt(reader.readLine());

        //Depending on the answer, it shows information about the selected song
        if (choice == 1) {
            song = new GangnamStlyeSong();
        } else if(choice == 2){
            song = new ItsMyLifeSong();
        } else {
            song = new LoseYourselfSong();
        }
        song.renderSong(writer);
    }

    public void off(ConsoleWriter writer) {

        writer.printText("The radio is off");
    }
}
