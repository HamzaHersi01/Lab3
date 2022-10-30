import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class VendingMachineMain {
	
	@Test
	public void testInitBal() {
		VendingMachine q= new VendingMachine();
		
		if(q.getBalance()== 0) {
			System.out.println("The balance is "+q.getBalance()+". Test Passed");
		}else {
			System.out.println("The balance is "+q.getBalance()+". Test failed. Expected 0.");
		}
		
		
	}
	
	@Test
	public void testInitRev() {
		VendingMachine w= new VendingMachine();
		
		if(w.getRevenue()== 0) {
			System.out.println("The revenue is "+w.getRevenue()+". Test Passed");
		}else {
			System.out.println("The revenue is "+w.getRevenue()+". Test failed. Expected 0.");
		}
		
		
	}
	
	@Test
	public void testInsertCoin() {
		VendingMachine e= new VendingMachine();
		equals(e.getBalance());
		e.insertCoin();
		if(e.getBalance()== 1) {
			System.out.println("The balance has been updated and is now "+e.getBalance()+". Test Passed");
		}else {
			System.out.println("The balance is "+e.getBalance()+". Test failed. Expected 0.");
		}
		

		
	}
	@Test
	public void testRefund() {
		VendingMachine r= new VendingMachine();
		r.insertCoin();
		equals(r.getBalance());
		r.refund();
		if(r.getBalance()== 0) {
			System.out.println("The balance has been refunded "+r.getBalance()+". Test Passed");
		}else {
			System.out.println("The balance is "+r.getBalance()+". Test failed. Expected 0.");
		}
		
		
	}
	
	@Test
	public void testVendFaliure() {
		VendingMachine t= new VendingMachine();
		equals(t.getBalance());
		if(t.vendCandyBar()== false) {
			System.out.println("The balance was not sufficent:"+t.getBalance()+". Test Passed");
		}else {
			System.out.println("Expected condition is false test failed.");
		}
		
		
	}
	
	@Test
	public void testVendSuccess() {
		VendingMachine y= new VendingMachine();
		y.insertCoin();
		y.insertCoin();
		y.insertCoin();
		equals(y.getBalance());
		if(y.vendCandyBar()== true) {
			System.out.println("Vending success.Test Passed");
		}else {
			System.out.println("Test failed.");
		}
		
		
	}
	
	
	

}




//VendingMachineMain vm= new VendingMachineMain();