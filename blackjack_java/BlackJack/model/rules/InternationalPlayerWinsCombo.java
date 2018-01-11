package BlackJack.model.rules;

public class InternationalPlayerWinsCombo implements IRules
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
		return new PlayerWinsStrategy();
	}
	
	@Override
	public void accept(IRulesVisitor visitor)
	{
		visitor.visitBasicHitStrategy(GetHitRule());
		visitor.visitInternationalNewGameStrategy(GetNewGameRule());
		visitor.visitPlayerWinsStrategy(GetWinRule());
	}
}
