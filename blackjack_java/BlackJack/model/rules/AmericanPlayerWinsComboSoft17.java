package BlackJack.model.rules;

public class AmericanPlayerWinsComboSoft17 implements IRules
{

	@Override
	public IHitStrategy GetHitRule()
	{
		return new Soft17Strategy();
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
		visitor.visitSoft17HitStrategy(GetHitRule());
		visitor.visitAmericanNewGameStrategy(GetNewGameRule());
		visitor.visitPlayerWinsStrategy(GetWinRule());
	}

}
