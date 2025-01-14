package de.schnippsche.solarreader.backend.utils;

import de.schnippsche.solarreader.backend.fields.DeviceField;
import de.schnippsche.solarreader.backend.fields.MqttField;
import de.schnippsche.solarreader.backend.fields.TableField;

import java.util.List;

public class Specification
{
  private String description;
  private List<DeviceField> devicefields;
  private List<TableField> databasefields;
  private List<MqttField> mqttFields;

  public Specification()
  {
    this.description = "";
  }

  public String getDescription()
  {
    return description;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  public List<DeviceField> getDevicefields()
  {
    return devicefields;
  }

  public void setDevicefields(List<DeviceField> devicefields)
  {
    this.devicefields = devicefields;
  }

  public List<TableField> getDatabasefields()
  {
    return databasefields;
  }

  public void setDatabasefields(List<TableField> databasefields)
  {
    this.databasefields = databasefields;
  }

  public List<MqttField> getMqttFields()
  {
    return mqttFields;
  }

  public void setMqttFields(List<MqttField> mqttFields)
  {
    this.mqttFields = mqttFields;
  }

  @Override public String toString()
  {
    return String.format("Specification{description='%s', deviceFields=%s, databaseFields=%s, mqttFields=%s}", description, devicefields, databasefields, mqttFields);
  }

}
