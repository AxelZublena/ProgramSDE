package com.hz.Template;

import com.hz.ConsoleWriter;

public abstract class Song {

    public void renderSong(ConsoleWriter writer){
        this.printSinger(writer);
        this.printText(writer);
    }

    abstract void printSinger(ConsoleWriter writer);

    abstract void printText(ConsoleWriter writer);
}
