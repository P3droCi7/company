package com.rent.company.service;

import com.rent.company.domian.Rental;

public interface RentalService {

  Rental createNewCompany(String nazwa, String intrnanetDoamin, String contactAddress, String owner, String logo);
  Rental addDepartmentToCompany();
  Rental removeDepartmentFromCompany();
  }
