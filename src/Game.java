public class Game {

    private Weapon weapon;
    private Vehicle vehicle;
    private Armor armor;

    public Game(GameFactory factory) {

        weapon = factory.createWeapon();
        vehicle = factory.createVehicle();
        armor = factory.createArmor();
    }

    public void play() {
        weapon.wear();
        vehicle.drive();
        armor.equip();
    }
}
