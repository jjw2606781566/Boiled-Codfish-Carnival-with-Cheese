package AbstractFactory;

public class RRHeroOfFanFactory implements JudgeIngredientFactory {
    //风扇英雄
    @Override
    public Race CreateRace() {
        return new RedRab();
    }

    @Override
    public GameType CreateType() {
        return new HeroOfFan();
    }
}