package rflpazini.gama.accenture.VehicleSeller.Model;

public class VehicleDisabilityPerson extends Vehicle{

  public VehicleDisabilityPerson(int value, String color, String model, int year) {
    super(value, color, model, year);
    this.ipi = 1.0;
  }
}
