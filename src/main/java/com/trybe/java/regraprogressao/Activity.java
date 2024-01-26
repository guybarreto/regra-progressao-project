package com.trybe.java.regraprogressao;

/**
 * The type Activity.
 */
public class Activity {

  /**
   * The Name.
   */
  public String name;
  /**
   * The Weight.
   */
  public float weight;

  /**
   * Instantiates a new Activity.
   *
   * @param name   the name
   * @param weight the weight
   */
  public Activity(String name, float weight) {
    this.name = name;
    this.weight = weight;
  }

  /**
   * Gets weight.
   *
   * @return the weight
   */
  public float getWeight() {
    return weight;
  }
}
