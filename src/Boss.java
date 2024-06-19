public class Boss extends GameEntity {
    private Weapon myWeapon;

    public Boss(int health, int damage, Weapon myWeapon) {
        super(health, damage);
        this.myWeapon = myWeapon;
    }

    public Weapon getMyWeapon() {
        return myWeapon;
    }

    public void setMyWeapon(Weapon myWeapon) {
        this.myWeapon = myWeapon;
    }

    public void printInfo() {
        System.out.println("Boss health: " + super.getHealth() + ", damage: "
                + super.getDamage() + ", weapon: "
                + getMyWeapon().getWeaponName() + ", type: "
                + getMyWeapon().getWeaponType());
    }
}
