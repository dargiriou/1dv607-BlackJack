package BlackJack.model.rules;

public class RulesFactory implements IRulesFactory
{

	@Override
	public IRules ProduceAmericanDealerWinsCombo() 
	{
		return new AmericanDealerWinsCombo();
	}

	@Override
	public IRules ProduceAmericanPlayerWinsCombo()
	{
		return new AmericanPlayerWinsCombo();
	}

	@Override
	public IRules ProduceInternationalDealerWinsCombo()
	{
		return new InternationalDealerWinsCombo();
	}

	@Override
	public IRules ProduceInternationalPlayerWinsCombo()
	{
		return new InternationalPlayerWinsCombo();
	}

	@Override
	public IRules ProduceAmericanDealerWinsComboSoft17()
	{
		return new AmericanDealerWinsComboSoft17();
	}

	@Override
	public IRules ProduceAmericanPlayerWinsComboSoft17()
	{
		return new AmericanPlayerWinsComboSoft17();
	}

	@Override
	public IRules ProduceProduceInternationalDealerWinsComboSoft17()
	{
		return new InternationalDealerWinsComboSoft17();
	}

	@Override
	public IRules ProduceProduceInternationalPlayerWinsComboSoft17()
	{
		return new InternationalPlayerWinsComboSoft17();
	}

}