public class RecipeRunner {
    public static void main(String[] args) {
        Recipe recipe = new Recipe();
        recipe.setName("Butter Chicken");
        recipe.setPrepTime(45.0f);
        recipe.setRecipeId(501);
        recipe.setCuisine("Indian");
        recipe.setRating(4.8f);
        recipe.setChef("Chef Arjun");
        recipe.setCalories(600.0f);
        recipe.display();

        Recipe recipe1 = new Recipe();
        recipe1.setName("Pasta Alfredo");
        recipe1.setPrepTime(30.0f);
        recipe1.setRecipeId(502);
        recipe1.setCuisine("Italian");
        recipe1.setRating(4.5f);
        recipe1.setChef("Chef Maria");
        recipe1.setCalories(500.0f);
        recipe1.display();

        Recipe recipe2 = new Recipe();
        recipe2.setName("Sushi Rolls");
        recipe2.setPrepTime(50.0f);
        recipe2.setRecipeId(503);
        recipe2.setCuisine("Japanese");
        recipe2.setRating(4.9f);
        recipe2.setChef("Chef Sato");
        recipe2.setCalories(300.0f);
        recipe2.display();

        Recipe recipe3 = new Recipe();
        recipe3.setName("Tacos");
        recipe3.setPrepTime(25.0f);
        recipe3.setRecipeId(504);
        recipe3.setCuisine("Mexican");
        recipe3.setRating(4.4f);
        recipe3.setChef("Chef Diego");
        recipe3.setCalories(450.0f);
        recipe3.display();

        Recipe recipe4 = new Recipe();
        recipe4.setName("Falafel Wrap");
        recipe4.setPrepTime(20.0f);
        recipe4.setRecipeId(505);
        recipe4.setCuisine("Middle Eastern");
        recipe4.setRating(4.2f);
        recipe4.setChef("Chef Amal");
        recipe4.setCalories(350.0f);
        recipe4.display();

        Recipe recipe5 = new Recipe();
        recipe5.setName("Pizza Margherita");
        recipe5.setPrepTime(40.0f);
        recipe5.setRecipeId(506);
        recipe5.setCuisine("Italian");
        recipe5.setRating(4.6f);
        recipe5.setChef("Chef Lorenzo");
        recipe5.setCalories(550.0f);
        recipe5.display();

        Recipe recipe6 = new Recipe();
        recipe6.setName("Paneer Tikka");
        recipe6.setPrepTime(35.0f);
        recipe6.setRecipeId(507);
        recipe6.setCuisine("Indian");
        recipe6.setRating(4.7f);
        recipe6.setChef("Chef Radhika");
        recipe6.setCalories(420.0f);
        recipe6.display();

        Recipe recipe7 = new Recipe();
        recipe7.setName("Bibimbap");
        recipe7.setPrepTime(40.0f);
        recipe7.setRecipeId(508);
        recipe7.setCuisine("Korean");
        recipe7.setRating(4.3f);
        recipe7.setChef("Chef Hana");
        recipe7.setCalories(480.0f);
        recipe7.display();

        Recipe recipe8 = new Recipe();
        recipe8.setName("Greek Salad");
        recipe8.setPrepTime(15.0f);
        recipe8.setRecipeId(509);
        recipe8.setCuisine("Greek");
        recipe8.setRating(4.1f);
        recipe8.setChef("Chef Nikos");
        recipe8.setCalories(300.0f);
        recipe8.display();

        Recipe recipe9 = new Recipe();
        recipe9.setName("Chocolate Cake");
        recipe9.setPrepTime(60.0f);
        recipe9.setRecipeId(510);
        recipe9.setCuisine("Dessert");
        recipe9.setRating(4.9f);
        recipe9.setChef("Chef Lily");
        recipe9.setCalories(700.0f);
        recipe9.display();
    }
}