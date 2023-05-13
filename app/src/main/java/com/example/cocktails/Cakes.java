package com.example.cocktails;

public class Cakes {
    private String name;

    private String recipe;

    private int imageResourceId;


    public static final Cakes[] cocktails = {
            new Cakes("Cocoa-cupcakes", R.drawable.cake1, "Wheat flour - 120 g\n" +
                    "\n" +
                    "Milk - 80 ml\n" +
                    "\n" +
                    "Butter - 75 g\n" +
                    "\n" +
                    "Sugar - 75 g\n" +
                    "\n" +
                    "Cocoa powder - 2.5 tbsp.l.\n" +
                    "\n" +
                    "Chicken egg - 1 pc.\n" +
                    "\n" +
                    "Baking powder - 1 tsp.\n" +
                    "Combine milk and butter in a small saucepan / saucepan, put on fire and warm up until the butter dissolves. Then add sugar and cocoa powder.\n" +
                    "Mix well and bring the mixture to a boil, but do not boil. The dough consistency should resemble sour cream of medium density. Bake chocolate cupcakes with cocoa in silicone molds for 20-25 minutes."),
            new Cakes("Standard cupcake", R.drawable.cake2, "120 g butter;\n" +
                    "130 g of sugar;\n" +
                    "vanilla sugar — to taste;\n" +
                    "3 eggs;\n" +
                    "200 g flour;\n" +
                    "1½ teaspoons baking powder;\n" +
                    "1 1/2 teaspoons salt;\n" +
                    "60 ml of milk.\n" +
                    "Using a mixer, beat the butter with plain and vanilla sugar until fluffy. Enter the eggs one at a time, beating for a few minutes after each addition.\n" +
                    "\n" +
                    "Separately combine flour, baking powder and salt. Continuing to beat, pour half of the flour mixture into the egg mixture. Then add the milk and the remaining flour. Do not knead the dough for a long time, otherwise the butter will start to melt."),
            new Cakes("Cupcake with cream", R.drawable.cake3, "120 g butter;\n" +
                    "130 g of sugar;\n" +
                    "vanilla sugar — to taste;\n" +
                    "3 eggs;\n" +
                    "200 g flour;\n" +
                    "1½ teaspoons baking powder;\n" +
                    "1 1/2 teaspoons salt;\n" +
                    "60 ml of milk.\n" +
                    "For cream and decoration:\n" +
                    "\n" +
                    "200 g of cottage cheese;\n" +
                    "20 g of cream with a fat content of 33%;\n" +
                    "20 g powdered sugar;\n" +
                    "any berries — to taste.\n" +
                    "All ingredients for cupcakes should be at room temperature.\n" +
                    "\n" +
                    "Using a mixer, beat the butter with plain and vanilla sugar until fluffy. Enter the eggs one at a time, beating for a few minutes after each addition.\n" +
                    "\n" +
                    "Separately combine flour, baking powder and salt. Continuing to beat, pour half of the flour mixture into the egg mixture. Then add the milk and the remaining flour. Do not knead the dough for a long time, otherwise the butter will start to melt."),
            new Cakes("Cottage cheese cupcakes", R.drawable.cake4,"1 orange;\n" +
                    "10 g baking powder;\n" +
                    "a pinch of salt;\n" +
                    "a pinch of soda;\n" +
                    "200 g of cottage cheese;\n" +
                    "3 eggs;\n" +
                    "2 cups of sugar (200 ml);\n" +
                    "vanilla sugar — to taste;\n" +
                    "100 g butter;\n" +
                    "150 ml of milk;\n" +
                    "3 cups of flour (200 ml).\n" +
                    "Grate the orange zest on a fine grater. Put all the ingredients, except flour, in a bowl. Beat with a mixer until smooth. Then enter the flour in parts, carefully kneading the dough.\n" +
                    "\n" +
                    "Arrange the dough into cupcake molds. Place in a preheated 180°C oven for about 30 minutes."),
            new Cakes("Cupcake", R.drawable.cake5,"Ingredients for cupcakes:\n" +
                    "2.5 cups flour;\n" +
                    "2 tbsp cocoa;\n" +
                    "1 tsp salt;\n" +
                    "1.5 cups of sugar;\n" +
                    "2 eggs;\n" +
                    "60 g butter;\n" +
                    "½ tsp red gel dye;\n" +
                    "1 tsp vanilla extract;\n" +
                    "1 cup kefir;\n" +
                    "1.5 tsp soda;\n" +
                    "2 tsp vinegar\n" +
                    "For the cream:\n" +
                    "225 g butter;\n" +
                    "340 g cream cheese;\n" +
                    "450 g of sifted powdered sugar;\n" +
                    "3/4 teaspoons vanilla extract.\n" +
                    "Preheat the oven to 180 degrees, lay out metal cupcake molds and line paper molds in each hole.\n" +
                    "Mix flour, cocoa and salt.\n" +
                    "In a separate bowl, beat the butter and sugar with a mixer, add the eggs one at a time and continue to beat. Pour in the food coloring and vanilla.\n" +
                    "Slow down the speed of the mixer, pour the flour mixture in three stages, alternating with the addition of kefir. Continue whisking at low speed.\n" +
                    "In a separate bowl, extinguish the soda with vinegar, add the mixture to the dough and beat with a mixer at medium speed for about 10 seconds.\n" +
                    "Fill the paper molds with the dough for ¾ and bake in the oven for about 20 minutes. Cool the finished cupcakes on the grill.\n" +
                    "Whisk all the ingredients for the glaze, send it to a pastry bag and squeeze it onto the cupcakes. The glaze can also be spread with a spoon."),
            new Cakes("Cupcake", R.drawable.cake6,"egg - 3 pcs.\n" +
                    "sugar - 200g\n" +
                    "milk - 1 cup\n" +
                    "vegetable oil - 1/2 cup\n" +
                    "butter - 1 tbsp\n" +
                    "vanilla essence\n" +
                    "flour - 2 cups\n" +
                    "cocoa powder - 2 tbsp\n" +
                    "baking powder - 10g\n" +
                    "To prepare a stove-top cupcake without baking, mix 1 cup of sugar with eggs until white, then add vanilla essence or vanilla sugar, half a cup of vegetable oil, and 1 cup of milk. Mix in sifted flour and baking powder. " +
                    "Separate half of the dough and add 2 tablespoons of cocoa and 1 tablespoon of milk to the second half.\n" +
                    "Grease and flour a thick-walled pan and place a heavy glass in the center. \n" +
                    "Pour the dough around the glass, alternating the colors. Cook on medium heat for 5 minutes and then reduce to minimum heat for 40 minutes. Check the cupcake's readiness with a toothpick.\n" +
                    "Remove from heat, let it cool completely, and decorate if desired.")};

    private Cakes(String name, int imageResourceId, String recipe) {
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

