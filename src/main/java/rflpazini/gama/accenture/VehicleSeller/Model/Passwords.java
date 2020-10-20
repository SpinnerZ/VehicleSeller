package rflpazini.gama.accenture.VehicleSeller.Model;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Hashtable;
import rflpazini.gama.accenture.VehicleSeller.Repository.PasswordsDB;

public abstract class Passwords {

  private static Hashtable db = PasswordsDB.INSTANCE.passwords();

  public static byte[] generateHash(String password) {
    SecureRandom random = new SecureRandom();
    byte[] salt = new byte[16];
    random.nextBytes(salt);

    MessageDigest md;
    try {
      md = MessageDigest.getInstance("SHA-512");
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
      return null;
    }
    md.update(salt);

    return md.digest(password.getBytes(StandardCharsets.UTF_8));
  }

  public static boolean storePassword(String id, String password) {

    byte[] hashedPassword = generateHash(password);

    if (hashedPassword == null) {
      return false;
    }

    db.put(id, hashedPassword);

    return true;
  }

  public static boolean updatePassword(String id, String password) {

    if (db.get(id) == null) {
      return false;
    }

    db.replace(id, generateHash(password));

    return true;
  }

  public static boolean removePassword(String id) {

    if (db.get(id) == null) {
      return false;
    }

    db.remove(id);

    return true;
  }

  public static boolean checkPassword(String id, String password) {

    return db.get(id).equals(generateHash(password));
  }
}
