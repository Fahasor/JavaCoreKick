package org.example.task1.serialization.serializer.intserializer;

import java.io.IOException;
import org.example.task1.exception.SerializationFailedException;
import org.example.task1.serialization.readerwrap.SerializerReaderWrapper;

public interface IntSerializer {

  int deserialize(SerializerReaderWrapper reader) throws IOException, SerializationFailedException;
}
