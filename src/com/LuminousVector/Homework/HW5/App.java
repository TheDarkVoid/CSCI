package com.LuminousVector.Homework.HW5;

import java.util.Scanner;
import java.io.*;

import com.LuminousVector.Utils.Debug;

public class App
{
	public static void main(String[] args)
	{
		Transaction t = new Transaction();
		Scanner in = new Scanner(System.in);
		while (t.IsActive())
		{
			Debug.log("Enter '-END-' to finish.");
			Debug.lognr("Enter item name: ");
			String itemName = in.next();
			if (itemName.equalsIgnoreCase("-END-"))
			{
				t.End();
				break;
			}
			Debug.lognr("Enter item price: ");
			float itemPrice = in.nextFloat();
			Debug.lognr("Enter item count: ");
			int itemCount = in.nextInt();
			t.AddItem(itemName, itemPrice, itemCount);
		}
		in.close();
		String log = t.GetLog();
		File f = new File("output.txt");
		try
		{
			if (!f.exists())
			{
				f.createNewFile();
			}
			FileWriter fw = new FileWriter("output.txt");
			fw.append(log);
			fw.flush();
			fw.close();
		} catch (Exception e)
		{
			Debug.log(e.getMessage());
		}
		Debug.log(log);
	}
}
