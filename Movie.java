class Movie {
    private String name;
    private float budget;
    private int movieId;
    private String director;
    private float rating;

    static String language;
    static float tax;

    public void setName(String movieName) { name = movieName; }
    public void setBudget(float movieBudget) { budget = movieBudget; }
    public void setMovieId(int movieCode) { movieId = movieCode; }
    public void setDirector(String movieDirector) { director = movieDirector; }
    public void setRating(float movieRating) { rating = movieRating; }

    public static void setLanguage(String movieLanguage) { language = movieLanguage; }
    public static void setTax(float movieTax) { tax = movieTax; }

    public String getName() { return name; }
    public float getBudget() { return budget; }
    public int getMovieId() { return movieId; }
    public String getDirector() { return director; }
    public float getRating() { return rating; }

    public static String getLanguage() { return language; }
    public static float getTax() { return tax; }
}
