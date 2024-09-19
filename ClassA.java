package com.jar;

import java.util.logging.Logger;

public class ClassA {

	private static final Logger logger = LogFileClass.getLogger(); // Use the logger from LogFileClass

	public static void method() throws Exception {
		for (int i = 0; i < 10000; i++) {
			Thread.sleep(10000);

			String message = "(HEllO)------------"+i+""+
					"Introduction to the AWS Management Console\r\n"
					+ "The AWS Management Console gives you secure login using your AWS account from your choice of browser. The console gives you flexibility to customize your view and settings and manage favorites for later. You can also use the console to manage and monitor your AWS account.\r\n"
					+ "\r\n"
					+ "The console is where you can find and launch AWS services. Use the search box on the navigation bar to find the services that you need. You can also expand the Services menu in the navigation pane that is always present in the console. Just choose Services from any page to see a full list of AWS services.\r\n"
					+ "\r\n"
					+ "In this course, you acquire the knowledge that you need to start using the AWS Management Console. You learn how to customize the console, find and access services, and how to manage service costs.\r\n"
					+ "\r\n" + "Course level \r\n"
					+ "This is a foundational level course that is written for learners beginning with cloud computing and AWS services. When you start this course, you don’t need to have a deep understanding of cloud computing.\r\n"
					+ "\r\n" + "Objectives";

			logger.info(message); // Log the message instead of printing to console

			logger.info("Generating Logs-------------------- ");
		}
	}
}
