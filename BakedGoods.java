public class BakedGoods {
    private String name;
    private int cookingTime;
    private int flourUsed;

    public BakedGoods(String name, int cookingTime, int flourUsed) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.flourUsed = flourUsed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

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
