package org.example.task1.serialization.intarray;

import java.io.IOException;
import java.io.Reader;
import org.example.task1.entity.IntArray;
import org.example.task1.exception.SerializationFailedException;

public interface IntArraySerializer {
  IntArray deserialize(Reader reader) throws IOException, SerializationFailedException;
}
