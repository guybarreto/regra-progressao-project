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
   */
  public void registerActivity(String name, float weight) {
    this.activities.add(new Activity(name, weight));
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
