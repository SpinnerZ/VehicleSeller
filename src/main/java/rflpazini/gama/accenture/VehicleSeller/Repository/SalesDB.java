package rflpazini.gama.accenture.VehicleSeller.Repository;

import java.util.Hashtable;
import rflpazini.gama.accenture.VehicleSeller.Model.Sales;

public enum SalesDB {
  INSTANCE;

  private final Hashtable<String, Sales> sales;

  SalesDB () {
    sales = new Hashtable<>();
  }

  public Hashtable sales() {
    return this.sales;
  }
}
