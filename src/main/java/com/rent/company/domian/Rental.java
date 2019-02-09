package com.rent.company.domian;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
@Getter
@Setter
public class Rental {
  private String nazwa;
  private String intrnanetDoamin;
  private String contactAddress;
  private String owner;
  private String logo;
  private List<Department> departmentList;

  public Rental(String nazwa, String intrnanetDoamin, String contactAddress, String owner, String logo) {
    this.nazwa = nazwa;
    this.intrnanetDoamin = intrnanetDoamin;
    this.contactAddress = contactAddress;
    this.owner = owner;
    this.logo = logo;
    this.departmentList = new ArrayList<>();
  }
}
