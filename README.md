# Selenium Java Test Suite

## Introduction

This repository contains Selenium WebDriver tests written in Java, managed with Maven, and designed to be run using TestNG via an XML configuration file. The test results can be viewed in a visually-appealing format using Allure Reports.

## Prerequisites

Before running the tests, ensure you have the following installed:
- Java JDK 8 or higher
- Maven
- Selenium WebDriver
- Allure Commandline Tool (for generating and serving Allure reports)

## Installation

Clone this repository to your local machine:

git clone https://github.com/yourusername/your-repository-name.git
cd your-repository-name

## Configuration

Ensure that all dependencies are set up correctly in your `pom.xml` file. This project uses Maven to manage dependencies.

## Running Tests

To run the tests, use the following command in your terminal:

mvn test -DsuiteXmlFile=your-testng-file.xml

Replace `your-testng-file.xml` with the path to your TestNG XML configuration file, which defines the test suite.

## Generating and Viewing Allure Reports

After running the tests, generate and serve the Allure reports using the following command:

allure serve target/allure-results

This command will generate a web-based report and automatically open it in your default web browser.

how  to run the docker file in the repository :

Steps to Build and Run the Container
Build the Docker Image:
Open your terminal.
Navigate to the directory containing your project and the Dockerfile.
Run the build command:
docker build -t selenium-tests .
This command builds the Docker image with the tag selenium-tests.
Run the Docker Container:
After building the image, start the container to run your tests:
docker run selenium-tests
This command runs the tests inside the Docker container according to the configuration specified in testng.xml.
