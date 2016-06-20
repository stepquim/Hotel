package Pruebas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Clases.Habitacion;;

public class HabitacionTest {

public Habitacion H;

	
	@Before       
	public void BeforeHotel1() { 
		H= new Habitacion("sencilla","H",19);
	}
	
	@Test       
	public void testPizza1() {
		BeforeHotel1();
		int res = H.getPrecioHabitacion();
		int esperado=150;
		assertEquals(res, esperado);
		
	} 
	
	@Before       
	public void BeforeHotel2() { 
		H= new Habitacion("doble","H",60);
	}
	
	@Test       
	public void testPizza2() {
		BeforeHotel2();
		int res = H.getPrecioHabitacion();
		int esperado=150;
		assertEquals(res, esperado);
	}
	
	@Before       
	public void BeforeHotel3() { 
		H= new Habitacion("sencilla","G",60);
	}
	
	
	@Test       
	public void testPizza3() {
		BeforeHotel3();
		int res = H.getPrecioHabitacion();
		int esperado=-1;
		assertEquals(res, esperado);
	}
	
	

}
