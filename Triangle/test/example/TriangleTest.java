package example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;

public class TriangleTest { 
	 
    @Test 
    public void equilateralTriangleHaveEqualSides() throws Exception { 
        Triangle triangle = new Triangle(2, 2, 2); 
 
        assertEquals(TriangleKind.EQUILATERAL, triangle.getKind()); 
    }
    
    @Test
    public void isoscelesHaveTwoEqualSides() throws Exception{
    	Triangle triangle = new Triangle(3,2,3);
    	
    	assertEquals(TriangleKind.ISOSCELES, triangle.getKind()); 
    }
    @Test
    public void scaleneHaveAllDiferentSides() throws Exception{
    	Triangle triangle = new Triangle(3,2,4); //(3,2,1) ->falha 
    	
    	assertEquals(TriangleKind.SCALENE, triangle.getKind()); 
    }
    
  
}