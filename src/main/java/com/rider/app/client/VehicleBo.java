package com.rider.app.client;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class VehicleBo {
    private String vehicleName;
    private String vehicleType;
    private String vehicleColor;
    private String vehicleModel;
    private String vehicleYear;
    private String vehicleEngine;
    private String riderName;
}
