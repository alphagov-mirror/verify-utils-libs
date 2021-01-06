package uk.gov.ida.resources;


import uk.gov.ida.common.CommonUrls;
import uk.gov.ida.common.ServiceNameDto;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path(CommonUrls.SERVICE_NAME_ROOT)
public class ServiceNameResource {

    private ServiceNameDto serviceNameDto;

    public ServiceNameResource(String serviceName) {
        this.serviceNameDto = new ServiceNameDto(serviceName);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ServiceNameDto getServiceName() {
        return serviceNameDto;
    }
}
