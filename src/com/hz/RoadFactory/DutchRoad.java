package com.hz.RoadFactory;

import com.hz.ConsoleWriter;
import com.hz.RoadFactory.Road;

public class DutchRoad implements Road {

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
        writer.printText("                                        __\n" +
                "                 ,-_                  (`  ).\n" +
                "                 |-_'-,              (     ).\n" +
                "                 |-_'-'           _(        '`.\n" +
                "        _        |-_'/        .=(`(      .     )\n" +
                "       /;-,_     |-_'        (     (.__.:-`-_.'\n" +
                "      /-.-;,-,___|'          `(       ) )\n" +
                "     /;-;-;-;_;_/|\\_ _ _ _ _   ` __.:'   )\n" +
                "        x_( __`|_P_|`-;-;-;,|        `--'\n" +
                "        |\\ \\    _||   `-;-;-'\n" +
                "        | \\`   -_|.      '-'\n" +
                "        | /   /-_| `\n" +
                "        |/   ,'-_|  \\\n" +
                "        /____|'-_|___\\\n" +
                " _..,____]__|_\\-_'|_[___,.._\n" +
                "'                          ``'--,..,.      mic\n");
    }

    @Override
    public void pros(ConsoleWriter writer) {
        writer.printText("Pros:\n" +
                "1) Easy to drive on\n" +
                "2) Safe\n" +
                "3) Looks nice");
    }

    @Override
    public void cons(ConsoleWriter writer) {
        writer.printText("Cons:\n" +
                "1) Costs a lot to build\n" +
                "2) Maintenance is expensive\n" +
                "3) Low speed");
    }
}
