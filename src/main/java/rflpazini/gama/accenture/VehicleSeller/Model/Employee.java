package rflpazini.gama.accenture.VehicleSeller.Model;

import java.util.Hashtable;
import rflpazini.gama.accenture.VehicleSeller.Repository.SalesDB;

public abstract class Employee extends Person{

  public Employee(String cpf, String name) {
    super(cpf, name);
    this.setPersonType("Employee");
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
