//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GameFactory factoryMedieval;
        GameFactory factoryFuturistic;

        factoryMedieval = new MedievalFactory();
        factoryFuturistic = new FuturisticFactory();

        Game gameFuturistic = new Game(factoryFuturistic);
        gameFuturistic.play();

        Game gameMedieval = new Game(factoryMedieval);
        gameMedieval.play();

    }
}