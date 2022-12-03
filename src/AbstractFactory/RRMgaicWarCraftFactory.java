package AbstractFactory;

public class RRMgaicWarCraftFactory implements JudgeIngredientFactory {
    //SCboy、MW
    @Override
    public Race CreateRace() {
        return new RedRab();
    }

    @Override
    public GameType CreateType() {
        return new MgaicWarCraft();
    }
}
