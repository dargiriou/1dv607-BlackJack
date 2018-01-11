package BlackJack.model.rules;

import BlackJack.model.Player;

public interface IWinStrategy {
	
	boolean IsDealerWinner(Player a_dealer, Player a_player, int g_maxScore);
}
