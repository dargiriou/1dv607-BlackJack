package BlackJack;

import BlackJack.model.Game;
import BlackJack.model.rules.IRules;
import BlackJack.model.rules.IRulesFactory;
import BlackJack.model.rules.RulesFactory;
import BlackJack.view.*;
import BlackJack.controller.*;

public class Program
{

  public static void main(String[] a_args)
  {
	  IView v = new SimpleView(); //new SwedishView();
	  v.DisplayWelcomeMessage();
	  v.DisplayRules();
	  IRulesFactory factory = new RulesFactory();
	  RulesDisplayVisitor visitor = new RulesDisplayVisitor();
	  IRules rulesApplied = factory.ProduceAmericanDealerWinsCombo();
	  rulesApplied.accept(visitor);
    Game g = new Game(rulesApplied);
    
    PlayGame ctrl = new PlayGame(v,g);  
    
    while (ctrl.Play(g, v));
  }
}