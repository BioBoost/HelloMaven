package be.vives.oop.hellomaven;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SquareTest {
    
    public SquareTest() {
    }

    /**
     * Test of getSize method, of class Square.
     */
    @org.junit.Test
    public void testGetSize() {
      System.out.println("Running testGetSize");
      double size = 15;
      Square instance = new Square(size);
      assertEquals(size, instance.getSize(), 0.001);
    }

    /**
     * Test of setSize method, of class Square.
     */
    @org.junit.Test
    public void testSetSize() {
      Square instance = new Square(2);
      double size = 15;
      instance.setSize(size);
      assertEquals(size, instance.getSize(), 0.001);
    }

    /**
     * Test of area method, of class Square.
     */
    @org.junit.Test
    public void testArea() {
      Square instance = new Square(2);
      double expResult = 4.0;
      assertEquals(expResult, instance.area(), 0.001);
    }
    
}
