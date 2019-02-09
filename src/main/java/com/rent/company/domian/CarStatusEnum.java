package com.rent.company.domian;

public enum CarStatusEnum {
  AVAILABLE("AVAILABLE"),
  UNAVAIABLE("UNAVAIABLE"),
  RENTED("RENTED");

  private final String type;
  CarStatusEnum(String type) {
    this.type = type;
  }

  public String getType(){
    return type;
  }
}
