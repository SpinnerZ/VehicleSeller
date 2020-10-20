package rflpazini.gama.accenture.VehicleSeller.Model;

public class Manager extends Employee {


  public Manager(String cpf, String name) {
    super(cpf, name);
    setPersonType("Manager");
  }

  public boolean storePassword(String password) {
    return Passwords.storePassword(this.getId(), password);
  }

  public boolean updatePassword(String password) {
    return Passwords.updatePassword(this.getId(), password);
  }

  public boolean removePassword() {
    return Passwords.removePassword(this.getId());
  }
}
