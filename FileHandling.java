import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

    public static void main(String[] args) {
        CreateFile();
        FileInformation();
        WriteInFile();
        ReadingTheFile();
        FileDelete();
    }

   static void CreateFile(){
            try{
    File obj_CreateFile = new File("FileHandling.txt");
            if(obj_CreateFile.createNewFile()){
            System.out.println("New file has been created with File Name as"+ obj_CreateFile.getName());
            }
            else{
            System.out.println("File Already Exists!!");
            }
                    } catch (IOException e) {
            System.out.println("An error has occurred while creating new file.");
                e.printStackTrace();
            }
    }

    static void FileInformation(){
        File obj_FileInformation = new File("FileHandling.txt");
        if(obj_FileInformation.exists()){
            System.out.println("File Name: "+ obj_FileInformation.getName());
            System.out.println("Absolute Path: "+obj_FileInformation.getAbsolutePath());
            System.out.println("Readable: "+obj_FileInformation.canRead());
            System.out.println("Writeable: "+obj_FileInformation.canWrite());
        }
        else{
            System.out.println("File does not exists");
        }
    }

    static void WriteInFile(){
        try {
            FileWriter obj_myWriter = new FileWriter("FileHandling.txt");
            obj_myWriter.write("File Handling Basics for QA Training");
            obj_myWriter.write("By YASH CHAUHAN");
            obj_myWriter.close();
            System.out.println("Successfully wrote to the file.");
        }
        catch (IOException e) {
            System.out.println("An error has occurred while writing in the file");
            e.printStackTrace();
        }
    }

    static void ReadingTheFile(){
        try {
            File obj_FileReading = new File("FileHandling.txt");
            Scanner myReader = new Scanner(obj_FileReading);
            while (myReader.hasNextLine()) {
                String dataInFile = myReader.nextLine();
                System.out.println(dataInFile);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the file");
            e.printStackTrace();
        }
    }

    static void FileDelete(){
        File obj_FileDelete = new File("FileHandling.txt");
        if (obj_FileDelete.delete()) {
            System.out.println("The File has been deleted Successfully with name as: " + obj_FileDelete.getName());
        } else {
            System.out.println("Some Error occured while deleting file!!");
        }
    }
}



