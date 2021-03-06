package LuminousVector.Sandbox;

import LuminousVector.CSCI260.Excercies.ArrayQueue;
import LuminousVector.Utils.Console;

public class Sandbox
{
	public static void main(String[] args)
	{
		ArrayQueue<Integer> myQueue = new ArrayQueue<>();
		ArrayQueue<Integer> backupQueue = new ArrayQueue<>();
		Integer cur = null;
		try
		{
			while (!myQueue.isEmpty())
			{
				Console.log(cur = myQueue.dequeue());
				backupQueue.enqueue(cur);
			}
			myQueue = backupQueue;
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	static int TriPower(int n)
	{
		if(n == 0)
			return 1;
		if(n == 1)
			return 3;
		return 3 * TriPower(n-1);
	}

	private static String indent = "";

	static int factorial(int n)
	{
		Console.log(indent + "Sandbox: " + n);
		indent += "\t";
		int val = (n == 0) ? 1 : n * factorial(n-1);
		indent = indent.substring(1);
		Console.log(indent + "Return " + val);
		return val;
	}
}
