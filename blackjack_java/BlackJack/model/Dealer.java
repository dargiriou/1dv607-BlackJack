package BlackJack.model;

import BlackJack.model.rules.*;

public class Dealer extends Player {

  private Deck m_deck;
  private INewGameStrategy m_newGameRule;
  private IHitStrategy m_hitRule;
  private IWinStrategy m_winRule;

  public Dealer(IRules rules) {
  
    m_newGameRule = rules.GetNewGameRule();
    m_hitRule = rules.GetHitRule();
    m_winRule = rules.GetWinRule();
    
    /*for(Card c : m_deck.GetCards()) {
      c.Show(true);
      System.out.println("" + c.GetValue() + " of " + c.GetColor());
    }    */
  }
  public boolean NewGame(Player a_player) {
    if (m_deck == null || IsGameOver()) {
      m_deck = new Deck();
      ClearHand();
      a_player.ClearHand();
      return m_newGameRule.NewGame(this, a_player);   
    }
    return false;
  }

  public boolean Hit(Player a_player) {
    if (m_deck != null && a_player.CalcScore() < g_maxScore && !IsGameOver()) {
    	DealCardTo(a_player, true);     
      return true;
    }
    return false;
  }

  public boolean IsDealerWinner(Player a_player) {
	  return m_winRule.IsDealerWinner(this, a_player, g_maxScore);
  }

  public boolean IsGameOver() {
    if (m_deck != null && m_hitRule.DoHit(this) != true) {
        return true;
    }
    return false;
  }
  
  public boolean Stand(){
	  if(m_deck!= null)
	  {
		  this.ShowHand();
		  while(m_hitRule.DoHit(this))
		  {
			 m_hitRule.DoHit(this);
			  DealCardTo(this, true);
		  }
		  return true;
	  }

	return false;
  }
  
  public void DealCardTo(Player a_player, boolean show){
		 Card c = m_deck.GetCard();
		  c.Show(show);
		  a_player.DealCard(c);
  }
}