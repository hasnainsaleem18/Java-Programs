/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q1;

/**
 *
 * @author hasnainsaleem
 */
public class sample {
    
}
import java.util.*;

abstract class Person {
    protected int id;
    protected String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class Employee extends Person {
    private String department;
    private String designation;
    private List<JobHistory> jobHistories;
    private List<AccommodationHistory> accommodationHistories;

    public Employee(int id, String name, String department, String designation) {
        super(id, name);
        this.department = department;
        this.designation = designation;
        this.jobHistories = new ArrayList<>();
        this.accommodationHistories = new ArrayList<>();
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public void addJobHistory(JobHistory jobHistory) {
        jobHistories.add(jobHistory);
    }

    public List<JobHistory> getJobHistory() {
        return jobHistories;
    }

    public void addAccommodationHistory(AccommodationHistory accommodationHistory) {
        accommodationHistories.add(accommodationHistory);
    }

    public List<AccommodationHistory> getAccommodationHistory() {
        return accommodationHistories;
    }
}

class JobHistory {
    private int employeeId;
    private String department;
    private String designation;
    private Date startDate;
    private Date endDate;

    public JobHistory(int employeeId, String department, String designation, Date startDate, Date endDate) {
        this.employeeId = employeeId;
        this.department = department;
        this.designation = designation;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getJobDetails() {
        return "Department: " + department + ", Designation: " + designation + 
               ", From: " + startDate + " To: " + endDate;
    }
}

class AccommodationHistory {
    private int employeeId;
    private int roomNumber;
    private Date startDate;
    private Date endDate;

    public AccommodationHistory(int employeeId, int roomNumber, Date startDate, Date endDate) {
        this.employeeId = employeeId;
        this.roomNumber = roomNumber;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getAccommodationDetails() {
        return "Room Number: " + roomNumber + ", From: " + startDate + " To: " + endDate;
    }
}

class HostelRoom {
    private int roomNumber;
    private boolean isOccupied;

    public HostelRoom(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isOccupied = false;
    }

    public boolean checkAvailability() {
        return !isOccupied;
    }

    public void assignRoom(Employee employee) {
        isOccupied = true;
    }

    public void releaseRoom() {
        isOccupied = false;
    }
}

class Department {
    private String departmentName;
    private int numberOfStudents;
    private int numberOfRooms;
    private int numberOfLabs;

    public Department(String departmentName, int numberOfStudents, int numberOfRooms, int numberOfLabs) {
        this.departmentName = departmentName;
        this.numberOfStudents = numberOfStudents;
        this.numberOfRooms = numberOfRooms;
        this.numberOfLabs = numberOfLabs;
    }

    public String getDepartmentDetails() {
        return "Department: " + departmentName + ", Students: " + numberOfStudents + 
               ", Rooms: " + numberOfRooms + ", Labs: " + numberOfLabs;
    }
}

class University {
    private List<Employee> employees;
    private List<Department> departments;
    private List<HostelRoom> hostelRooms;

    public University() {
        this.employees = new ArrayList<>();
        this.departments = new ArrayList<>();
        this.hostelRooms = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void transferEmployee(Employee employee, Department newDepartment) {
        employee.addJobHistory(new JobHistory(employee.getId(), newDepartment.getDepartmentDetails(), 
                                              employee.getDesignation(), new Date(), null));
    }

    public void promoteEmployee(Employee employee, String newDesignation) {
        employee.addJobHistory(new JobHistory(employee.getId(), employee.getDepartment(), 
                                              newDesignation, new Date(), null));
        employee.designation = newDesignation;
    }

    public void assignRoom(Employee employee, HostelRoom room) {
        if (room.checkAvailability()) {
            room.assignRoom(employee);
            employee.addAccommodationHistory(new AccommodationHistory(employee.getId(), 
                                                                      room.roomNumber, new Date(), null));
        }
    }

    public void releaseRoom(Employee employee, HostelRoom room) {
        room.releaseRoom();
        for (AccommodationHistory history : employee.getAccommodationHistory()) {
            if (history.getAccommodationDetails().contains("Room Number: " + room.roomNumber)) {
                history.endDate = new Date();
                break;
            }
        }
    }
}
import java.util.Scanner;

class EmployeeController {
    private University university;
    private Scanner scanner;

    public EmployeeController(University university) {
        this.university = university;
        this.scanner = new Scanner(System.in);
    }

    public void addEmployee() {
        System.out.println("Enter Employee ID: ");
        int id = scanner.nextInt();
        System.out.println("Enter Employee Name: ");
        String name = scanner.next();
        System.out.println("Enter Department: ");
        String department = scanner.next();
        System.out.println("Enter Designation: ");
        String designation = scanner.next();
        
        Employee employee = new Employee(id, name, department, designation);
        university.addEmployee(employee);
        
        System.out.println("Employee added successfully.");
    }

    public void transferEmployee() {
        System.out.println("Enter Employee ID to transfer: ");
        int id = scanner.nextInt();
        Employee employee = findEmployeeById(id);

        if (employee != null) {
            System.out.println("Enter New Department: ");
            String departmentName = scanner.next();
            Department newDepartment = new Department(departmentName, 0, 0, 0); // Assume default values for simplicity

            university.transferEmployee(employee, newDepartment);
            System.out.println("Employee transferred successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    public void promoteEmployee() {
        System.out.println("Enter Employee ID to promote: ");
        int id = scanner.nextInt();
        Employee employee = findEmployeeById(id);

        if (employee != null) {
            System.out.println("Enter New Designation: ");
            String newDesignation = scanner.next();

            university.promoteEmployee(employee, newDesignation);
            System.out.println("Employee promoted successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    public void assignRoom() {
        System.out.println("Enter Employee ID to assign room: ");
        int id = scanner.nextInt();
        Employee employee = findEmployeeById(id);

        if (employee != null) {
            System.out.println("Enter Room Number: ");
            int roomNumber = scanner.nextInt();
            HostelRoom room = findRoomByNumber(roomNumber);

            if (room != null && room.checkAvailability()) {
                university.assignRoom(employee, room);
                System.out.println("Room assigned successfully.");
            } else {
                System.out.println("Room not available.");
            }
        } else {
            System.out.println("Employee not found.");
        }
    }

    public void releaseRoom() {
        System.out.println("Enter Employee ID to release room: ");
        int id = scanner.nextInt();
        Employee employee = findEmployeeById(id);

        if (employee != null) {
            System.out.println("Enter Room Number: ");
            int roomNumber = scanner.nextInt();
            HostelRoom room = findRoomByNumber(roomNumber);

            if (room != null) {
                university.releaseRoom(employee, room);
                System.out.println("Room released successfully.");
            } else {
                System.out.println("Room not found.");
            }
        } else {
            System.out.println("Employee not found.");
        }
    }

    private Employee findEmployeeById(int id) {
        for (Employee employee : university.getEmployees()) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    private HostelRoom findRoomByNumber(int roomNumber) {
        for (HostelRoom room : university.getHostelRooms()) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }
}
public class Main {
    public static void main(String[] args) {
        University university = new University();
        EmployeeController controller = new EmployeeController(university);
        
        // Sample interaction (menu-driven or predefined actions)
        controller.addEmployee();
        controller.transferEmployee();
        controller.promoteEmployee();
        controller.assignRoom();
        controller.releaseRoom();
    }
}
