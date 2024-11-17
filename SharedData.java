package tirgul2;
import java.util.ArrayList;

/** 
 * @author Noa Shitrit
 * @author Ron Kroitoro
 * @version 1.0
 */
public class SharedData 
{
	/** integer array list for storing shared data */
	private  ArrayList<Integer> array;
	/** boolean array of solutions for the indexes in the array */
	private boolean [] winArray; 
	/** flag to sign if solution found by any thread */
	private boolean flag;
	/** number the user inputs */
	private final int b;
	
	/**
	 * @param array - integer array list for storing data
	 * @param b - length of array
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**
	 * @return current winArray
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * @param winArray - the boolean array to set
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * @return the integer array
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * @return the value of b
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * @return the value of flag
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * @param flag - the boolean value to set for the flag
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
