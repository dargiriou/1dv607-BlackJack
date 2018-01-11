package BlackJack.model.rules;

public class AmericanPlayerWinsCombo implements IRules
{

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
		return new PlayerWinsStrategy();
	}
	
	@Override
	public void accept(IRulesVisitor visitor)
	{
		visitor.visitBasicHitStrategy(GetHitRule());
		visitor.visitAmericanNewGameStrategy(GetNewGameRule());
		visitor.visitPlayerWinsStrategy(GetWinRule());
	}

}
