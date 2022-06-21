package src;

public class A {

	public int getSum2(int aFirst,int aSecond)
	{
		return aFirst+ aSecond;
	}
	public int getSum3(int aFirst,int aSecond,int aThird)
	{
		return aFirst+ aSecond+aThird;
	}
	public int getPower(int aFirst,int aSecond)
	{
		int i=0,res=1;
		for(i=0;i<aSecond;i++)
		{
			res *=aFirst;
		}
		return res;
	}
}
