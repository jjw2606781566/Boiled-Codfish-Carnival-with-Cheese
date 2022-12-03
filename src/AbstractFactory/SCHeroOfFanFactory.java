package AbstractFactory;

public class SCHeroOfFanFactory implements JudgeIngredientFactory {
    //风扇英雄
    @Override
    public Race CreateRace() {
        return new SCboy();
    }

    @Override
    public GameType CreateType() {
        return new HeroOfFan();
    }
}