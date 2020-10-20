package rflpazini.gama.accenture.VehicleSeller.Controller;

import java.util.Collection;
import java.util.Hashtable;
import rflpazini.gama.accenture.VehicleSeller.Model.Employee;
import rflpazini.gama.accenture.VehicleSeller.Model.Intern;
import rflpazini.gama.accenture.VehicleSeller.Model.Manager;
import rflpazini.gama.accenture.VehicleSeller.Model.SalesPerson;
import rflpazini.gama.accenture.VehicleSeller.Repository.EmployeeDB;

public class PokeEmployee {
  static Hashtable employeeDB = EmployeeDB.INSTANCE.employee();

  public static boolean createEmployee(String cpf, String name, char type) {
    Employee employee;

    for (Object employeeCheck : employeeDB.values()) {
      if (((Employee) employeeCheck).getCpf().equals(cpf)) {
        return false;
      }
    }

    switch (type) {
      case 'i':
         employee = new Intern(cpf, name);
        break;
      case 's':
        employee = new SalesPerson(cpf, name);
        break;
      case 'm':
        employee = new Manager(cpf, name);
        break;
      default:
        return false;
    }

    employeeDB.put(employee.getId(), employee);
    return true;
  }

  public static Employee retrieveEmployee(String id) {
    return (Employee) employeeDB.get(id);
  }

  public static String retrieveId(String cpf) {
    for (Object employee : employeeDB.values()) {
      if (((Employee) employee).getCpf().equals(cpf)) {
        return ((Employee) employee).getId();
      }
    }

    return "";
  }

  public static boolean updateEmployee(String id, String cpf, String name) {
    Employee employee = (Employee) employeeDB.get(id);

    if (employee != null) {
      employee.setCpf(cpf);
      employee.setName(name);
      return true;
    }

    return false;
  }

  public static boolean deleteEmployee(String id) {
    return employeeDB.remove(id) != null;
  }

  public static Collection listAll() {
    return employeeDB.values();
  }
}
