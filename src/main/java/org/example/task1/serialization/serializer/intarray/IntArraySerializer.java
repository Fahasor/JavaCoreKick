package org.example.task1.serialization.serializer.intarray;

import java.io.IOException;
import org.example.task1.exception.SerializationFailedException;
import org.example.task1.serialization.readerwrap.SerializerReaderWrapper;

public interface IntArraySerializer {

  int[] deserialize(SerializerReaderWrapper reader)
      throws IOException, SerializationFailedException;
}
