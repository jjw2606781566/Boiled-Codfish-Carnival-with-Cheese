package AbstractFactory;

public class RRSeaCraftFactory implements JudgeIngredientFactory {
    //SC、RR
    @Override
    public Race CreateRace() {
        return new RedRab();
    }

    @Override
    public GameType CreateType() {
        return new SeaCraft(); 
    }
}
