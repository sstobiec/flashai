# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

Flashai is an AI-driven flashcard application built with Spring Boot 4.0.1 and Java 25.

## Build Commands

```bash
# Build the project
./mvnw clean install

# Run the application
./mvnw spring-boot:run

# Run all tests
./mvnw test

# Run a single test class
./mvnw test -Dtest=FlashaiApplicationTests

# Run a single test method
./mvnw test -Dtest=FlashaiApplicationTests#contextLoads

# Run with Testcontainers (dev mode)
./mvnw spring-boot:test-run
```

## Tech Stack

- **Framework**: Spring Boot 4.0.1 (Web MVC, Data JPA, Security, Actuator)
- **Database**: H2 (development), with JPA for persistence
- **Testing**: JUnit 5, Testcontainers, Spring Boot Test starters
- **Build**: Maven with Lombok annotation processing

## Project Structure

- `src/main/java/com/sstobiec/flashai/` - Main application code
- `src/main/resources/application.yaml` - Application configuration
- `src/test/java/com/sstobiec/flashai/` - Test code
  - `TestFlashaiApplication.java` - Entry point for running with Testcontainers
  - `TestcontainersConfiguration.java` - Testcontainers bean definitions