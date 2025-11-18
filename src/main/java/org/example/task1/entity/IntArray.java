package org.example.task1.entity;

import java.io.Serializable;

public class IntArray implements Serializable {

  private int[] array;

  public IntArray(int length) {
    array = new int[length];
  }

  public int getElement(int index) {
    return array[index];
  }

  public int getLength() {
    return array.length;
  }

  public void setElement(int index, int value) {
    array[index] = value;
  }
}
