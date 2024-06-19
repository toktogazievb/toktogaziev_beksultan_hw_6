public class Main {
    Boss myBoss = new Boss(700, 50, new Weapon(WeaponType.SPEAR, "KILLER"));

    public static void main(String[] args) {
        Skeleton skeleton1 = new Skeleton(300, 30,
                new Weapon(WeaponType.BOW, "EAGLE"), 7);
        Skeleton skeleton2 = new Skeleton(320, 20,
                new Weapon(WeaponType.CROSSBOW, "COOL"), 10);

        skeleton1.printInfo();
        skeleton2.printInfo();
    }


}