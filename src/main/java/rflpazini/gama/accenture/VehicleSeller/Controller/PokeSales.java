package rflpazini.gama.accenture.VehicleSeller.Controller;

import java.util.Collection;
import java.util.Hashtable;
import rflpazini.gama.accenture.VehicleSeller.Model.Client;
import rflpazini.gama.accenture.VehicleSeller.Model.Employee;
import rflpazini.gama.accenture.VehicleSeller.Model.Sales;
import rflpazini.gama.accenture.VehicleSeller.Model.Vehicle;
import rflpazini.gama.accenture.VehicleSeller.Repository.SalesDB;

public abstract class PokeSales {
  private static Hashtable salesDB = SalesDB.INSTANCE.sales();

  private static boolean checkCEV(Client client, Employee employee, Vehicle vehicle) {
    return client != null && employee != null && vehicle != null;
  }

  public static Sales createSale(String clientId, String employeeId,
      String vehicleId, double price, int portionNumber, double portionPrice) {
    Client client = PokeClient.retrieveClient(clientId);
    Employee employee = PokeEmployee.retrieveEmployee(employeeId);
    Vehicle vehicle = PokeVehicle.retrieveVehicle(vehicleId);

    if (!checkCEV(client, employee, vehicle)) {
      return null;
    }

    Sales sales = new Sales(client, employee, vehicle, price, portionNumber, portionPrice);
    salesDB.put(sales.getId(), sales);
    return sales;
  }

  public static Sales retrieveSale(String id){
    return (Sales) salesDB.get(id);
  }

  public static Sales updateSale(String saleId, String clientId, String employeeId,
      String vehicleId, double price, int portionNumber, double portionPrice) {
    Sales sale = (Sales) salesDB.get(saleId);
    Client client = PokeClient.retrieveClient(clientId);
    Employee employee = PokeEmployee.retrieveEmployee(employeeId);
    Vehicle vehicle = PokeVehicle.retrieveVehicle(vehicleId);

    if (sale == null || !checkCEV(client, employee, vehicle)) {
      return null;
    }

    sale.setClient(client);
    sale.setSeller(employee);
    sale.setVehicle(vehicle);
    sale.setPrice(price);
    sale.setPortionNumber(portionNumber);
    sale.setPortionPrice(portionPrice);

    return sale;
  }

  public static boolean deleteSale(String saleId) {
    return salesDB.remove(saleId) != null;
  }

  public static Collection listAll() {
    return salesDB.values();
  }
}
