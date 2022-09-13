package com.Interface;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);
}
