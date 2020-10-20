package rflpazini.gama.accenture.VehicleSeller.Model;

import java.util.Hashtable;
import java.util.UUID;
import rflpazini.gama.accenture.VehicleSeller.Repository.SalesDB;

public abstract class Employee {

  private String id;
  private String cpf;
  private String name;
  private String employeeType;

  public Employee(String cpf, String name) {
    this.id = UUID.randomUUID().toString();
    this.cpf = cpf;
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmployeeType() {
    return employeeType;
  }

  public void setEmployeeType(String employeeType) {
    this.employeeType = employeeType;
  }

  public boolean sell(Vehicle vehicle, Client client, int portionNumber, double interest) {

    double finalSalePrice = vehicle.getPrice();

    if (portionNumber > 0) {
      finalSalePrice += finalSalePrice * interest * portionNumber;
    }
    else {
      finalSalePrice -= finalSalePrice * 0.1;
    }

    double portionPrice = finalSalePrice / portionNumber;

    Sales sale = new Sales(client, this, vehicle, finalSalePrice, portionNumber, portionPrice);

    Hashtable salesDB = SalesDB.INSTANCE.sales();

    salesDB.put(sale.getId(), sale);

    return true;
  }
}
