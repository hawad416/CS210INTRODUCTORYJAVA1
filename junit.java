package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureTest {

	
	
Temperature myTemp = new Temperature();


	double fTemp = 72;
	double celTemp = 15;
	double cDiff = 1;
	
	
	double resultTemp1 = 22.2222;
	
	double resultTemp2 = 59;
	
	double testTemp1 = myTemp.toCelsius(fTemp);
	double testTemp2 = myTemp.toFahrenheit(celTemp);
	
	@Test
	public void testtoCelsius() 
	{
		System.out.println(fTemp + " degrees Fahrenheit converted to Celsius equals " + myTemp.toCelsius(fTemp));
        assertEquals(resultTemp1, testTemp1, cDiff);	
        
	}
	@Test
	
	public void testtoFahrenheit() 
		{
		System.out.println(celTemp + " degrees Celsius converted to Fahrenheit equals " + myTemp.toFahrenheit(celTemp));
	
	
		}
	}    
	
	
