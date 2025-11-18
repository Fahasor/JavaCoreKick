package org.example.task1.factory.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import org.example.task1.entity.IntArray;
import org.example.task1.factory.IntArrayFromFileFactory;

public class IntArrayFromFileFactoryImpl implements IntArrayFromFileFactory {

  private int[] sampleArray;

  public IntArrayFromFileFactoryImpl(Path path) throws FileNotFoundException, IOException {
    File file = path.toFile();
    FileInputStream fileInputStream = new FileInputStream(file);
    byte[] bytes = fileInputStream.readAllBytes();
    String string = Arrays.toString(bytes);

  }

  @Override
  public IntArray produceArray() {
    IntArray array = new IntArray(sampleArray.length);
    for (int i = 0; i < sampleArray.length; i++) {
      array.setElement(i, sampleArray[i]);
    }
    return array;
  }
}
