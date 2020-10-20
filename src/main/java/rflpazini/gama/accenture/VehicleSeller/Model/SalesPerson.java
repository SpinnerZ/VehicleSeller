package rflpazini.gama.accenture.VehicleSeller.Model;

public class SalesPerson extends Employee {

  public SalesPerson(String cpf, String name) {
    super(cpf, name);
    setPersonType("Sales Person");
  }
}
