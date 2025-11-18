package org.example.task1.serialization.intarray.impl;

import java.io.IOException;
import java.io.ObjectInput;
import java.nio.CharBuffer;
import org.example.task1.entity.IntArray;
import org.example.task1.serialization.intarray.IntArraySerializer;

public class IntArraySerializerImpl implements IntArraySerializer {
  int INT_MAX_DIGITS = 9;

  @Override
  public IntArray serialize(ObjectInput fileReader) throws IOException {

  }
}
