package com.trybe.java.regraprogressao;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Period.
 */
public class Period {

  /**
   * The Activities.
   */
  public List<Activity> activities;

  /**
   * Instantiates a new Period.
   */
  public Period() {
    this.activities = new ArrayList<>();
  }

  /**
   * Register activity.
   *
   * @param name   the name
   * @param weight the weight
   * @param grade  the grade
   */
  public void registerActivity(String name, float weight, float grade) {
    Activity activity = new Activity(name, weight, grade);
    activities.add(activity);
  }

  /**
   * Check sum of weights boolean.
   *
   * @return the boolean
   */
  public boolean checkSumOfWeights() {
    float sumOfWeights = 0;
    for (Activity activity : this.activities) {
      sumOfWeights += activity.getWeight();
    }
    return sumOfWeights == 100;
  }
}
