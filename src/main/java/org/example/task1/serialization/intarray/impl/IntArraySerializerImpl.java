package org.example.task1.serialization.intarray.impl;

import java.io.IOException;
import java.io.Reader;
import org.example.task1.entity.IntArray;
import org.example.task1.exception.SerializationFailedException;
import org.example.task1.serialization.intarray.IntArraySerializer;
import org.example.task1.serialization.myint.IntSerializer;
import org.example.task1.serialization.myint.impl.IntSerializerImpl;

public class IntArraySerializerImpl implements IntArraySerializer {

  @Override
  public IntArray deserialize(Reader reader) throws IOException, SerializationFailedException {
    IntSerializer intSerializer = new IntSerializerImpl();
    int arraySize = intSerializer.deserialize(reader);
    int[] array = new int[arraySize];

    for (int i = 0; i < arraySize; i++) {
      intSerializer.deserialize(reader);
    }
    return new IntArray(array);
  }
}
