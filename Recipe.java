public class Recipe {
    private String name;
    private float prepTime;
    private int recipeId;
    private String cuisine;
    private float rating;
    private String chef;
    private float calories;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrepTime(float prepTime) {
        this.prepTime = prepTime;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public void setChef(String chef) {
        this.chef = chef;
    }

    public void setCalories(float calories) {
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public float getPrepTime() {
        return prepTime;
    }

    public int getRecipeId() {
        return recipeId;
    }

    public String getCuisine() {
        return cuisine;
    }

    public float getRating() {
        return rating;
    }

    public String getChef() {
        return chef;
    }

    public float getCalories() {
        return calories;
    }

    // New display method for cleaner output
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Preparation Time: " + prepTime + " minutes");
        System.out.println("Recipe ID: " + recipeId);
        System.out.println("Cuisine: " + cuisine);
        System.out.println("Rating: " + rating);
        System.out.println("Chef: " + chef);
        System.out.println("Calories: " + calories);
        System.out.println("----------------------------------");
    }
}