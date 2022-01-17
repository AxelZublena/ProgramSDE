package com.hz.Template;

import com.hz.ConsoleWriter;

public class GangnamStlyeSong extends Song{

    @Override
    void printSinger(ConsoleWriter writer) {
        String singer = "PSY";
        writer.printText("The singer is " + singer);

    }

    @Override
    void printText(ConsoleWriter writer) {
       String text = "'Oppan Gangnam Style\n" +
                "Gangnam Style\n" +
                "Najeneun ddasarowun in-ganjeogin yeoja\n" +
                "Keopi hanjaneui yeoyureul aneun pumgyeok ittneun yeoja\n" +
                "Bami omyeon shimjangi ddeugeowojineun yeoja\n" +
                "Geureon banjeon ittneun yeoja\n" +
                "Naneun sanai\n" +
                "Najeneun neomankeum ddasarowun geureon sanai\n" +
                "Keopi shik-gido jeone One Shot ddaerineun sanai\n" +
                "Bami omyeon shimjangi teojyeobeorineun sanai\n" +
                "Geureon sanai\n" +
                "Aremdawo sarangseurowo\n" +
                "Geurae neo hey, geurae baro neo hey\n" +
                "Areumdawo sarangseurowo\n" +
                "Geurae neo hey, geurae baro neo hey\n" +
                "Jigeumbuteo gal ddaekkaji gabolkka\n" +
                "Oppan Gangnam style\n" +
                "Gangnam style\n" +
                "Oppan Gangnam style\n" +
                "Gangnam style\n" +
                "Oppan Gangnam style\n" +
                "Eh Sexy Lady\n" +
                "Oppan Gangnam style\n" +
                "Eh Sexy Lady\n" +
                "Eh, eh, eh, eh, eh, eh\n" +
                "Jeongsokhae bo-ijiman nol ddaen noneun yeoja\n" +
                "Iddaeda shipeumyeon mukkeottdeon meori puneun yeoja\n" +
                "Garyeottjiman wenmanhan nochulboda yahan yeoja\n" +
                "Geureon gangjakjeogin yeoja\n" +
                "Naneun sanai\n" +
                "Jeonjanha bo-ijiman nol ddaen noneun sanai\n" +
                "Ddaega dweimyeon wanjeon michyeobeorineun sanai\n" +
                "Geun-yukboda sasangi ultungbultung han sanai\n" +
                "Geureon sanai\n" +
                "Aremdawo sarangseurowo\n" +
                "Geurae neo hey, geurae baro neo hey\n" +
                "Areumdawo sarangseurowo\n" +
                "Geurae neo hey, geurae baro neo hey\n" +
                "Jigeumbuteo gal ddaekkaji gabolkka\n" +
                "Oppan Gangnam style\n" +
                "Gangnam style\n" +
                "Oppan Gangnam style\n" +
                "Gangnam style\n" +
                "Oppan Gangnam style\n" +
                "Eh Sexy Lady\n" +
                "Oppan Gangnam style\n" +
                "Eh Sexy Lady\n" +
                "Eh, eh, eh, eh, eh, eh\n" +
                "Ttwineun nom geu wi-e naneun nom\n" +
                "Baby baby\n" +
                "Naneun mwol jom aneun nom\n" +
                "Ttwineun nom geu wi-e naneun nom\n" +
                "Baby baby\n" +
                "Naneun mwol jom aneun nom\n" +
                "You know what I'm saying\n" +
                "Oppan Gangnam style\n" +
                "Eh Sexy Lady\n" +
                "Oppan Gangnam style\n" +
                "Eh Sexy Lady\n" +
                "Oppan Gangnam style'";
        writer.printText("The text of the song:\n" + text);
    }
}
