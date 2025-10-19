public class CharacterIcon {

    public static void Normal(int x, int y) {
        System.out.printf("\033[%d;%dH%s", y + 1, x + 1, "O ");
        System.out.printf("\033[%d;%dH%s", y + 2, x, "/|\\");
        System.out.printf("\033[%d;%dH%s", y + 3, x, "/ \\");
    }

    public static void Paladin(int x, int y) {
        System.out.printf("\033[%d;%dH%s", y, x, "O __");
        System.out.printf("\033[%d;%dH%s", y + 1, x - 6, "<==|-/|')_)");
        System.out.printf("\033[%d;%dH%s", y + 2, x - 1, "/ \\");
    }

    public static void Mage(int x, int y) {
        System.out.printf("\033[%d;%dH%s", y, x, "_A_");
        System.out.printf("\033[%d;%dH%s", y + 1, x + 1, "O  *");
        System.out.printf("\033[%d;%dH%s", y + 2, x, "/|\\/");
        System.out.printf("\033[%d;%dH%s", y + 3, x, "/ \\");
    }

    public static void Warrior(int x, int y) {
        System.out.printf("\033[%d;%dH%s", y, x, "(> O <)");
        System.out.printf("\033[%d;%dH%s", y + 1, x + 1, "|/|\\|");
        System.out.printf("\033[%d;%dH%s", y + 2, x + 1, "'/ \\'");
    }

    // Plains Mobs ------------------------------------------------

    public static void Slime(int x, int y) {
        System.out.printf("\033[%d;%dH%s", y, x, "('' )");
    }

    public static void WildBull(int x, int y) {
        System.out.printf("\033[%d;%dH%s", y, x, "<__>___   ");
        System.out.printf("\033[%d;%dH%s", y + 1, x, " \\/____)\\");
        System.out.printf("\033[%d;%dH%s", y + 2, x, "  ||  || ");
    }

    public static void Wolf(int x, int y) {
        System.out.printf("\033[%d;%dH%s", y, x, "  ,,___/");
        System.out.printf("\033[%d;%dH%s", y + 1, x, "-'']___|");
        System.out.printf("\033[%d;%dH%s", y + 2, x, "  || ||");
    }

    public static void Minotaur(int x, int y) {
        System.out.printf("\033[%d;%dH%s", y, x, " (__) <)");
        System.out.printf("\033[%d;%dH%s", y + 1, x, "  \\/,_|");
        System.out.printf("\033[%d;%dH%s", y + 2, x, " /(_) '");
        System.out.printf("\033[%d;%dH%s", y + 3, x, "  /'\\");
    }

    // -------------------------------------------------------------

    //Desert Mobs---------------------------------------------------

    public static void Mummy(int x, int y) {
        System.out.printf("\033[%d;%dH%s", y + 1, x, " _{)");
        System.out.printf("\033[%d;%dH%s", y + 2, x, "',-)");
        System.out.printf("\033[%d;%dH%s", y + 3, x, "  /|");
    }

    public static void Spider(int x, int y) {
        System.out.printf("\033[%d;%dH%s", y, x, "    __");
        System.out.printf("\033[%d;%dH%s", y + 1, x, "   (  )");
        System.out.printf("\033[%d;%dH%s", y + 2, x, " /'∞|'\\\\");
        System.out.printf("\033[%d;%dH%s", y + 3, x, "'   '  ''");
    }

    public static void Snake(int x, int y) {
        System.out.printf("\033[%d;%dH%s", y, x, "    _");
        System.out.printf("\033[%d;%dH%s", y + 1, x, ">--( \\______");
        System.out.printf("\033[%d;%dH%s", y + 2, x, "    '-----, )");
        System.out.printf("\033[%d;%dH%s", y + 3, x, "          ;/");
    }

    public static void GiantWorm(int x, int y) {
        System.out.printf("\033[%d;%dH%s", y, x, "   __");
        System.out.printf("\033[%d;%dH%s", y + 1, x, " ,'  ',       __");
        System.out.printf("\033[%d;%dH%s", y + 2, x, "(      \\    .'  ',");
        System.out.printf("\033[%d;%dH%s", y + 3, x, " ',_    '._/   _  \\");
        System.out.printf("\033[%d;%dH%s", y + 4, x, "     \\        / ', \\");
        System.out.printf("\033[%d;%dH%s", y + 5, x, "      '.____.'    \\|");
    }

    //---------------------------------------------------------------

    //continue the designs here...

}


