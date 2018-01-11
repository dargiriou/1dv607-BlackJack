package BlackJack.model.rules;
import BlackJack.model.Card;
import BlackJack.model.Player;

class Soft17Strategy extends BasicHitStrategy
{

    @Override
    public boolean DoHit(Player a_dealer)
    {
		if(softAce(a_dealer) == true && a_dealer.CalcScore() == g_hitLimit)
		{
			return true;
		}
		return super.DoHit(a_dealer);
	}
    
    private boolean softAce(Player a_dealer)
    {
		for(Card c: a_dealer.GetHand())
		{
			if(c.GetValue() == Card.Value.Ace)
			{
				return true;
			}
		}
		return false;
    }
}



