package BlackJack.model.rules;
import BlackJack.model.Player;

class DealerWinsStrategy implements IWinStrategy {

	@Override
	public boolean IsDealerWinner(Player a_dealer, Player a_player, int g_maxScore) {
		if(a_dealer.CalcScore() > g_maxScore)
			return false;
		if(a_player.CalcScore() > g_maxScore)
			return true;
		else if (a_player.CalcScore() <= a_dealer.CalcScore())
			return true;
		return false;
	}
}


