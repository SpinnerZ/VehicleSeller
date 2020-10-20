package rflpazini.gama.accenture.VehicleSeller.Model;

import java.util.UUID;

public class Client extends Person {

  public Client(String cpf, String name) {
    super(cpf, name);
    this.setPersonType("Client");
  }
}
