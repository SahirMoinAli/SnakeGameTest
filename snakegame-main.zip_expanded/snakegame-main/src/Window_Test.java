
import static org.junit.Assert.*;

import java.awt.event.KeyListener;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class Window_Test {
	
	Window windowtest ;
	
	@Before
	public void setup()
	{
		windowtest = new Window();
	}
	
	@Test
	public void testGrid() // Testing the grid Initialization 
	{
		assertNotNull(Window.Grid);
		assertEquals(20,Window.Grid.size()); // verifies that there are 20 rows(Outer Array)
		assertEquals(20, Window.Grid.get(0).size()); // verifies that there are 20*20 matrix(Inner Array)
	}
	
	@Test
	public void testKeyboardListener()
	{
		KeyListener[] Listener = windowtest.getKeyListeners(); // retrieves the array 
		assertNotNull(Listener); // verifies its not null
		assertEquals(1, Listener.length); // verifies one listener is connected
	}
	
	@Test 
	public void testSquares()
	{
		for (ArrayList<DataOfSquare> row: Window.Grid) // outer loop for number of rows 
		{
			for (DataOfSquare No_square: row) // inner loop for each square
			{
				assertNotNull(No_square);
			}
		}
	}
	
}
