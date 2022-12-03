package AbstractFactory;

public class SCSeaCraftFactory implements JudgeIngredientFactory {
    //SC、SCboy
    @Override
    public Race CreateRace() {
        return new SCboy();
    }

    @Override
    public GameType CreateType() {
        return new SeaCraft(); 
    }
}
