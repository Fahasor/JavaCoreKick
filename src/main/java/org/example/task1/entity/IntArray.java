package org.example.task1.entity;

import java.util.Arrays;

public class IntArray {

  private int[] array;

  public IntArray(int[] array) {
    this.array = array.clone();
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

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    IntArray array1 = (IntArray) o;
    return Arrays.equals(array, array1.array);
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(array);
  }
}
