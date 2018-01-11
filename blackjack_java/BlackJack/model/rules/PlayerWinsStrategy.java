package BlackJack.model.rules;
import BlackJack.model.Player;

class PlayerWinsStrategy implements IWinStrategy {

	@Override
	public boolean IsDealerWinner(Player a_dealer, Player a_player, int g_maxScore) {
		if(a_dealer.CalcScore() > g_maxScore)
			return false;
		if(a_player.CalcScore() > g_maxScore)
			return true;
		else if (a_dealer.CalcScore() <= a_player.CalcScore())
			return false;
		return false;
	}
}