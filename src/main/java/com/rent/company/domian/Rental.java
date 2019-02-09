package com.rent.company.domian;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Rental {
  private String nazwa;
  private String intrnanetDoamin;
  private String contactAddress;
  private String owner;
  private String logo;
  private List<Department> departmentList;


}
