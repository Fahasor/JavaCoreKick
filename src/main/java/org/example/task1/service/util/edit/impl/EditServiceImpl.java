package org.example.task1.service.util.edit.impl;

import org.example.task1.entity.IntArray;
import org.example.task1.service.util.edit.EditService;

public class EditServiceImpl implements EditService {

  @Override
  public void swap(IntArray array, int indexA, int indexB) {
    int elementA = array.getElement(indexA);
    int elementB = array.getElement(indexB);
    array.setElement(indexA, elementB);
    array.setElement(indexB, elementA);
  }
}
