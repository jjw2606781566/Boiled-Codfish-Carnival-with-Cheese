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
            case "SCLL"://LL 卢氏传说 SC
                factory = new SCForwardWatchFactory();
                judge.setFactory(factory);
                break;
            case "SCSC"://SC 星河争霸3 SC
                factory = new SCHeroOfFanFactory();
                judge.setFactory(factory);
                break;
            case "SCMWC"://MWC 魔怪争霸2 SC
                factory = new SCLoreOfLUFactory();
                judge.setFactory(factory);
                break;
            case "SCFW"://FW 守望前锋：再也不来 SC
                factory = new SCMgaicWarCraftFactory();
                judge.setFactory(factory);
                break;
            case "SCHOF"://HOF 风扇英雄 SC
                factory = new SCSeaCraftFactory();
                judge.setFactory(factory);
                break;
            case "RRLL"://LL 卢氏传说 RR
                factory = new RRForwardWatchFactory();
                judge.setFactory(factory);
                break;
            case "RRSC"://SC 星河争霸3 RR
                factory = new RRHeroOfFanFactory();
                judge.setFactory(factory);
                break;
            case "RRMWC"://MWC 魔怪争霸2 RR
                factory = new RRLoreOfLUFactory();
                judge.setFactory(factory);
                break;
            case "RRFW"://FW 守望前锋：再也不来 RR
                factory = new RRMgaicWarCraftFactory();
                judge.setFactory(factory);
                break;
            case "RRHOF"://HOF 风扇英雄 RR
                factory = new RRSeaCraftFactory();
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
