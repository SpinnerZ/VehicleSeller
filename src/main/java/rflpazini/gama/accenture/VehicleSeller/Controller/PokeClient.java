package rflpazini.gama.accenture.VehicleSeller.Controller;

import java.util.Collection;
import java.util.Hashtable;
import rflpazini.gama.accenture.VehicleSeller.Model.Client;
import rflpazini.gama.accenture.VehicleSeller.Repository.ClientDB;

public abstract class PokeClient {

  private static Hashtable clientDB = ClientDB.INSTANCE.client();

  public static boolean createClient(String cpf, String name) {
    Client client = new Client(cpf, name);

    for (Object dbClient : clientDB.values()) {
      if (((Client) dbClient).getCpf().equals(cpf)) {
        return false;
      }
    }

    clientDB.put(client.getId(), client);

    return true;
  }

  public static Client retrieveClient(String id) {
    return (Client) clientDB.get(id);
  }

  public static String retrieveId(String cpf) {
    for (Object client : clientDB.values()) {
      if (((Client) client).getCpf().equals(cpf)) {
        return ((Client) client).getId();
      }
    }

    return "";
  }

  public static boolean updateClient(String id, String cpf, String name) {
    Client client = (Client) clientDB.get(id);

    if (client != null) {
      client.setCpf(cpf);
      client.setName(name);
      return true;
    }

    return false;
  }

  public static boolean deleteClient(String id) {
    return clientDB.remove(id) != null;
  }

  public static Collection listAll() {
    return clientDB.values();
  }
}
