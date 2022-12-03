package AbstractFactory;

public class RRLoreOfLUFactory implements JudgeIngredientFactory {
    //赤小兔、卢氏传说
    @Override
    public Race CreateRace() {
        return new RedRab();
    }

    @Override
    public GameType CreateType() {
        return new LoreOfLU();
    }
}
