package BlackJack.controller;
import BlackJack.view.IView;
import BlackJack.view.IView.EnumInput;
import BlackJack.model.Game;

public class PlayGame implements BlackJack.model.ICardDealtObserver
{

	private IView a_view;
	private Game a_game;
	
	public  PlayGame(IView a_view, Game a_game)
	{
		a_view.DisplayInstructions();
		this.a_view = a_view;
		this.a_game = a_game;
		this.a_game.addSubscribers(this);
	}
  public boolean Play(Game a_game, IView a_view) 
  {	  
    EnumInput in = a_view.GetEnumInput();
    switch (in){
    case play: a_game.NewGame();break;
    case hit: a_game.Hit();break;
    case stand: a_game.Stand();break;
    default:break;}
    return in != EnumInput.quit;
  }

@Override
public void CardDealt() 
{

    try {
    	a_view.CreateSpace();
    	a_view.DisplayInstructions();
		a_view.DisplayDealerHand(a_game.GetDealerHand(), a_game.GetDealerScore());
		a_view.DisplayPlayerHand(a_game.GetPlayerHand(), a_game.GetPlayerScore());
		if (a_game.IsGameOver())
		{
		    a_view.DisplayGameOver(a_game.IsDealerWinner());
		}
		Thread.sleep(2000);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}