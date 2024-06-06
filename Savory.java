public class Savory extends BakedGoods {
    public Savory(String name, int cookingTime, int flourUsed) {
        super(name, cookingTime, flourUsed);
    }

    public String getFlourUsedInfo() {
        return "Savory " + getName() + ": " + getFlourUsed() + " grams of flour used";
    }
}
