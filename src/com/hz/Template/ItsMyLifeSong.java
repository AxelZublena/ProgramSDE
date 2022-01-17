package com.hz.Template;

import com.hz.ConsoleWriter;

public class ItsMyLifeSong extends Song{
    @Override
    void printSinger(ConsoleWriter writer) {
        String singer = "Bon Jovi";
        writer.printText("The singer is " + singer);
    }

    @Override
    void printText(ConsoleWriter writer) {
        String text = "'This ain't a song for the broken-hearted\n" +
                "No silent prayer for faith-departed\n" +
                "And I ain't gonna be just a face in the crowd\n" +
                "You're gonna hear my voice when I shout it out loud\n" +
                "It's my life\n" +
                "It's now or never\n" +
                "But I ain't gonna live forever\n" +
                "I just want to live while I'm alive\n" +
                "(It's my life)\n" +
                "My heart is like an open highway\n" +
                "Like Frankie said, \"I did it my way\"\n" +
                "I just want to live while I'm alive\n" +
                "It's my life\n" +
                "Yeah, this is for the ones who stood their ground\n" +
                "For Tommy and Gina, who never backed down\n" +
                "Tomorrow's getting harder, make no mistake\n" +
                "Luck ain't even lucky, got to make your own breaks\n" +
                "It's my life\n" +
                "And it's now or never\n" +
                "I ain't gonna live forever\n" +
                "I just want to live while I'm alive\n" +
                "(It's my life)\n" +
                "My heart is like an open highway\n" +
                "Like Frankie said, \"I did it my way\"\n" +
                "I just want to live while I'm alive\n" +
                "'Cause it's my life\n" +
                "Better stand tall when they're calling you out\n" +
                "Don't bend, don't break, baby, don't back down\n" +
                "It's my life\n" +
                "And it's now or never\n" +
                "'Cause I ain't gonna live forever\n" +
                "I just want to live while I'm alive\n" +
                "(It's my life)\n" +
                "My heart is like an open highway\n" +
                "Like Frankie said, \"I did it my way\"\n" +
                "I just want to live while I'm alive\n" +
                "And it's now or never\n" +
                "I ain't gonna live forever\n" +
                "I just want to live while I'm alive\n" +
                "(It's my life)\n" +
                "My heart is like an open highway\n" +
                "Like Frankie said, \"I did it my way\"\n" +
                "I just want to live while I'm alive\n" +
                "'Cause it's my life'";
        writer.printText("The text of the song: \n" + text);
    }
}
