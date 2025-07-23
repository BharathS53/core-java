class Animal
{
   private String species;
   private float weight;
   private int tagId;
   private String habitat;
   private float lifespan;
   static String region;
   static float protectionRating;

   public void setSpecies(String animalSpecies) { species = animalSpecies; }
   public void setWeight(float animalWeight) { weight = animalWeight; }
   public void setTagId(int animalId) { tagId = animalId; }
   public void setHabitat(String animalHabitat) { habitat = animalHabitat; }
   public void setLifespan(float animalLifespan) { lifespan = animalLifespan; }

   public static void setRegion(String animalRegion) { region = animalRegion; }
   public static void setProtectionRating(float rating) { protectionRating = rating; }

   public String getSpecies() { return species; }
   public float getWeight() { return weight; }
   public int getTagId() { return tagId; }
   public String getHabitat() { return habitat; }
   public float getLifespan() { return lifespan; }

   public static String getRegion() { return region; }
   public static float getProtectionRating() { return protectionRating; }
}
