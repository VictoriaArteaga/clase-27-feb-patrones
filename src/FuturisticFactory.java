public class FuturisticFactory implements GameFactory{

    public Weapon createWeapon() {
        return new LaserFuturistic();
    }

    public Vehicle createVehicle() {
        return new MotoFlyingFuturistic();
    }

    public Armor createArmor() {
        return new SpaceSuitFuturistic();
    }
}
