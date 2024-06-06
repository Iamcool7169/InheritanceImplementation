public class Main {
    public static void main(String[] args) {
        Bagel bagel = new Bagel(20, 150);
        Bread bread = new Bread(30, 300);
        Crepe crepe = new Crepe(5, 50);
        Donut donut = new Donut(10, 100);
        Eclair eclair = new Eclair(25, 200);

        System.out.println(bagel.getFlourUsedInfo());
        System.out.println(bread.getFlourUsedInfo());
        System.out.println(crepe.getFlourUsedInfo());
        System.out.println(donut.getFlourUsedInfo());
        System.out.println(eclair.getFlourUsedInfo());
    }
}
