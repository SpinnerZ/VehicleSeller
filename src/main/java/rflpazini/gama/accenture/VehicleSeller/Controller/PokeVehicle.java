package rflpazini.gama.accenture.VehicleSeller.Controller;

import java.util.Collection;
import java.util.Hashtable;
import rflpazini.gama.accenture.VehicleSeller.Model.Vehicle;
import rflpazini.gama.accenture.VehicleSeller.Model.VehicleDisabilityPerson;
import rflpazini.gama.accenture.VehicleSeller.Repository.VehicleDB;

public class PokeVehicle {
  static Hashtable vehicleDB = VehicleDB.INSTANCE.vehicle();

  public static boolean createVehicle(int value, String color, String model, int year, boolean pcd) {
    Vehicle vehicle;

    if (pcd) {
      vehicle = new VehicleDisabilityPerson(value, color, model, year);
    }
    else {
      vehicle = new Vehicle(value, color, model, year);
    }

    return vehicleDB.put(vehicle.getLicensePlate(), vehicle) != null;
  }

  public static Vehicle retrieveVehicle(String licencePlate) {
    return (Vehicle) vehicleDB.get(licencePlate);
  }

  public static boolean updateVehicle(String licensePlate, int value, String color, String model, int year) {
    Vehicle vehicle = (Vehicle) vehicleDB.get(licensePlate);

    if (vehicle != null) {
      vehicle.setValue(value);
      vehicle.setColor(color);
      vehicle.setModel(model);
      vehicle.setYear(year);
      return true;
    }

    return false;
  }

  public static boolean deleteVehicle(String id) {
    return vehicleDB.remove(id) != null;
  }

  public static Collection listAll() {
    return vehicleDB.values();
  }
}
