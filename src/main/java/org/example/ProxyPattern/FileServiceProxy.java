package org.example.ProxyPattern;

public class FileServiceProxy implements FileServices{
  private RealFileService realFileService;
  private String userRole;

  public FileServiceProxy (String userRole) {
    this.userRole = userRole;
  }
  @Override
  public void readFile(String fileName) {
        if (userRole.trim().equalsIgnoreCase("ADMIN")){
          if(realFileService == null){
            realFileService = new RealFileService();   // lazy initialization of the real file service
          }
          realFileService.readFile(fileName);
        }else {
          System.out.println("Access denied. User does not have permission to read the file.");
        }
  }
}
