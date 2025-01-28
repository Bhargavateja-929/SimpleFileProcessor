# Simple File Processor

This is a Java program that reads structured data from an input file (`input.txt`), processes it, and writes the formatted output to another file (`output.txt`).

## Features
- **File Reading**: Reads data from a file using `Scanner`.
- **Data Processing**: Splits each line of the input file into structured fields (e.g., Name, Age, ID).
- **File Writing**: Writes the processed and formatted data to an output file.
- **Error Handling**: Handles exceptions that may occur during file operations.

## Prerequisites
- Java Development Kit (JDK) 8 or higher installed on your machine.
- An `input.txt` file in the program's working directory with data formatted as `Name,Age,Id` (one record per line).

## Setup and Usage
1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/SimpleFileProcessor.git
   
## Prepare Input File: Create an input.txt file in the same directory as the program. Format the file as follows:

Alice,25,1001
Bob,30,1002
Charlie,22,1003

## Compile the Code: Navigate to the directory containing the ReadAndWrite.java file and run:

javac SimpleFileProcessor/ReadAndWrite.java

## Run the Program: Execute the program using:

java SimpleFileProcessor.ReadAndWrite

## Check Output: The program will create or overwrite an output.txt file in the same directory. Example content:

Name: Alice
Age: 25
Id: 1001

Name: Bob
Age: 30
Id: 1002

Name: Charlie
Age: 22
Id: 1003


## Notes
-Ensure input.txt exists in the program's directory before running the program.
-The program assumes each line in input.txt has three comma-separated fields: Name,Age,Id.
-If output.txt exists, it will be overwritten.
