package BlackJack.model.rules;

public class AmericanDealerWinsCombo implements IRules{

	@Override
	public IHitStrategy GetHitRule()
	{
		return new BasicHitStrategy();
	}

	@Override
	public INewGameStrategy GetNewGameRule() 
	{
		return new AmericanNewGameStrategy();
	}

	@Override
	public IWinStrategy GetWinRule() 
	{
			return new DealerWinsStrategy();
	}

	@Override
	public void accept(IRulesVisitor visitor)
	{
		visitor.visitBasicHitStrategy(GetHitRule());
		visitor.visitAmericanNewGameStrategy(GetNewGameRule());
		visitor.visitDealerWinsStrategy(GetWinRule());
	}
	
}
