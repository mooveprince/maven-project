package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * Method to do greet  
   */
  public final String greet(final String someone) {
    return String.format("Hello Jenkins, %s!", someone);
  }
}
