package AbstractFactory;

public class RRForwardWatchFactory implements JudgeIngredientFactory {
    //FW、RR
    @Override
    public Race CreateRace() {
        return new RedRab();
    }

    @Override
    public GameType CreateType() {
        return new ForwardWatch();
    }
}
