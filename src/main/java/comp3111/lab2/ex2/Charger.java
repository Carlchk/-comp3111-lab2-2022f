package comp3111.lab2.ex2;

interface Chargeable {
	public void charge();
//	public void testPrint();
}

public class Charger {
	public void charge(Chargeable c) {
		c.charge();
	}

//	public void testPrint(Chargeable c) {
//		c.testPrint();
//	}

}
