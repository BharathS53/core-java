class Game {
    private String title;
    private float price;
    private int gameId;
    private String genre;
    private float rating;
    private String platform; // made non-static
    private float discount;  // made non-static

    public void setTitle(String gameTitle) { title = gameTitle; }
    public void setPrice(float gamePrice) { price = gamePrice; }
    public void setGameId(int id) { gameId = id; }
    public void setGenre(String gameGenre) { genre = gameGenre; }
    public void setRating(float gameRating) { rating = gameRating; }
    public void setPlatform(String gamePlatform) { platform = gamePlatform; }
    public void setDiscount(float gameDiscount) { discount = gameDiscount; }

    public String getTitle() { return title; }
    public float getPrice() { return price; }
    public int getGameId() { return gameId; }
    public String getGenre() { return genre; }
    public float getRating() { return rating; }
    public String getPlatform() { return platform; }
    public float getDiscount() { return discount; }
}