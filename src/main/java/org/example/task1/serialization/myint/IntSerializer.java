package org.example.task1.serialization.myint;

import java.io.IOException;
import java.io.Reader;
import org.example.task1.exception.SerializationFailedException;

public interface IntSerializer {
  int deserialize(Reader reader) throws IOException, SerializationFailedException;
}
