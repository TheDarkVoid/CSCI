package LuminousVector.CSCI260.Excercies;

public interface IIntLog
{
	IIntLog insert(int integer);

	boolean contains(int integer);

	int size();

	String toString();

	String getName();

	IIntLog clear();

	int sum();

	float average();

	int max();
}
