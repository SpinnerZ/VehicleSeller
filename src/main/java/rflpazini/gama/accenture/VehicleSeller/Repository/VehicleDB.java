package rflpazini.gama.accenture.VehicleSeller.Repository;

import java.util.Hashtable;
import rflpazini.gama.accenture.VehicleSeller.Model.Vehicle;

public enum VehicleDB {

  INSTANCE;

  private final Hashtable<String, Vehicle> vehicle;

  VehicleDB() {
    this.vehicle = new Hashtable<>();
  }

  public Hashtable vehicle() {
    return this.vehicle;
  }
}
