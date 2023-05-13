package com.example.cocktails;

public class Cocktail {
    private String name;

    private String recipe;

    private int imageResourceId;

//    public Cocktail(String name, String recipe) {
//        this.name = name;
//        this.recipe = recipe;
//    }
//
//    public static final Cocktail[] cocktails = {
//            new Cocktail("Bloody Mary", "Składniki:\n 40 ml wódki\n 10 ml soku z cytryny\n 120 ml soku pomidorowego\n sos worchestershire\n sól " +
//                    "\n pieprz\n tabasco\n gałązka selera naciowego \n" +
//                    "\n Sposób przygotowania: " +
//                    "\n Wszystkie składniki wymieszać w szklance z lodem i ozdobić selerem naciowym."),
//
//            new Cocktail("Red Beach", "Składnik:\n 122 ml piwa\n 10 ml wody z cytryny\n 120 ml wódki pomidorowej\n sos worchestershire\n cukier " +
//                    "\n Sposób przygotowania: " +
//                    "\n Wszystkie składniki wymieszać w sklance z lodem i ozdobić selerem naciowym.")
//
//    };
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getRecipe() {
//        return recipe;
//    }
//
//    public void setRecipe(String recipe) {
//        this.recipe = recipe;
//    }

    public static final Cocktail[] cocktails = {
            new Cocktail("Light cocktail", R.drawable.cocktail1, "Product composition:\nCow's milk 1 cup;\n" +
                    "Banana 1 piece;\n" + "Mix all the ingredients in a blender." ),
            new Cocktail("Cranberry Mimosa", R.drawable.cocktail2, "sparkling wine — 100 ml\n" +
                    "cranberry juice — 100 ml\n" +
                    "frozen cranberries —\n" +
                    "fresh rosemary to taste — 1 sprig\n" +
                    "ice — 6 cubes\n" + "Put ice cubes in a glass and leave for a few minutes. During this time, the glass will cool down. The ice can be removed.\n" +
                    "You can also make a sugar rim on the glass. To do this, prepare 2 saucers: pour granulated sugar into one, and pour any sweet syrup into the other. Dip the neck of the glass into the syrup, and then into the sugar. The beautiful sparkling rim is ready!\n" +
                    "Pour sparkling wine into a glass. You can use any one you like. With brut, the cocktail will turn out tart, and the semi-sweet wine will make the taste more traditional.\n" +
                    "Add cranberry juice. If you take freshly prepared, strain it through a small sieve.\n" +
                    "Gently mix the cocktail with a special spoon, garnish with rosemary and cranberries."),
            new Cocktail("Fruit cocktail", R.drawable.cocktail3, "Product composition:\nMilk 1.5 stack.\n" +
                    "Bananas 1 pc\n" +
                    "Kiwi 1 pc\n" +
                    "Apples 2 pcs.\n" +
                    "Cherry 50 gr\n" +
                    "Strawberries 30 gr\n" +
                    "Sea buckthorn 30 gr\n" +
                    "Black currant 30 gr\n" +
                    "Raspberries 50 gr\n" +
                    "Gooseberry 30 gr\n" + "Mix all the ingredients in a blender."),
            new Cocktail("Rainbow cocktail", R.drawable.cocktail4,"Product composition:\nOrange juice — 150\n" +
                    "coconut liqueur \"Malibu\" — 30\n" +
                    "pomegranate syrup — 20 ml\n" +
                    "vodka — 50\n" +
                    "ice\n" +
                    "liqueur \"Blue Curacao\" — 20\n" + "Cool the glass with ice for a few minutes.\n" +
                    "After removing the ice, put the first layer of coconut syrup.\n" +
                    "Using a knife blade or spoon, we put the second layer — lavender syrup.\n" +
                    "Using the same inventory, we form a layer of fresh orange.\n" +
                    "The next layer is poured with cherry juice.\n" +
                    "Separately mix Sprite and Grenadine, and put the final layer." ),
            new Cocktail("Cocktail party", R.drawable.cocktail5,"Product composition:\nsparkling wine — 100 ml\\n\" +\n" +
                    "cranberry juice — 100 ml\\n\" +\n" +
                    "frozen cranberries —n\" +\n" +
                    "fresh rosemary to taste — 1 sprig\\n\" +\n" +
                    "ice — 6 cubes\\n\" + \"Put ice cubes in a glass and leave for a few minutes. During this time, the glass will cool down. The ice can be removed.\\n\" +\n" +
                    "You can also make a sugar rim on the glass. To do this, prepare 2 saucers: pour granulated sugar into one, and pour any sweet syrup into the other. Dip the neck of the glass into the syrup, and then into the sugar. The beautiful sparkling rim is ready!\\n\" +\n" +
                    "Pour sparkling wine into a glass. You can use any one you like. With brut, the cocktail will turn out tart, and the semi-sweet wine will make the taste more traditional.\\n\" +\n" +
                    "Add cranberry juice. If you take freshly prepared, strain it through a small sieve.\\n\" +\n" +
                    "Gently mix the cocktail with a special spoon, garnish with rosemary and cranberries." ),
            new Cocktail("Fruit cocktail", R.drawable.cocktail3, "Product composition:\nMilk 1.5 stack.\n" +
                    "Bananas 1 pc\n" +
                    "Kiwi 1 pc\n" +
                    "Apples 2 pcs.\n" +
                    "Cherry 50 gr\n" +
                    "Strawberries 30 gr\n" +
                    "Sea buckthorn 30 gr\n" +
                    "Black currant 30 gr\n" +
                    "Raspberries 50 gr\n" +
                    "Gooseberry 30 gr\n" + "Mix all the ingredients in a blender.")};

    private Cocktail(String name, int imageResourceId, String recipe) {
            this.name = name;
            this.imageResourceId = imageResourceId;
            this.recipe = recipe;
            }


    public String getName() {
            return name;
    }


    public int getImageResourceId() {
            return imageResourceId;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }
}
