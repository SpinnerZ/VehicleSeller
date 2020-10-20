package rflpazini.gama.accenture.VehicleSeller.Model;

public class Intern extends Employee {

  public Intern(String cpf, String name) {
    super(cpf, name);
    setEmployeeType("Intern");
  }

  @Override
  public boolean sell(Vehicle vehicle, Client client, int portionNumber, double interest) {
    return false;
  }

  //TO-DO: Store who allowed the intern to sell
  public boolean sell(Vehicle vehicle, Client client, int portionNumber, double interest, String id, String password) {
    if (Passwords.checkPassword(id, password)) {
      return super.sell(vehicle, client, portionNumber, interest);
    }
    return false;
  }
}