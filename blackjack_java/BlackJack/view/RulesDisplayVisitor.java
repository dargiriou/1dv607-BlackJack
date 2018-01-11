package BlackJack.view;

import BlackJack.model.rules.IHitStrategy;
import BlackJack.model.rules.INewGameStrategy;
import BlackJack.model.rules.IRulesVisitor;
import BlackJack.model.rules.IWinStrategy;

public class RulesDisplayVisitor implements IRulesVisitor
{
	@Override
	public void visitAmericanNewGameStrategy(INewGameStrategy americanNewGameStrategy) 
	{
		System.out.println("American Style new game deal\n");
	}

	@Override
	public void visitInternationalNewGameStrategy(INewGameStrategy internationalNewGameStrategy)
	{
		System.out.println("International Style new game deal\n");	
	}

	@Override
	public void visitBasicHitStrategy(IHitStrategy basicHitStrategy)
	{
		System.out.println("Basic hit approach\n");	
	}

	@Override
	public void visitSoft17HitStrategy(IHitStrategy soft17HitStrategy)
	{
		System.out.println("Soft 17 hit approach\n");
	}

	@Override
	public void visitDealerWinsStrategy(IWinStrategy dealerWinsStrategy)
	{
		System.out.println("Dealer wins in a case of a draw\n");
	}

	@Override
	public void visitPlayerWinsStrategy(IWinStrategy playerWinsStrategy)
	{
		System.out.println("Player wins in a case of a draw\n");	
	}
}
