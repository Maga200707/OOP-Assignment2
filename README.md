Vehicle Management System
A. Project Overview
Purpose of the Project

The purpose of this project is to practice Object-Oriented Programming (OOP) concepts in Java. The Vehicle Management System shows how abstraction, inheritance, composition, and aggregation work together in a real program.

Project Description

This program models different types of vehicles such as cars, motorcycles, and trucks. All vehicles share common features like brand and year, so they inherit from a single abstract class called Vehicle. Each vehicle also has a driver. The main program creates several vehicles, assigns drivers to them, and stores them in an array to demonstrate polymorphism.

OOP Concepts Used

Abstraction is used by creating an abstract Vehicle class.

Inheritance is used when Car, Motorcycle, and Truck extend Vehicle.

Composition is shown because each vehicle has a Driver.

Aggregation is shown because one driver can be assigned to multiple vehicles.

Polymorphism is used when vehicles are stored in a Vehicle array and accessed using a loop.

B. Class Hierarchy
Vehicle (Abstract Superclass)

The Vehicle class is an abstract class that represents a general vehicle.

Responsibilities:

Stores common information such as brand, year, and driver

Declares abstract methods startEngine() and stopEngine()

Includes a concrete method displayInfo() to show vehicle details

This class ensures that all vehicle types must implement their own engine behavior.

Subclasses
Car

Inherits from Vehicle

Has additional fields like number of doors and fuel type

Overrides startEngine() and stopEngine()

Motorcycle

Inherits from Vehicle

Has a field to indicate if it has a sidecar

Overrides startEngine() and stopEngine()

Truck

Inherits from Vehicle

Includes fields for load capacity and number of axles

Overrides startEngine() and stopEngine()

Each subclass provides its own version of the engine methods.

Driver Class

The Driver class represents a person who can drive a vehicle.

Stores the driver’s name and license number

Includes a method to display driver information

This class is used to show composition and aggregation in the program.

Access Modifiers Used

private is used to protect class fields from direct access.

protected is used in the Vehicle class so subclasses can access shared data.

public is used for constructors and methods that need to be accessed from other classes.

Using these access modifiers helps keep the code organized and secure.