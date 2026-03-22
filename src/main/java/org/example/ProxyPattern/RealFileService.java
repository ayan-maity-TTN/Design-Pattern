package org.example.ProxyPattern;

public class RealFileService implements FileServices{

  @Override
  public void readFile(String fileName) {
    System.out.println("Reading file: " + fileName);
  }
}
