package BlackJack.model.rules;

public class InternationalDealerWinsCombo implements IRules
{

	@Override
	public IHitStrategy GetHitRule()
	{
		return new BasicHitStrategy();
	}

	@Override
	public INewGameStrategy GetNewGameRule()
	{
		return new InternationalNewGameStrategy();
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
		visitor.visitInternationalNewGameStrategy(GetNewGameRule());
		visitor.visitDealerWinsStrategy(GetWinRule());
	}

}
