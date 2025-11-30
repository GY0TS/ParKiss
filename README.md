🌟 Parkiss 🌟

─────────────────────────────────────────────────────────────────────────────────────────

𝐷𝐸𝒮𝐶𝑅𝐼𝒫𝒯𝐼𝒪𝒩 / 𝒪𝒱𝐸𝑅𝒱𝐼𝐸𝒲

Parkiss is a console-based parking management system. Users can register vehicles, simulate parking duration, and calculate parking fees. It provides a simple, interactive interface to manage cars, motorcycles, and trucks efficiently.

─────────────────────────────────────────────────────────────────────────────────────────

✦ 𝒪𝒪𝒫 𝐶𝒪𝒩𝐶𝐸𝒫𝒯𝒮 𝒜𝒫𝒫𝐿𝐼𝐸𝒟 ✦

🔷 Abstraction  
Vehicle is an abstract class defining common behavior for all vehicle types. Specific vehicle types (Car, Motorcycle, Truck) implement their own base rates.

🔶 Encapsulation  
Private fields and public getters/setters ensure controlled access to vehicle and parking data, maintaining data integrity.

🔷 Inheritance  
Car, Motorcycle, and Truck extend the Vehicle superclass, reusing common behavior and attributes.

🔶 Polymorphism  
Vehicle references are used to store different vehicle types, and the overridden `getBaseRate()` method provides dynamic fee calculation.

🔷 Exception Handling  
The program handles invalid user input using try-catch blocks to avoid runtime errors and guide users for correct input.

─────────────────────────────────────────────────────────────────────────────────────────

✧ 𝒫𝑅𝒪𝐺𝑅𝐴𝑀 𝒮𝒯𝑅𝒰𝐶𝒯𝒰𝑅𝐸 ✧

Parkiss/
│
├─ Main.java           # Handles user interface, menu, and interactions
├─ ParkingLot.java     # Manages parked vehicles, records, and fee calculations
├─ ParkingRecord.java  # Tracks entry and exit times of vehicles
├─ Vehicle.java        # Abstract superclass defining common vehicle behavior
├─ Car.java            # Car-specific implementation
├─ Motorcycle.java     # Motorcycle-specific implementation
└─ Truck.java          # Truck-specific implementation

─────────────────────────────────────────────────────────────────────────────────────────

✧ 𝐻𝒪𝒲 𝒯𝒪 𝑅𝒰𝒩 ✧

1. Ensure Java 8+ is installed.  
2. Open terminal/command line and navigate to the project directory.  
3. Compile all files:


javac *.java


Run the program:

java Main


───────────────────────────────────────────────────────────────────────────────

☘ 𝐸𝓍𝒶𝓂𝓅𝓁𝑒 𝒪𝓊𝓉𝓅𝓊𝓉

===== PARKING SYSTEM MENU =====

1. Enter Vehicle

2. Exit Vehicle

3. Exit Program

Choose: 1

Enter plate number: ABC123

Select Vehicle Type:

1. Motorcycle

2. Car

3. Truck

Choice: 2

--- ENTRY RECEIPT ---

Plate: ABC123

Time In: 14:30

Vehicle Type: CAR

Fee: P30.00

Reminder: Exceeding 3 hours will incur an additional base fee.

---------------------



───────────────────────────────────────────────────────────────────────────────

☘ 𝐴𝒸𝓀𝓃𝑜𝓌𝓁𝑒𝓂𝑒𝓃𝓉𝓈

Special thanks to our instructor and peers who guided us in developing this project.

───────────────────────────────────────────────────────────────────────────────

❂ 𝐷𝒾𝓈𝒸𝓁𝒶𝒾𝓂𝑒𝓇

For learning and demonstration purposes only.
