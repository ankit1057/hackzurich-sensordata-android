package mavo.zuehlkeschindlerapp.SensorData;

import org.json.JSONException;
import org.json.JSONObject;

import mavo.zuehlkeschindlerapp.SensorType;

/**
 *  GyroscopeData.java
 *  AndroidSensorApp
 *
 *  © 2016 Zühlke Engineering AG. All rights reserved.
 *
 * Models data generated by the gyroscope.
 */
public class GyroscopeData extends AbstractSensorData {

    private String xAngularVelocity;
    private String yAngularVelocity;
    private String zAngularVelocity;

    public GyroscopeData(String xAngularVelocity, String yAngularVelocity, String zAngularVelocity, String timestamp) {
        super(SensorType.GYROSCOPE, timestamp);
        this.xAngularVelocity = xAngularVelocity;
        this.yAngularVelocity = yAngularVelocity;
        this.zAngularVelocity = zAngularVelocity;
    }

    @Override
    public JSONObject toJSON() throws JSONException {
        JSONObject object = super.toJSON();
        object.put("x", this.xAngularVelocity);
        object.put("y", this.yAngularVelocity);
        object.put("z", this.zAngularVelocity);
        return object;
    }
}