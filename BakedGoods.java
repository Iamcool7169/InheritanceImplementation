public class BakedGoods {
    private String name;
    private int cookingTime; // in minutes
    private int flourUsed; // in grams

    public BakedGoods(String name, int cookingTime, int flourUsed) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.flourUsed = flourUsed;
    }

    // Getter and Setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter methods for cooking time
    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    // Getter and Setter methods for flour used
    public int getFlourUsed() {
        return flourUsed;
    }

    public void setFlourUsed(int flourUsed) {
        this.flourUsed = flourUsed;
    }

    public String getFlourUsedInfo() {
        return flourUsed + " grams of flour used";
    }
}
