package org.mxhc.decorators;

public interface DataSource {
    
    void writeData(String data);
    
    String readData();
    
}
