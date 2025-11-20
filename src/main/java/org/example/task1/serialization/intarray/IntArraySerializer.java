package org.example.task1.serialization.intarray;

import java.io.IOException;
import java.io.Reader;
import org.example.task1.entity.IntArray;

public interface IntArraySerializer {
  IntArray deserialize(Reader reader) throws IOException;
}
