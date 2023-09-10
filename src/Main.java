public class Main {
    public static void main(String[] args) {

        Game myGame0 = new Game("FromSoftware - Hidetaka Miayzaki", "Elden Ring", 2022,
                "Complete", "SixtyNine", true);
        Game myGame1 = new Game("FromSoftware - Hidetaka Miayzaki", "Sekiro", 2019, "Yes",
                "Same", false);
        Game myGame2 = new Game("FromSoftware - Hidetaka Miayzaki", "Darksouls III", 2016,
                "Yes", "Me too", false);
        Game myGame3 = new Game("FromSoftware - Hidetaka Miayzaki", "Demonsouls", 2011,
                "Yes", "Just like that", false);
        Game myGame4 = new Game("FromSoftware - Hidetaka Miayzaki", "Bloodborne", 2015,
                "Yes", "Same", false);

        System.out.println(myGame0.make);
        System.out.println(myGame1.title);
        System.out.println(myGame2.year);
        System.out.println(myGame3.played);
        System.out.println(myGame4.title);

        myGame1.playin();
    }
}