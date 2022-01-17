package com.hz.Factory;

import com.hz.ConsoleWriter;

public class SportsCar implements Car{

    //Renders the whole information about the car
    @Override
    public void printAll(ConsoleWriter writer){
        this.image(writer);
        this.pros(writer);
        System.out.println();
        this.cons(writer);
    }

    @Override
    public void image(ConsoleWriter writer) {
        writer.printText("                              _.-=\"_-         _\n" +
                "                         _.-=\"   _-          | ||\"\"\"\"\"\"\"---._______     __..\n" +
                "             ___.===\"\"\"\"-.______-,,,,,,,,,,,,`-''----\" \"\"\"\"\"       \"\"\"\"\"  __'\n" +
                "      __.--\"\"     __        ,'                   o \\           __        [__|\n" +
                " __-\"\"=======.--\"\"  \"\"--.=================================.--\"\"  \"\"--.=======:\n" +
                "]       [w] : /        \\ : |========================|    : /        \\ :  [w] :\n" +
                "V___________:|          |: |========================|    :|          |:   _-\"\n" +
                " V__________: \\        / :_|=======================/_____: \\        / :__-\"\n" +
                " -----------'  \"-____-\"  `-------------------------------'  \"-____-\"");
    }

    @Override
    public void pros(ConsoleWriter writer) {
        writer.printText("Pros:\n" +
                "1) Holds Its Value\n" +
                "2) The Exhilaration\n" +
                "3) The Prestige");
    }

    @Override
    public void cons(ConsoleWriter writer) {
        writer.printText("Cons:\n" +
                "1) Police Love Sports Cars\n" +
                "2) Maintenance\n" +
                "3) Expensive");
    }
}
