# Circular Array Queue Implementation

## Overview

This project implements a **circular queue** (also known as a ring buffer) using a static array in Java. The queue stores values of type `String` and has a **fixed capacity**, which is provided as a constructor parameter. If the default constructor is used, the queue size is set to **5**.

The implementation follows the **FIFO (First In, First Out)** principle, meaning that the first element inserted is the first to be removed.

## Features

- **Enqueue**: Adds an element to the queue.
- **Dequeue**: Removes and returns the oldest element from the queue.
- **Peek**: Returns the front element without removing it.
- **Size**: Returns the number of elements currently in the queue.
- **IsEmpty**: Checks if the queue is empty.
- **IsFull**: Checks if the queue is full.

The queue uses **two index pointers** (`front` and `rear`) to efficiently manage insertion and removal operations.



A Java implementation of a circular queue using a fixed-size array. This project is designed as a homework assignment and follows the principles of queue data structures.


## 🛠️ Installation & Setup

1. Clone this repository:
   ```sh
   git clone https://github.com/02ionova/Circular-array-queue.git
   cd Circular-array-queue
   ```
2. Open the project in **IntelliJ IDEA** or any other Java IDE that supports Maven.
3. Ensure that you have JDK 21 installed and configured.

## 🚀 Running the Application

- The main logic is inside `CircularArrayQueue.java`, but this project does not include a main execution method. You can create a custom test inside `Start.java` or run unit tests.

## ✅ Running Tests

- To run tests in **IntelliJ IDEA**, open `CircularArrayQueuePublicTest.java` and click **Run**.
- Or use **Maven** in the terminal:
  ```sh
  mvn test
  ```
