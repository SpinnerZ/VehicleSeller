package rflpazini.gama.accenture.VehicleSeller.Model;

import java.util.UUID;

public class Client {

  private String id;
  private String cpf;
  private String name;

  public Client(String cpf, String name) {
    this.id = UUID.randomUUID().toString();
    this.cpf = cpf;
    this.name = name;
  }
}
