

public class Caterer {
	
	private DeliveryService ds;
	int foodNo = 0;
	String address;

	public DeliveryService getDs() {
		return ds;
	}

	public void setDs(DeliveryService ds) {
		if(this.ds != ds) {
			DeliveryService oldDs = this.ds;
			if(oldDs != null) {
				oldDs.setCaterer(null);
			}
			this.ds = ds;
			
			if(this.ds != null) {
				this.ds.setCaterer(this);
			}
		}
	}
	
	public void deliver(int foodNo, String address) {
		
	}

}
