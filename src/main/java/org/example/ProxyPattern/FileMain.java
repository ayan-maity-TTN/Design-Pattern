package org.example.ProxyPattern;

public class FileMain {
    public static void main(String[] args) {
        FileServices fileServiceProxyAdmin = new FileServiceProxy("ADMIN");
        fileServiceProxyAdmin.readFile("admin_file.txt");

        FileServices fileServiceProxyUser = new FileServiceProxy("USER");
        fileServiceProxyUser.readFile("user_file.txt");
    }
}
