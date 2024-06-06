public class Sweet extends BakedGoods {
    public Sweet(String name, int cookingTime, int flourUsed) {
        super(name, cookingTime, flourUsed);
    }

    @Override
    public String getFlourUsedInfo() {
        return "Sweet " + getName() + ": " + getFlourUsed() + " grams of flour used";
    }
}
