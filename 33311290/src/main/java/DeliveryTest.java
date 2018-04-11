import org.junit.Assert;
import org.junit.Test;

public class DeliveryTest {
	
	@Test
	public void test() {
		
		DeliveryService ds = new DeliveryService();
		PizzaShop ps = new PizzaShop();
		BurgerBude bb = new BurgerBude();
		DoenerLaden dl = new DoenerLaden();
		
		ds.setCaterer(ps);
		ds.deliver(42, "WilliAllee73");
		ds.deliver(42, "WilliAllee73");
		Assert.assertEquals(ps, ds.getCaterer());
		
		ds.deliver(42, "WilliAllee73");
		
		ds.setCaterer(bb);
		ds.deliver(42, "WilliAllee73");
		Assert.assertEquals(bb, ds.getCaterer());
		
		ds.setCaterer(dl);
		ds.deliver(42, "WilliAllee73");
		Assert.assertEquals(dl, ds.getCaterer());
	}
	
}
