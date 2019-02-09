package com.rent.company.domian;

public enum CarTypesEnum {
  COMBI("COMBI"),
  HATCHBACK("HATCHBACK"),
  SEDAN("SEDAN");

  private final String type;
  CarTypesEnum(String type) {
    this.type = type;
  }

  public String getType(){
    return type;
  }
}
