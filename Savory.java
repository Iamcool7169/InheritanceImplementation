public class Savory extends BakedGoods {
    public Savory(String name, int cookingTime, int flourUsed) {
        super(name, cookingTime, flourUsed);
    }

    @Override
    public String getFlourUsedInfo() {
        return "Savory " + getName() + ": " + getFlourUsed() + " grams of flour used";
    }
}
