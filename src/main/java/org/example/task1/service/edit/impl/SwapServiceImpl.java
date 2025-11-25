package org.example.task1.service.edit.impl;

import org.example.task1.entity.IntArray;
import org.example.task1.service.edit.SwapService;

public class SwapServiceImpl implements SwapService {

  @Override
  public void swap(IntArray array, int indexA, int indexB) {
    int elementA = array.getElement(indexA);
    int elementB = array.getElement(indexB);
    array.setElement(indexA, elementB);
    array.setElement(indexB, elementA);
  }
}
