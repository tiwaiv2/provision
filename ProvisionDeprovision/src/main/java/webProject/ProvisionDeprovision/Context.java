package webProject.ProvisionDeprovision;


public class Context {
    private ProvisionDeprovision provisionDeprovision;
    public Context(ProvisionDeprovision provisionDeprovision) {
        this.provisionDeprovision = provisionDeprovision;
    }
    public ProvisionData executeTheProvision(ProvisionData dto) {
        this.provisionDeprovision.loginRequest(dto);
        if(dto.getStatusCode().equals("200"))
        this.provisionDeprovision.goProvision(dto);
        if(dto.getStatusCode().equals("200"))
        this.provisionDeprovision.getHLRStatus(dto);
        if(dto.getStatusCode().equals("200"))
        this.provisionDeprovision.goDeprovisioin(dto);
        if(dto.getStatusCode().equals("200"))
        this.provisionDeprovision.getHLRStatus(dto);
        if(dto.getStatusCode().equals("200"))
        this.provisionDeprovision.goLogout(dto);
		return dto;
    }
    
    public ProvisionData Provision(ProvisionData dto) {
        this.provisionDeprovision.loginRequest(dto);
        if(dto.getStatusCode().equals("200"))
        this.provisionDeprovision.goProvision(dto);
        if(dto.getStatusCode().equals("200"))
        this.provisionDeprovision.goLogout(dto);
		return dto;
    }
    
    public ProvisionData goDeProvision(ProvisionData dto) {
        this.provisionDeprovision.loginRequest(dto);
        if(dto.getStatusCode().equals("200"))
        this.provisionDeprovision.goDeprovisioin(dto);
        if(dto.getStatusCode().equals("200"))
        this.provisionDeprovision.goLogout(dto);
		return dto;
    }
}
