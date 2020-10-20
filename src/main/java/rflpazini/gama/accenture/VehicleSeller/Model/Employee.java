package rflpazini.gama.accenture.VehicleSeller.Model;

import java.util.UUID;

public abstract class Employee {

  private String id;
  private String cpf;
  private String nome;

  public Employee(String cpf, String nome) {
    this.id = UUID.randomUUID().toString();
    this.cpf = cpf;
    this.nome = nome;
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

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }


}
