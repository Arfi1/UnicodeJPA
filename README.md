Overview
----------
This exercise involves working with Java Persistence API (JPA) and Unicode characters. 
It guides you through creating a simple Java project that can handle Unicode characters by interacting with a REST API and storing data in a MySQL database. 
The goal is to familiarize yourself with creating endpoints, handling Unicode characters, and persisting data using JPA.

Steps Breakdown
-----------------
1. Create a JPA Project and Add a RestController Class

* You begin by setting up a new JPA project.
* Create a class annotated with @RestController.
* This class will handle HTTP GET requests.

2. Create a Unicode to Character Converter

* Add a method that takes an integer as a path variable and converts it to its corresponding Unicode character.
* Usage: If you visit http://localhost:8080/unicode/97, the response should be unicode=97 char=a.

3. Create a Character to Unicode Converter

* Extend the functionality by writing an endpoint that performs the reverse operation,
converting a character to its Unicode integer representation.

4.Create a Model Class for Unicode Characters

* Create a Unicode class that maps to a MySQL table using JPA.
* Properties:

---- int unicode: The Unicode value of the character.

---- char bogstav: The character itself.

---- * Optional properties:

------ * String description: A comment or description of the character.

------ * String name: A custom name for the character (e.g., "dollar sign").

5. Set Up a Repository

* Create a repository interface for the Unicode class.
This will handle database operations.

6. Initialize Data

* In a class like InitData, write a method that stores a set of Unicode characters in the database.

7. Create an Endpoint to Generate Character Sequences

* Add an endpoint that takes a character and a number as parameters and returns a sequence of characters starting from the given character.
* Example: If the endpoint is called with 'a' and 10, it should return the next 10 characters starting from 'a'.

Key Concepts
-------------

* JPA (Java Persistence API): A specification for accessing, managing, and persisting data between Java objects and relational databases.
  
* RESTful Web Services: An architectural style for designing networked applications where each service is stateless and can be accessed via standard HTTP methods.

* Unicode: A standard for encoding, representing, and managing text expressed in most of the world's writing systems.

Benefits of This Exercise
--------------------------

* Understanding JPA: You'll learn how to map Java classes to database tables and perform CRUD (Create, Read, Update, Delete) operations.

* Working with Unicode: Gain insight into how Java handles different character encodings, which is critical in building internationalized applications.
  
* API Development: Learn to create and test RESTful endpoints, which are essential for modern web services.

This exercise provides a comprehensive introduction to JPA, character encoding, and REST API development, 
equipping you with essential skills for building robust Java applications.
  
