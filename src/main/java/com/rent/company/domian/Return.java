package com.rent.company.domian;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Return {
  private Employee employee;
  private LocalDate returnDate;
  private Reservation reservation;
  private double extraCost;
  private String additionalInfo;
}
