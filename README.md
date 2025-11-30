🌟 Parkiss 🌟

─────────────────────────────────────────────────────────────────────────────────────────

𝐷𝐸𝒮𝐶𝑅𝐼𝒫𝒯𝐼𝒪𝒩 / 𝒪𝒱𝐸𝑅𝒱𝐼𝐸𝒲

Parkiss is a console-based parking management system. Users can register vehicles, simulate parking duration, and calculate parking fees. It provides a simple, interactive interface to manage cars, motorcycles, and trucks efficiently.

─────────────────────────────────────────────────────────────────────────────────────────

✦ 𝐴𝑝𝓅𝓁𝒾𝑒𝒹 𝒪𝒪𝒫 𝐶𝑜𝓃𝒸𝑒𝓅𝓉𝓈

🔷 Abstraction

Hides complex fee calculations and parking logic inside classes. Users interact only with simple methods like enter and exit.

🔶 Encapsulation

Each class manages its own data:

  Vehicle stores license plate and base rate

  ParkingRecord tracks entry/exit times

  ParkingLot manages parked vehicles, records, and types

🔷 Polymorphism

Different vehicle types override getBaseRate() to provide specific fees.

🔶 Inheritance

Car, Motorcycle, and Truck inherit from Vehicle.

─────────────────────────────────────────────────────────────────────────────

✧ 𝐏𝐫𝐨𝐠𝐫𝐚𝐦 𝐒𝐭𝐫𝐮𝐜𝐭𝐮𝐫𝐞

Parkiss/

│

├─ Main.java 

├─ Vehicle.java

├─ Car.java 

├─ Motorcycle.java 

├─ Truck.java 

├─ ParkingLot.java 

└─ ParkingRecord.java 


─────────────────────────────────────────────────────────────────────────────

✧ 𝐇𝐨𝐰 𝐭𝐨 𝐑𝐮𝐧

Install Java JDK 8 or higher.

Open terminal/command prompt and navigate to the Parkiss folder.

cd path/to/Parkiss


Compile all Java files:

javac *.java


Run the program:

java Main


Follow on-screen menu to enter or exit vehicles.

─────────────────────────────────────────────────────────────────────────────

✧ 𝐒𝐚𝐦𝐩𝐥𝐞 𝐎𝐮𝐭𝐩𝐮𝐭

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

===== PARKING SYSTEM MENU =====
1. Enter Vehicle
2. Exit Vehicle
3. Exit Program
   
Choose: 2

Vehicles currently inside:
1. ABC123 (CAR)
   
Select vehicle number to exit: 1

--- FULL EXIT RECEIPT ---

Plate: ABC123

Time In: 14:30

Time Out: 17:45

Total Parked: 3h 15m

Total Fee: P60.00

Additional Fee for extra hour(s): P30.00

-------------------------

✧ 𝐅𝐮𝐭𝐮𝐫𝐞 𝐄𝐧𝐡𝐚𝐧𝐜𝐞𝐦𝐞𝐧𝐭𝐬

GUI interface for better visualization

Database integration for persistent records

Support for multiple parking lots and pricing tiers

──────────────────────────────────────────────────────────────────────

✧ 𝐑𝐞𝐟𝐞𝐫𝐞𝐧𝐜𝐞𝐬

Java SE Documentation

Online tutorials for console-based Java programs

✧ Disclaimer

For learning and demonstration purposes only.
