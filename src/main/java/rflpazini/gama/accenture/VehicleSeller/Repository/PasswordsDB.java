package rflpazini.gama.accenture.VehicleSeller.Repository;

import java.util.Hashtable;

public enum PasswordsDB {
  INSTANCE;

  private final Hashtable<String, byte[]> passwords;

  PasswordsDB() {
    this.passwords = new Hashtable<>();
  }

  public Hashtable passwords() {
    return this.passwords;
  }
}
