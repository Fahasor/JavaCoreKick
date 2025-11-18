package org.example.task1.serialization.intarray;

import java.io.FileInputStream;
import org.example.task1.entity.IntArray;

public interface IntArraySerializer {
  IntArray serialize(FileInputStream stream);
}
