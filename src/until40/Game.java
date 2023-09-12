package until40;

public class Game {

    String make;
    String title;
    int year;
    boolean haveit;
    String price;
    boolean Platina;
    boolean PC;
    boolean wanna;
    String SPlatina;
    String SPC;
    String Swanna;
    String Shaveit;

    Game(String make, String title, int year, boolean haveit, String price, boolean Platina, boolean PC, boolean wanna)
    {
        this.make = make;
        this.title = title;
        this.year = year;
        this.haveit = haveit;
        this.price = price;
        this.Platina = Platina;
        this.PC = PC;
        this.wanna = wanna;

        if (haveit == true) {
            Shaveit = "| I have it. |";
            Swanna = " ";
            if (PC == true) {
                SPC = "| It on PC. |";
                if (Platina == true) {
                    SPlatina = "| I have it. |      ";
                } else {
                    SPlatina = "| Im mastering it. |";
                }
            } else {
                SPC = "| I dont have how to play it. |";
                if (wanna == true) {
                    SPlatina = " ";
                    Swanna = " ";
                } else {
                    SPlatina = "| Until it is not on PC I cant do it. |";
                    }
            }

        } else {
            Shaveit ="| I dont have it |";
            if (PC == true) {
                Swanna = "| No i dont like everythin from Hidetaka Miayzaki xD xD xD Just kidding. Of Course I wanna it. |"
                        +"| I need it. I cant breath without it. |";
                RunToBuyIt();
            } else {
                SPC = "| No Its only on fucking playstation. |";
                SPlatina = "| Until it is not on PC I cant do it. |";
                Swanna = "| I wish it more than world peace. |";

            }
        }
    }
    void stat() {
        System.out.println(make+title+year+Shaveit+price+SPlatina+SPC+Swanna);
        }
    void playin() {
        if (PC = true) {
            if (haveit == true) {
                if (Platina = true) {
                            System.out.println("| Just Invadin i dont need play it normal anymore. |");
                } else {
                            System.out.println("| I'm tryin to mastering platinum trophy. |");}
            } else {
                        System.out.println("| I wish, I have it. |");}
        } else {
                    System.out.println("| I wish, I can. |");}
    }
    void invadin() {
        if (PC=true) {
            if (haveit == true) {
                if (Platina = true) {
                            System.out.println("| I love to kill them :). |");
                } else {
                            System.out.println("| OOOOuuuuuu ruuuuuuun, bitch ruuuuuuuuuun. |");}
            } else {
                        System.out.println("| I wish, I have it. |");}
        } else {
                    System.out.println("| I think I need mastered it for first time and then someone Invadet. |");}
    }
    void RunToBuyIt() {
        System.out.println("| I'm on my way to buy it. |");
    }
}



