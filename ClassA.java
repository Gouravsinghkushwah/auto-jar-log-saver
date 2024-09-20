package com.jar;

import java.util.logging.Logger;

public class ClassA {

	private static final Logger logger = LogFileClass.getLogger(); // Use the logger from LogFileClass

	public static void method() throws Exception {
		for (int i = 0; i < 10000; i++) {
			Thread.sleep(10000);

			String message = "(HEllO)------------"+i
			logger.info(message); // Log the message instead of printing to console

			logger.info("Generating Logs-------------------- ");
		}
	}
}
