package org.example.task1.serialization.serializer.intarray.impl;

import java.io.IOException;
import java.util.ArrayList;
import org.example.task1.entity.IntArray;
import org.example.task1.exception.SerializationFailedException;
import org.example.task1.serialization.readerwrap.SerializerReaderWrapper;
import org.example.task1.serialization.serializer.intarray.IntArraySerializer;
import org.example.task1.serialization.serializer.intserializer.IntSerializer;
import org.example.task1.serialization.serializer.intserializer.impl.IntSerializerImpl;

public class IntArraySerializerImpl implements IntArraySerializer {

  @Override
  public int[] deserialize(SerializerReaderWrapper reader)
      throws IOException, SerializationFailedException {
    IntSerializer intSerializer = new IntSerializerImpl();
    ArrayList<Integer> list = new ArrayList<>();

    do {
      try {
        list.add(intSerializer.deserialize(reader));
      } catch (SerializationFailedException _) {

      }
    } while (!(reader.getLastRead() == -1 || reader.getLastRead() == '\n'));

    if(list.isEmpty()) {
      throw new SerializationFailedException("no numbers, impossible to form array");
    }

    return list.stream().mapToInt(i->i).toArray();
  }
}
