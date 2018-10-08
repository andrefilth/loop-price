package br.com.loop.pi.price.core.client.DTO;

public class CarDTO {
	
	private String myRequests;

	public String getPlaca() {
		return myRequests;
	}

	public void setPlaca(String myRequests) {
		this.myRequests = myRequests;
	}

	@Override
	public String toString() {
		return "CarDTO [" + (myRequests != null ? "Placa=" + myRequests : "") + "]";
	}

	
	

}
