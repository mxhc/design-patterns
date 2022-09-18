package org.mxhc.builders;

import org.mxhc.components.Engine;
import org.mxhc.components.GPSNavigator;
import org.mxhc.components.Transmission;
import org.mxhc.components.TripComputer;
import org.mxhc.products.CarType;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
