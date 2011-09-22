public class MiniDuckSim
{
	public static void main(String[] args)
	{
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performQuack();
		mallard.performFly();
	}
}