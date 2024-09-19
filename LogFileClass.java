package com.jar;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogFileClass {

	private static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private static FileHandler fileHandler;

	static {
		try {
			// Ensure the directory exists
			String logDirPath = "C:\\Users\\goura\\OneDrive\\Desktop\\LOGS\\logfile.log";
			File logDir = new File(logDirPath);
			if (!logDir.exists()) {
				logDir.mkdirs(); // Create the directory if it does not exist
			}

			// Schedule log file rotation
			scheduleLogFileRotation(logDirPath);
		} catch (Exception e) {
			System.err.println("Failed to initialize logging: " + e.getMessage());
		}
	}

	private static void setupLogging(String logDirPath) throws IOException {
		// Create a new log file handler with a timestamp in the filename
		String logFilePath = getLogFilePath(logDirPath);
		fileHandler = new FileHandler(logFilePath, false); // 'false' to overwrite the file each time
		fileHandler.setFormatter(new SimpleFormatter());
		logger.addHandler(fileHandler);
		logger.setLevel(java.util.logging.Level.ALL);
	}

	private static String getLogFilePath(String logDirPath) {
		// Generate filename with current date and time
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
		String timestamp = sdf.format(new Date());
		return String.format("%s/logfile_%s.log", logDirPath, timestamp);
	}

	private static void scheduleLogFileRotation(String logDirPath) {
		Timer timer = new Timer(true);
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				try {
					// Remove the old handler and setup a new one
					if (fileHandler != null) {
						logger.removeHandler(fileHandler);
						fileHandler.close();
					}
					setupLogging(logDirPath);
				} catch (IOException e) {
					System.err.println("Failed to rotate logging file: " + e.getMessage());
				}
			}
		}, 0, 10000); // 10 seconds interval
	}

	public static Logger getLogger() {
		return logger;
	}
}
