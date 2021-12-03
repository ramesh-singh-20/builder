package com.alphacoder.designpattern.builder;

import com.alphacoder.designpattern.cars.CarType;
import com.alphacoder.designpattern.features.Engine;
import com.alphacoder.designpattern.features.GPSNavigator;
import com.alphacoder.designpattern.features.Transmission;
import com.alphacoder.designpattern.features.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
