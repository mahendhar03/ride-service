package com.rider.app.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class VehicleServiceClient {
    @Value("${vehicle.service.uri}")
    public String vehicleURI;

    public RestTemplate restTemplate;

    public VehicleServiceClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public VehicleBo getVehicleForRide() {
        String vehicleServiceURL = vehicleURI + "/vehicle/ride";
        return restTemplate.getForObject(vehicleServiceURL, VehicleBo.class);
    }
}
