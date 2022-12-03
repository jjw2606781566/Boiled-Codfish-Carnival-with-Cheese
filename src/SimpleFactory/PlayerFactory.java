package SimpleFactory;

import State.StateGood;

public class PlayerFactory {
    //创建并初始化运动员
    public Player createGame(String club, String nationality) {
        GameIngredientFactory gameIngredientFactory = new GameIngredientFactory();
        Player player = new Player();
        player.setPlayerClub(gameIngredientFactory.setClub(club));
        player.setPlayerNationality(gameIngredientFactory.setNationality(nationality));
        player.setPlayerName(nationality + club);
        if (player.getPlayerClub().getClub() == "IG") {
            player.setReaction(106);
            player.setHandspeed(98);
            player.setLuck(94);
            player.setEndurance(104);
            player.setIntelligence(100);
        } else if (player.getPlayerClub().getClub() == "EDG") {
            player.setReaction(103);
            player.setHandspeed(99);
            player.setLuck(100);
            player.setEndurance(101);
            player.setIntelligence(95);
        } else if (player.getPlayerClub().getClub() == "RNG") {
            player.setReaction(98);
            player.setHandspeed(104);
            player.setLuck(99);
            player.setEndurance(108);
            player.setIntelligence(102);
        }
        player.setRank(new int[]{0, 0, 0});
        player.setScore(new double[]{0, 0, 0});
        player.setPlayerState(new StateGood());
        return player;
    }

}
