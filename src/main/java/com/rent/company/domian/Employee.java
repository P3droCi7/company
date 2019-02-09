package com.rent.company.domian;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
  private String firstName;
  private String lastName;
  private boolean isManager;
  private String department;
}
