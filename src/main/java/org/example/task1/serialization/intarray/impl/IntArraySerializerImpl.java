package org.example.task1.serialization.intarray.impl;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.Reader;
import java.nio.CharBuffer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.task1.entity.IntArray;
import org.example.task1.serialization.intarray.IntArraySerializer;

public class IntArraySerializerImpl implements IntArraySerializer {
  int INT_MAX_DIGITS = 9;
  Logger logger = LogManager.getLogger();

  @Override
  public IntArray deserialize(Reader reader) throws IOException {
    // TODO implement
    return IntArray();
  }
}
