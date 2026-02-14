package com.rider.app.controller;

import com.rider.app.bo.BookingBo;
import com.rider.app.service.RideService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ride")
public class RideController {

    private final RideService rideService;

    public RideController(RideService rideService) {
        this.rideService = rideService;
    }

    @GetMapping("/{source}/book/{destination}")
    public BookingBo bookRide(@PathVariable("source") String source, @PathVariable("destination") String destination) {
        return rideService.processBooking(source, destination);
    }
}
