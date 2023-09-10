public class Game {

    String make;
     String title;
     double year;
     String played;
    String price;
   boolean Platina;
    Game(String make, String title, double year, String played, String price, boolean Platina) {


        Game.make = make;
        Game.title = title;
        Game.year = year;
        Game.played = played;
        Game.price = price;
        Game.Platina = Platina;
    }


    void playin() {
        if (Platina=true) {
            System.out.println("I'm tryin to mastering platinum trophy.");
        }  else{
            System.out.println("I'm gona DYING TY. "+title+" is not my strong side.");
        }
    }

    void invadin() {
        if (Platina=true) {
            System.out.println("I love to kill them :).");
        } else {
            System.out.println("OOOOuuuuuu ruuuuuuun, bitch ruuuuuuuuuu.");

            System.out.println("I love to kill them :).");
        }
    }
}



