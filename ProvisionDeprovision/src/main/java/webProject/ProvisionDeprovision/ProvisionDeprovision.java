package webProject.ProvisionDeprovision;

public interface ProvisionDeprovision {
	
	
	public ProvisionData loginRequest(Object dto);
	
	public ProvisionData goProvision(Object dto);
	
	public ProvisionData getHLRStatus(Object dto);
	
	public ProvisionData goDeprovisioin(Object dto);
	
	public ProvisionData goLogout(Object dto);
	
}
