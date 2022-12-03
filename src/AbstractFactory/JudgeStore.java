package AbstractFactory;

public class JudgeStore {
    //单例模式
    private static JudgeStore instance = new JudgeStore();
    private JudgeStore() { }
    public static JudgeStore getInstance() {
        return instance;
    }

    //选择对应工厂
    public Judge createJudge(String JudgeName) {

        Judge judge = new Judge();
        JudgeIngredientFactory factory;

        switch (JudgeName) {
            case "LoreOfLU"://LL 卢氏传说
                factory = new LoreOfLUFactory();
                judge.setFactory(factory);
                break;
            case "SeaCraft"://SC 星河争霸3
                factory = new SeaCraftFactory();
                judge.setFactory(factory);
                break;
            case "MgaicWarCraft"://MWC 魔怪争霸2
                factory = new MgaicWarCraftFactory();
                judge.setFactory(factory);
                break;
            case "ForwardWatch"://FW 守望前锋：再也不来
                factory = new ForwardWatchFactory();
                judge.setFactory(factory);
                break;
            case "HeroOfFan"://HOF 风扇英雄
                factory = new HeroOfFanFactory();
                judge.setFactory(factory);
                break;
            default:
                break;
        }

        return judge;
    }

    //设置项目、国籍
    public Judge orderJudge(String JudgeName) {
        Judge judge = createJudge(JudgeName);
        judge.setGameType(judge.getFactory().CreateType());
        judge.setJudgeRace(judge.getFactory().CreateRace());
        return judge;
    }

}
