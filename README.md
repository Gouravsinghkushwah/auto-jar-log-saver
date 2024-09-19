# auto-jar-log-saver
Auto Jar File Log Saver helps manage logs from continuously running Java applications. It automatically creates log files at customizable intervals (e.g., every 10 seconds), ensuring that logs are stored systematically. This enables easy access to logs from any time period for effective troubleshooting and analysis.


# Log File Rotation Project

## Overview
This project demonstrates how to rotate log files in a Java application using the `java.util.logging` package.
 The logs are saved every 10 seconds, and each log file 
contains only the newly generated logs. Log files are stored in a directory, and each file is named with the current date and time.

## Features
- Automatic log rotation every 10 seconds.
- Log files named with date and time for easier management.
- Logs are saved to a specified directory (`C:/demo/path/LOGS` by default).
- Directory creation if it doesn't exist.

## Setup Instructions

### Prerequisites
- Java 8 or higher (ensure the correct version of the JDK is installed and configured).
- Maven installed to build and run the project.

### Running the Project
1. Clone this repository:
    ```bash
    git clone https://github.com/your-username/your-repository.git
    ```
2. Navigate to the project directory:
    ```bash
    cd your-repository
    ```
3. Build the project using Maven:
    ```bash
    mvn clean install
    ```
4. Run the JAR file:
    ```bash
    java -jar target/Jar_File_Testing-0.0.1-SNAPSHOT.jar
    ```

## Logging Details
- Logs are generated every second by the `ClassA` class and saved every 10 seconds by the `LogFileClass`.
- The logs are saved in the directory `C:/demo/path/LOGS`.
- Each log file is named using the format `logfile_yyyy-MM-dd_HH-mm-ss.log`.

## Customizing the Log Directory
If you wish to change the directory where logs are saved, modify the following line in `LogFileClass`:
```java
String logDirPath = "C:/demo/path/LOGS";

## Keywords
- Java Logging
- Log Rotation
- FileHandler
- Java TimerTask
- Automated Log Files
- Log Management
- Java Projects
- Spring Boot Logging
- Log Directory Creation
- Java.util.logging

Auto Jar File Log Saver

This project provides a solution to a common real-world challenge where continuously running Java applications (JAR files) generate large volumes of logs. Tracking specific events that occurred hours, days, or even weeks ago can be difficult without an organized logging system.

With the Auto Jar File Log Saver, logs are automatically saved in time-based log files, with a new file generated at a customizable time interval (e.g., every 10 seconds). Each log file contains only the newly generated logs from that time period. This allows developers to trace back and analyze log data from any point in time. Whether you need to review logs from 24 hours ago or any specific moment, this solution ensures that logs are systematically stored for easy access and troubleshooting.

By setting a custom time interval for log file creation, you gain full control over how often logs are saved, making it an efficient tool for real-time monitoring and debugging in both short-term and long-term scenarios.
