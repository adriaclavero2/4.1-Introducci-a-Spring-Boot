🔄 Undo Command Manager (Singleton Pattern)

DescriptionThis project implements the Singleton Design Pattern to create a global Undo command manager. The goal is to ensure that the entire application shares a single instance responsible for storing, undoing, and displaying command history. This exercise reinforces SOLID principles and demonstrates how to manage shared state safely and cleanly.

📌 Exercise Statement

The objective is to build a class named Undo that behaves like a simplified command history manager. It must:

Store commands in a shared history

Undo the last executed command

Display the full command history

Guarantee that only one instance of the Undo manager exists across the entire application

The Singleton pattern ensures that all components interact with the same Undo instance.

✨ Features

✔️ Singleton Implementation

Private constructor

Static getInstance() method

Only one instance exists during the entire runtime

✔️ Command History

Commands stored in a Stack<String>

addCommand(String) adds a new command

undoCommand() removes and returns the last command

showHistory() prints all stored commands

✔️ Global Access

Any part of the application can retrieve the same Undo instance:

Undo undo = Undo.getInstance();

✔️ Unit Tests

JUnit tests validate:

Singleton behavior (same instance returned every time)

Command addition

Undo functionality

History listing

🛠 Technologies

Java

JUnit 5

Stack<String> for command storage

🚀 Installation & Execution

Clone the repository

git clone <repository-url>

Run the application Execute Main.java from your IDE.

Run tests

mvn test

📸 Example Usage

Undo undo = Undo.getInstance();

undo.addCommand("mkdir folder");
undo.addCommand("cd folder");
undo.showHistory();
// Output:
// mkdir folder
// cd folder

undo.undoCommand();
undo.showHistory();
// Output:
// mkdir folder

🧩 Technical Decisions & Justification

✔️ Singleton Pattern

Ensures a single shared Undo manager across the entire application.

✔️ Stack Data Structure

Provides natural LIFO behavior for undo operations.

✔️ SOLID Principles

Single Responsibility: Undo only manages command history

Open/Closed: Easy to extend with redo, persistence, etc.

Global Access without exposing internal state
