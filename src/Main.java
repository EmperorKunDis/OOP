public class Main {
    public static void main(String[] args) {

        Game myGame0 = new Game("FromSoftware - Hidetaka Miayzaki.    " + "\n", "                     " +
                " Elden Ring     -", 2022, true, "    | 69,99- |", true, true,
                true);
        Game myGame1 = new Game("FromSoftware - Hidetaka Miayzaki.    " + "\n", "                     " +
                " Sekiro         -", 2019, true, "    | 69,99- |", false, true,
                true);
        Game myGame2 = new Game("FromSoftware - Hidetaka Miayzaki.    " + "\n", "                     " +
                " Darksouls III  -", 2016, true, "    | 69,99- |", false, true,
                true);
        Game myGame3 = new Game("FromSoftware - Hidetaka Miayzaki.    " + "\n", "                     " +
                " Demonsouls     -", 2011, false, "| 69,99- |", false, false,
                true);
        Game myGame4 = new Game("FromSoftware - Hidetaka Miayzaki.    " + "\n", "                     " +
                " Bloodborne     -", 2015, false, "| 69,99- |", false, false,
                true);

        System.out.println(myGame0.make + "" + myGame0.title + "" + myGame0.year + "" + myGame0.Shaveit + "" + myGame0.price + "" +
                "" + myGame0.SPlatina + "" + myGame0.SPC + "" + myGame0.Swanna);
        System.out.println(myGame1.make + " " + myGame1.title + " " + myGame1.year + " " + myGame1.haveit + " " + myGame1.price + " " +
                " " + myGame1.SPlatina + " " + myGame1.SPC + " " + myGame1.Swanna);
        System.out.println(myGame2.make + " " + myGame2.title + " " + myGame2.year + " " + myGame2.haveit + " " + myGame2.price + " " +
                " " + myGame2.SPlatina + " " + myGame2.SPC + " " + myGame2.Swanna);
        //System.out.println(myGame3.make+" "+myGame3.title+" "+myGame3.year+" "+myGame3.haveit+" "+myGame3.price+" " +
        //" "+myGame3.SPlatina+" "+myGame3.SPC+" "+myGame3.Swanna);
        //System.out.println(myGame4.make+" "+myGame4.title+" "+myGame4.year+" "+myGame4.haveit+" "+myGame4.price+" " +
        //" "+myGame4.SPlatina+" "+myGame4.SPC+" "+myGame4.Swanna);

        //myGame0.stat();
        //myGame1.stat();
        //myGame2.stat();
        myGame3.stat();
        myGame4.stat();

        myGame1.playin();
        myGame2.invadin();
        myGame2.RunToBuyIt();

        System.out.println("");
        System.out.println("");

        DiceRoller diceRoller = new DiceRoller();
        TwentyRoller twentyRoller = new TwentyRoller();

        System.out.println("");
        System.out.println("");

        Car TeslaX = new Car("1.    Best Batery of all Electro cars. ", "2.  Elons plan is selling " +
                "cars like netflix, so every car can use more drivers. ", "3.  In 95% you dont need use" +
                " breaks because rekoperation is really strong. ", "4.   I trust Elon ;) its so simple. "
                , "5.        Makin cars which dont need repair every piece every 2-5, and dont use resellers. ");
        System.out.println("Here is characteristics of best Electric car on the World: ");
        System.out.println(TeslaX.Batery);
        System.out.println(TeslaX.Selfdriven);
        System.out.println(TeslaX.Breaks);
        System.out.println(TeslaX.CompanyMind);
        System.out.println(TeslaX.Service);
        System.out.println("");
        System.out.println("");

        Car Taycan = new Car("1.    Best Batery of all Electro cars. ", "2.  Elons plan is " +
                "selling cars like netflix, so every car can use more drivers. ", "3.  In 95% you dont need " +
                "use breaks because rekoperation is really strong. ", "4.   Porsche is good Company. ");
        System.out.println("Here is characteristics of Good Electric car on the World: ");
        System.out.println(Taycan.Batery);
        System.out.println(Taycan.Selfdriven);
        System.out.println(Taycan.Breaks);
        System.out.println(Taycan.CompanyMind);

        System.out.println("");
        System.out.println("");

        Car Mercedes = new Car("1.   Good batery with compair of another Electro cars. ", "2.  " +
                "Mercedes is good firma. ", "3.  In 95% you dont need use breaks because " +
                "rekoperation is really strong. ");
        System.out.println("Here is characteristics of Good Electric car on the World: ");
        System.out.println(Mercedes.Batery);
        System.out.println(Mercedes.CompanyMind);
        System.out.println(Mercedes.Breaks);

        System.out.println("");
        System.out.println("");

        Car BMW = new Car("1.    Not bad batery. ", "2.      In 95% you dont need use breaks because " +
                "rekoperation is really strong. ");
        System.out.println("Here is characteristics of Good Electric car on the World: ");
        System.out.println(BMW.Batery);
        System.out.println(BMW.Breaks);

        System.out.println("");
        System.out.println("");

        Car VolksWagen = new Car("1.    In 95% you dont need use breaks because " +
                "rekoperation is really strong. ");
        System.out.println("Here is characteristics of Good Electric car on the World: ");
        System.out.println(VolksWagen.Breaks);

        Mobil mobil1 = new Mobil("Apple ", " Iphone 15 Pro Max ", 48);
        //Mobil mobil2 = new Mobil("Samsung", "S20 Ultra", 64);
        //mobil2.copy(mobil1);
        Mobil mobil2 = new Mobil(mobil1);
        mobil2.copy(mobil1);

        System.out.println(mobil1);
        System.out.println(mobil2);
        System.out.println("\n");
        System.out.println(mobil1.getCompany());
        System.out.println(mobil1.getModel());
        System.out.println(mobil1.getMegapixels());
        System.out.println("\n");
        System.out.println(mobil2.getCompany());
        System.out.println(mobil2.getModel());
        System.out.println(mobil2.getMegapixels());
    }
}



