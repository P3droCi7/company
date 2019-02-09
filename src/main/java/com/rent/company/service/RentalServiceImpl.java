package com.rent.company.service;

import com.rent.company.domian.Rental;

public class RentalServiceImpl implements RentalService {
  @Override
  public Rental createNewCompany(String name, String intranetDomain, String contactAddress, String owner, String logo) {
    return new Rental(name,intranetDomain,contactAddress,owner,logo);
  }

  @Override
  public Rental addDepartmentToCompany() {
    return null;
  }

  @Override
  public Rental removeDepartmentFromCompany() {
    return null;
  }
}
