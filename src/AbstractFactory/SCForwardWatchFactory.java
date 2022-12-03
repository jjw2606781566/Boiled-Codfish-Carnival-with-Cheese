package AbstractFactory;

public class SCForwardWatchFactory implements JudgeIngredientFactory {
    //FW、星际老男孩
    @Override
    public Race CreateRace() {
        return new SCboy();
    }

    @Override
    public GameType CreateType() {
        return new ForwardWatch();
    }
}
