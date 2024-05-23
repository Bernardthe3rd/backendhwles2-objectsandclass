public class ApplePieRecipe {
    Ingredient butter = new Ingredient(200, "gram", "ongezouten rooomboter");
    Ingredient sugarBastard = new Ingredient(200, "gram", "bastard suiker");
    Ingredient meelRising = new Ingredient(400, "gram", "zelfrijzend bakmeel");
    Ingredient egg = new Ingredient(1, "stuk(s)", "ei");
    Ingredient sugarVanilla = new Ingredient(8, "gram", "vanillesuiker");
    Ingredient salt = new Ingredient(1, "snuf", "zout");
    Ingredient apples = new Ingredient(1, "gram", "ongezouten rooomboter");
    Ingredient sugarCristal = new Ingredient(75, "gram", "kristal suiker");
    Ingredient cinnamon = new Ingredient(3, "theelepels", "kaneel");
    Ingredient meelPaneer = new Ingredient(15, "gram", "paneermeel");

    public void oneHeatTheOven () {
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }
    public void twoPartTheEggs () {
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }
    public void threeMixFewIngredients () {
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }
    public void fourCutTheApples () {
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }
    public void fiveGreaseTheCan () {
        System.out.println("Vet de springvorm in en bestrooi deze met bloem");
    }
    public void sixPartlyFillTheCanWithDough () {
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }
    public void sevenFillTheCanWithApples () {
        System.out.println("Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }
    public void eightRollOutLastPartDough () {
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }
    public void nineCrossTheBars () {
        System.out.println("Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }
    public void tenCakeInTheOven () {
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }

    public void printIngredients() {
        System.out.println(butter.getAmount() + " " + butter.getUnit() + " " + butter.getName());
        System.out.println(sugarBastard.getAmount() + " " + sugarBastard.getUnit() + " " + sugarBastard.getName());
        System.out.println(meelRising.getAmount() + " " + meelRising.getUnit() + " " + meelRising.getName());
        System.out.println(egg.getAmount() + " " + egg.getUnit() + " " + egg.getName());
        System.out.println(sugarVanilla.getAmount() + " " + sugarVanilla.getUnit() + " " + sugarVanilla.getName());
        System.out.println(salt.getAmount() + " " + salt.getUnit() + " " + salt.getName());
        System.out.println(apples.getAmount() + " " + apples.getUnit() + " " + apples.getName());
        System.out.println(sugarCristal.getAmount() + " " + sugarCristal.getUnit() + " " + sugarCristal.getName());
        System.out.println(cinnamon.getAmount() + " " + cinnamon.getUnit() + " " + cinnamon.getName());
        System.out.println(meelPaneer.getAmount() + " " + meelPaneer.getUnit() + " " + meelPaneer.getName());
    }

    public void printSteps() {
        oneHeatTheOven();
        twoPartTheEggs();
        threeMixFewIngredients();
        fourCutTheApples();
        fiveGreaseTheCan();
        sixPartlyFillTheCanWithDough();
        sevenFillTheCanWithApples();
        eightRollOutLastPartDough();
        nineCrossTheBars();
        tenCakeInTheOven();
    }

}
