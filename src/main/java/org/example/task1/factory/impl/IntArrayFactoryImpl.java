package org.example.task1.factory.impl;

import org.example.task1.entity.IntArray;
import org.example.task1.factory.IntArrayFactory;

public class IntArrayFactoryImpl implements IntArrayFactory {

  int[] array;

  public IntArrayFactoryImpl(int[] array) {
    this.array = array.clone();
  }

  @Override
  public IntArray produce() {
    return new IntArray(array);
  }
}
