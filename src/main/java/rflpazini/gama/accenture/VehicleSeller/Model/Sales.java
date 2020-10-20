package rflpazini.gama.accenture.VehicleSeller.Model;

import java.util.UUID;

public class Sales {

  private String id;
  private Client client;
  private Employee seller;
  private Vehicle vehicle;
  private int price;
  private int portionNumber;
  private double portionPrice;

  public Sales(Client client, Employee seller,
      Vehicle vehicle, int price, int portionNumber, double portionPrice) {
    this.id = UUID.randomUUID().toString();
    this.client = client;
    this.seller = seller;
    this.vehicle = vehicle;
    this.price = price;
    this.portionNumber = portionNumber;
    this.portionPrice = portionPrice;
  }
}
