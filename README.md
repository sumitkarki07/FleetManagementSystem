#  Fleet Management System (Java Console App)

This is a simple Java-based console application that simulates a basic Fleet Management System. It allows you to manage a list of trucks — including adding, removing, and updating details like driver name and status — through a user-friendly menu.

---

##  Features

- Add new trucks with details like truck ID, driver name, mileage, fuel level, and status  
- View all trucks currently in the fleet  
- Remove a truck by its unique truck ID  
- Update a truck's status (e.g. Available, In Transit, In Maintenance)  
- Update the driver assigned to a truck  

---

##  How to Run

1. **Clone this repository:**
   git clone https://github.com/sumitkarki07/FleetManagementSystem.git
   

2. **Navigate into the project folder:**
   cd FleetManagementSystem/src
   

3. **Compile the Java files:**
   javac Main.java Truck.java FleetManager.java

4. **Run the program:**
   java Main

---

##  Project Structure

```
FleetManagementSystem/
├── src/
│   ├── Main.java          // Console UI and menu system
│   ├── Truck.java         // Truck object class with data and behavior
│   └── FleetManager.java  // Business logic for managing the fleet
└── README.md
```

---

## 🧠 Technologies & Concepts Used

- Core Java (Java SE)  
- Object-Oriented Programming (OOP)  
- Encapsulation with getters and setters  
- ArrayLists for dynamic data storage  
- Console-based user interaction using `Scanner`  
- Clean code and logical structure for readability and reusability  

---

## Sample Menu Output


========== Fleet Management System ==========
1. Add Truck
2. View All Trucks
3. Remove Truck by ID
4. Update Truck Status
5. Update Driver Name
6. Exit
Choose an option:
```

---

## About the Author

This project was created as part of my Java learning journey to better understand how object-oriented concepts can be applied to real-world systems — like managing a fleet of vehicles for a logistics company. It’s simple, but meaningful, and helped me strengthen my basics in Java.

---

This is just the beginning — I plan to expand this project and use it to learn more about Java and real-world software development.

Have any suggestions to improve the project? Feel free to share them!