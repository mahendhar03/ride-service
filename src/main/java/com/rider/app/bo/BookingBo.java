package com.rider.app.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingBo {
    private String source;
    private String destination;
    private String vehicleName;
    private String riderName;
}
