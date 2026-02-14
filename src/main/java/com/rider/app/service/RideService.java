package com.rider.app.service;

import com.rider.app.bo.BookingBo;
import com.rider.app.client.VehicleBo;
import com.rider.app.client.VehicleServiceClient;
import org.springframework.stereotype.Service;

@Service
public class RideService {
    private final VehicleServiceClient vehicleServiceClient;

    public RideService(VehicleServiceClient vehicleServiceClient) {
        this.vehicleServiceClient = vehicleServiceClient;
    }

    public BookingBo processBooking(String source, String destination) {
        VehicleBo vehicleBo = vehicleServiceClient.getVehicleForRide();
        return new BookingBo(source,destination,vehicleBo.getVehicleName(),vehicleBo.getRiderName());
    }
}
