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
   * The Grade.
   */
  public float grade;


  /**
   * Instantiates a new Activity.
   *
   * @param name   the name
   * @param weight the weight
   * @param grade  the grade
   */
  public Activity(String name, float weight, float grade) {
    this.name = name;
    this.weight = weight;
    this.grade = grade;
  }

  /**
   * Gets weight.
   *
   * @return the weight
   */
  public String getName() {
    return name;
  }

  /**
   * Gets weight.
   *
   * @return the weight
   */
  public float getWeight() {
    return weight;
  }

  /**
   * Gets grade.
   *
   * @return the grade
   */
  public float getGrade() {
    return grade;
  }

  /**
   * Sets grade.
   *
   * @param grade the grade
   */
  public void setGrade(float grade) {
    this.grade = grade;
  }
}
