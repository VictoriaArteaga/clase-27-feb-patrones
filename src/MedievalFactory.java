public class MedievalFactory implements GameFactory{

    public Weapon createWeapon() {
        return new MedievalSword();
    }

    public Vehicle createVehicle() {
        return new MedievalHorse();
    }

    public Armor createArmor() {
        return new MedievalArmor();
    }

}
