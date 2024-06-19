public class Skeleton extends Boss {
    private int numOfArrows;

    public Skeleton(int health, int damage, Weapon myWeapon, int numOfArrows) {
        super(health, damage, myWeapon);
        this.numOfArrows = numOfArrows;
    }

    public int getNumOfArrows() {
        return numOfArrows;
    }

    public void setNumOfArrows(int numOfArrows) {
        this.numOfArrows = numOfArrows;
    }

    @Override
    public void printInfo() {
        System.out.println("Boss health: " + super.getHealth() + ", damage: "
                + super.getDamage() + ", weapon type: "
                + super.getMyWeapon().getWeaponName() + ", type: "
                + super.getMyWeapon().getWeaponType());
    }
}
