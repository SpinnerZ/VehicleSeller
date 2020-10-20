package rflpazini.gama.accenture.VehicleSeller.Repository;

import java.util.Hashtable;
import rflpazini.gama.accenture.VehicleSeller.Model.Employee;

public enum EmployeeDB {

  INSTANCE;

  private final Hashtable<String, Employee> employee;

  EmployeeDB() {
    this.employee = new Hashtable<>();
  }

  public Hashtable employee() {
    return this.employee;
  }
}
