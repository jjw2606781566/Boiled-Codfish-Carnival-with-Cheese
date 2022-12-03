package AbstractFactory;

public class SCMgaicWarCraftFactory implements JudgeIngredientFactory {
    //SCboy、MW
    @Override
    public Race CreateRace() {
        return new SCboy();
    }

    @Override
    public GameType CreateType() {
        return new MgaicWarCraft();
    }
}
