package rflpazini.gama.accenture.VehicleSeller.Repository;

import java.util.Hashtable;
import rflpazini.gama.accenture.VehicleSeller.Model.Client;

public enum ClientDB {

  INSTANCE;

  private final Hashtable<String, Client> client;

  ClientDB() {
    client = new Hashtable<>();
  }

  public Hashtable client() {
    return this.client;
  }
}
