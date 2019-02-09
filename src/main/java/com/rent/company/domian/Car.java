package com.rent.company.domian;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
  private String brand;
  private String model;
  private CarTypesEnum carTypesEnum;
  private int prodYear;
  private String color;
  private int mileage;
  private CarStatusEnum carStatusEnum;
  private double costPerDay;
}
