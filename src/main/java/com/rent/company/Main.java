package com.rent.company;

import com.rent.company.domian.Department;
import com.rent.company.domian.Rental;
import com.rent.company.service.RentalService;
import com.rent.company.service.RentalServiceImpl;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

  //zad2. dodawanie i (usuwanie) oddzialow z wypozyczalni
  //zad3. tworzenie pracownikow
  //zad4. przypisywanie praconikow do oddzialu
  //zad5. tworzenie klienta
  //zad6. tworzenie samochodu
  //zad7. wypozyczenie samochodu...
  public static void main(String[] args) {

    RentalService rentalService = new RentalServiceImpl();
    Rental newCompany = null;
    Scanner scanner = new Scanner(System.in);
    String status = "working";
    while (status.equals("working")) {
      System.out.println("---------Main Menu----------");
      System.out.println("1.Create Company");
      System.out.println("2.Add or Remove Department to Company");
      System.out.println("3.Display Departments from Company");
      System.out.println("4.Exit program");
      System.out.println("\n" + "Please choose an option and click enter");

      String n = scanner.nextLine();

      switch (n) {
        case "1":
          newCompany = createNewCompany(rentalService, scanner);
          break;
        case "2":
          System.out.println("Working on new feauture");

          if (newCompany != null) {
            System.out.println("Do you want to create(1) or delete(2) departament ");
            String userChoice = scanner.nextLine();
            if (userChoice.equalsIgnoreCase("1")) {
              System.out.println("Enter the address of the department to add");
              String address = scanner.nextLine();
              if (!checkIfDepartamentExists(address, newCompany.getDepartmentList())) {
                Department department = new Department(address);
                newCompany.getDepartmentList().add(department);
              }

            } else if (userChoice.equalsIgnoreCase("2")) {
              System.out.println("Enter the address of the department to remove");
              String address = scanner.nextLine();
              if (checkIfDepartamentExists(address, newCompany.getDepartmentList())) {
                List<Department> departmentList = newCompany.getDepartmentList();
                for (Department d : departmentList) {
                  if (d.getAddress().equalsIgnoreCase(address)) {
                    departmentList.remove(d);
                    break;
                  }
                }
              }
            } else {
              System.out.println("Wrong option, try again");
            }
          }
          //rentalService.addDepartmentToCompany();
          break;
        case "3":
          System.out.println("Working on new feauture");
          List<Department> departmentList = newCompany.getDepartmentList();
          for(Department d: departmentList){
            System.out.println(d);
          }
          //rentalService.removeDepartmentFromCompany();
          break;
        case "4":
          status = "exit";
          break;
      }
    }
  }

  private static Rental createNewCompany(RentalService rentalService, Scanner scanner) {
    System.out.println("Set company name");
    String nazwa = scanner.nextLine();
    System.out.println("Set intranet Domain");
    String intranetDoamin = scanner.nextLine();
    System.out.println("Set contact address");
    String contactAddress = scanner.nextLine();
    System.out.println("Set owner");
    String owner = scanner.nextLine();
    System.out.println("Set logo");
    String logo = scanner.nextLine();

    return rentalService.createNewCompany(nazwa, intranetDoamin, contactAddress, owner, logo);
  }


  private static boolean checkIfDepartamentExists(String address, List<Department> departmentList) {
    int size = departmentList
            .stream()
            .filter(d -> d.getAddress().equalsIgnoreCase(address))
            .collect(Collectors.toList()).size();

    return size > 0;
  }
}
