package com.hz.Factory;

import com.hz.ConsoleWriter;

public class FrenchRoad implements Road{

    //Renders the whole information about the car
    @Override
    public void printAll(ConsoleWriter writer) {
        this.image(writer);
        this.pros(writer);
        System.out.println();
        this.cons(writer);
    }

    @Override
    public void image(ConsoleWriter writer) {
        writer.printText("                                  ████████░░          \n" +
                "                              ██████░░░░▓▓██▒▒        \n" +
                "                          ████▒▒░░▒▒██░░░░░░██░░      \n" +
                "                      ░░██▒▒░░░░░░░░▒▒██░░░░░░██      \n" +
                "                    ████▒▒░░░░░░░░░░░░▓▓░░░░░░██      \n" +
                "                ████▒▒▒▒████░░░░░░░░░░▒▒░░░░░░██      \n" +
                "              ████▒▒░░░░░░▒▒██▒▒░░░░░░░░░░░░░░██      \n" +
                "            ████▒▒░░░░░░░░░░▒▒▒▒░░░░░░░░░░░░██        \n" +
                "          ██████████░░░░░░░░░░▓▓░░░░░░░░░░░░██        \n" +
                "        ████▒▒▒▒▒▒██████░░░░░░▒▒░░░░░░░░░░██          \n" +
                "      ████░░░░░░░░▒▒▒▒██░░░░░░░░░░░░░░████            \n" +
                "      ██▒▒░░░░░░░░░░▒▒▓▓▓▓░░░░░░░░▒▒██                \n" +
                "      ██░░░░░░░░░░░░▒▒▒▒░░░░░░░░▒▒██                  \n" +
                "      ██░░░░░░░░░░░░░░░░░░░░░░████                    \n" +
                "      ██░░░░░░░░░░░░░░░░░░▒▒████                      \n" +
                "      ██░░░░░░░░░░░░░░░░▒▒██                          \n" +
                "      ░░██░░░░░░░░░░░░▒▒██                            \n" +
                "        ██████▒▒▒▒▒▒██░░                              \n" +
                "            ████████                                  \n");
    }

    @Override
    public void pros(ConsoleWriter writer) {
        writer.printText("Pros:\n" +
                "1) Possible drive fast\n" +
                "2) Space for the cars\n" +
                "3) Cheap to maintain");
    }

    @Override
    public void cons(ConsoleWriter writer) {
        writer.printText("Cons:\n" +
                "1) A lot of radars\n" +
                "2) Need to be maintained frequently\n" +
                "3) Less safe than the Dutch roads");
    }
}
