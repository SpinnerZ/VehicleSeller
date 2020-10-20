package rflpazini.gama.accenture.VehicleSeller.Model;

import java.util.UUID;

public abstract class Person {
  private String id;
  private String cpf;
  private String name;
  private String personType;

  public Person(String cpf, String name) {
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

  public String getPersonType() {
    return personType;
  }

  public void setPersonType(String personType) {
    this.personType = personType;
  }
}
