package rflpazini.gama.accenture.VehicleSeller.Model;

import java.util.UUID;

public class Vehicle {

  private String licensePlate;
  private int value;
  private String color;
  private String model;
  private int year;
  protected double ipi;

  public Vehicle(int value, String color, String model, int year) {
    this.licensePlate = UUID.randomUUID().toString();
    this.value = value;
    this.color = color;
    this.model = model;
    this.year = year;
    this.ipi = 1.15;
  }

  public String getLicensePlate() {
    return licensePlate;
  }

  public void setLicensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public double getPrice() {
    return value *= ipi;
  }
}
