
public class DeliveryService {
	
	public Caterer caterer;
	
	public void setCaterer(Caterer caterer) {
		if(this.caterer != caterer){
			Caterer oldCaterer = this.caterer;
			if(oldCaterer != null){
				this.caterer = null;
				oldCaterer.setDs(null);
			}	
			
			this.caterer = caterer;
			
			if(this.caterer != null){
				this.caterer.setDs(this);
			}
		}
	}
	
	public Caterer getCaterer() {
		return caterer;
	}
	
	
	public void deliver(int foodNo, String address) {
		this.getCaterer().deliver(foodNo, address);
		System.out.println(foodNo + " " + address);
	}

}
