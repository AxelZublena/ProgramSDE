package com.hz.CarFactory;

import com.hz.ConsoleWriter;

public class FamilyCar implements Car{

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
        writer.printText("Art by lgbeard\n" +
                "                                 _______________________________ \n" +
                "                             _.-'`````-._   ````````-._     ``````-._\n" +
                "                          .'_____________  _____   ______   ________ `. \n" +
                "                         '.-----..-----. '.-----.|.------.|.---------.|\n" +
                "                        //     //     / //      :|:      :|:         :|\n" +
                "                       //_____//_____/ //       :|:      :|:         :|\n" +
                "          _..----------------='.......'|`-------'|'------'|'---------'|\n" +
                "      .-'        --== Woody ==--   '|.-------.|.------.|.---------.|\n" +
                "   _.' _.-'-._        .----------..._' |:     ->:|:    ->:|: .--------.\n" +
                " .''.-'_.-'-._`-.''.'              ```\\|'-------'|'------' .'          `._\n" +
                " |()|===========|()|      _____        \\.-------.|.------.'  .------.    \\]\n" +
                ".'..'..--'''--..'..'   .' ._._.`.      |:       :|:     /  .'.'-'-'-.`.   \\\n" +
                "| ||_..--'''--.._||   /..'-'-'-'.\\     |'-------'_'----'. / .' .---. .'\\   ]\n" +
                "| ||_..--'''--.._||  /..' .---. .'\\    |_`_`_`_`_`_`_`_`_|..' / .^. \\ .'`--'\n" +
                "'.-'-------------'-.| .' / .^. \\ .''...' - - - - - - - - '..' \\ 'v' / '..\n" +
                " '-----------------''..' \\ 'v' / '..         `..'._._.'.''..'  `---'  '..\n" +
                "     `..'._._.'.'   '..'  `---'  '..           ``'-'-''   `..'._._._.'.. \n" +
                "       ``'-'-''      `..'._._._.'..   LGB                   ``'-'-'-'-'\n" +
                "                       ``'-'-'-'-'");
    }

    @Override
    public void pros(ConsoleWriter writer) {
        writer.printText("Pros:\n" +
                "1) Easy to afford\n" +
                "2) Enough place for the whole family\n" +
                "3) Easy for maintenance");
    }

    @Override
    public void cons(ConsoleWriter writer) {
        writer.printText("Cons:\n" +
                "1) Unattractive look\n" +
                "2) Not really powerful\n" +
                "3) Too large");
    }

    @Override
    public double getMaxSpeed() {
        return 130;
    }
    public double getMaxRange(){
        return 550;
    }


}
