package rflpazini.gama.accenture.VehicleSeller.Model;

import java.util.UUID;

public class Sales {

  private String id;
  private Client client;
  private Employee seller;
  private Vehicle vehicle;
  private double price;
  private int portionNumber;
  private double portionPrice;

  public Sales(Client client, Employee seller,
      Vehicle vehicle, double price, int portionNumber, double portionPrice) {
    this.id = UUID.randomUUID().toString();
    this.client = client;
    this.seller = seller;
    this.vehicle = vehicle;
    this.price = price;
    this.portionNumber = portionNumber;
    this.portionPrice = portionPrice;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public Employee getSeller() {
    return seller;
  }

  public void setSeller(Employee seller) {
    this.seller = seller;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getPortionNumber() {
    return portionNumber;
  }

  public void setPortionNumber(int portionNumber) {
    this.portionNumber = portionNumber;
  }

  public double getPortionPrice() {
    return portionPrice;
  }

  public void setPortionPrice(double portionPrice) {
    this.portionPrice = portionPrice;
  }

  public void show() {
    System.out.printf("Total sale price: $%.2f\n"
        + "Number of installments: %d\n"
        + "Installments value: $%.2f", getPrice(), getPortionNumber(), getPortionPrice());
  }
}
