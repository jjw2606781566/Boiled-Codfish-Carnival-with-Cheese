package AbstractFactory;

public class SCLoreOfLUFactory implements JudgeIngredientFactory {
    //卢氏传说、星际老男孩
    @Override
    public Race CreateRace() {
        return new SCboy();
    }

    @Override
    public GameType CreateType() {
        return new LoreOfLU();
    }
}
