import static org.junit.Assert.*;

import java.awt.event.KeyEvent;
import org.junit.Before;
import org.junit.Test;

public class KeyboardListener_Test 
{
	KeyboardListener listener;
	public Window windowtest;
	
	@Before 
	public void setUp()
	{
		listener = new KeyboardListener();
		windowtest = new Window();
	}

	@Test 
	public void testRightArrowKey()
	{
		KeyEvent rightarrow = new KeyEvent(windowtest,KeyEvent.KEY_PRESSED, System.currentTimeMillis(),0, KeyEvent.VK_RIGHT,KeyEvent.CHAR_UNDEFINED);
		listener.keyPressed(rightarrow); // key press event for right arrow 
		assertEquals(1, ThreadsController.directionSnake); // checks if variable is updated or not
	
	}
	
	@Test
	public void testNotRightArrowKey()
	{
		ThreadsController.directionSnake = 2; // class is set to 2 (not right)
		KeyEvent notrightarrow = new KeyEvent(windowtest,KeyEvent.KEY_PRESSED, System.currentTimeMillis(),0, KeyEvent.VK_RIGHT,KeyEvent.CHAR_UNDEFINED);
		listener.keyPressed(notrightarrow); // key press event for right arrow 
		assertNotEquals(1, ThreadsController.directionSnake); // checks the direction
	}
	
	
	@Test
	public void testTopArrowKey()
	{
		KeyEvent Toparrow = new KeyEvent(windowtest,KeyEvent.KEY_PRESSED, System.currentTimeMillis(),0, KeyEvent.VK_UP,KeyEvent.CHAR_UNDEFINED);
		listener.keyPressed(Toparrow); // key press event for top arrow 
		assertEquals(3, ThreadsController.directionSnake); // checks if variable is updated or not
	} 
	
	@Test
	public void testNotTopArrowKey()
	{
		ThreadsController.directionSnake = 4; // class is set to 4 (not up)
		KeyEvent NotToparrow = new KeyEvent(windowtest,KeyEvent.KEY_PRESSED, System.currentTimeMillis(),0, KeyEvent.VK_UP,KeyEvent.CHAR_UNDEFINED);
		listener.keyPressed(NotToparrow); // key press event for top arrow 
		assertNotEquals(3, ThreadsController.directionSnake); // checks the direction
	} 
	
	@Test
	public void testLeftArrowKey()
	{
		ThreadsController.directionSnake = 2;
		KeyEvent leftarrow = new KeyEvent(windowtest,KeyEvent.KEY_PRESSED, System.currentTimeMillis(),0, KeyEvent.VK_LEFT,KeyEvent.CHAR_UNDEFINED);
		listener.keyPressed(leftarrow); // key press event for left arrow 
		assertEquals(2, ThreadsController.directionSnake); // checks if variable is updated or not
	}
	
	@Test
	public void testNotLeftArrowKey()
	{
		ThreadsController.directionSnake = 1; // class is set to 1 (not left)
		KeyEvent notleftarrow = new KeyEvent(windowtest,KeyEvent.KEY_PRESSED, System.currentTimeMillis(),0, KeyEvent.VK_LEFT,KeyEvent.CHAR_UNDEFINED);
		listener.keyPressed(notleftarrow); // key press event for left arrow 
		assertNotEquals(2, ThreadsController.directionSnake);  // checks the direction
	} 
	
	
	@Test
	public void testDownArrowKey()
	{
		KeyEvent downarrow = new KeyEvent(windowtest,KeyEvent.KEY_PRESSED, System.currentTimeMillis(),0, KeyEvent.VK_DOWN,KeyEvent.CHAR_UNDEFINED);
		//ThreadsController.directionSnake = 3; // class is set to 3 (not down)
		listener.keyPressed(downarrow); // key press event for down arrow 
		assertEquals(4, ThreadsController.directionSnake); // checks if variable is updated or not
	}
	
	@Test
	public void testNotDownArrowKey()
	{
		ThreadsController.directionSnake = 3; // class is set to 3 (not down)
		KeyEvent notdownarrow = new KeyEvent(windowtest,KeyEvent.KEY_PRESSED, System.currentTimeMillis(),0, KeyEvent.VK_DOWN,KeyEvent.CHAR_UNDEFINED);
		listener.keyPressed(notdownarrow); // key press event for down arrow 
		assertNotEquals(4, ThreadsController.directionSnake); // checks the direction
	}







}

	
	
	
