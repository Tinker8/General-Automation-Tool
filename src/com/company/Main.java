package com.company;
import com.sun.org.apache.xpath.internal.operations.Bool;
import java.util.regex.*;

import javax.sound.midi.SysexMessage;
import java.io.*;

/*
Can Create Folders - createFolders("C:\\full path name\\","name of folder");
Can create text docs -
 */

public class Main {

    public static void main(String[] args) throws IOException {
        //String pathname = "C:\\Users\\locala.BUR5-S4VMDR4\\Desktop\\BuildTest\\Images\\tifs";
        //Create new folder
        //createFolders("Names");
        //Create text file
        //createText("Models");
        //Finds model code from file name
        //System.out.println(getModelCode(openFile("Models.txt",1),0));

        //System.out.println(getFileNames("C:\\Users\\locala.BUR5-S4VMDR4\\Desktop\\BuildTest\\Images\\tifs"));

        //System.out.println(getModelCode(getFileNames("C:\\Users\\locala.BUR5-S4VMDR4\\Desktop\\BuildTest\\Images\\tifs"),0));

        //System.out.println(findAllModels("C:\\Users\\griffithsa\\Desktop\\BuildTest\\Images\\tifs","00m"));
        //listNumbers();

        //System.out.println(ifLineExists("C:\\Users\\griffithsa\\Desktop\\BuildTest\\Images\\tifs\\", "Models", "[Models]"));
        try {
            //test(); //"cd C:\\Users\\griffithsa\\Desktop\\BuildTest\\Images\\tifs\nmagick gbr00myyijd5jex(a)(a)jkx_1_0.tif gbr00myyijd5jex(a)(a)jkx_1_0.png"
            //System.out.println(openFile("C:\\Users\\griffithsa\\Desktop\\BuildTest\\Images\\tifs\\","Models",0));
        }catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static String uscCodes(String filename){
        /*final*/ String regex = "[a-z0-9]{3}";
        //final String string = filename;
        String temp = "";
        /*final*/ Pattern pattern = Pattern.compile(regex);
        /*final*/ Matcher matcher = pattern.matcher(filename);
        //return "Full match: " + matcher.group(0);

        while ( matcher.find()) /*(matcher.find())*/ {
            //System.out.println("Full match: " + matcher.group(0));
            //for (int i = 1; i <= matcher.groupCount(); i++) {
            temp +=  matcher.group(0) + "\n";
            //temp += "Group " + ": " + matcher.lastMatch();
            //}
        }
        return temp;
    }

    public static void test() throws Exception{
        try {
        ProcessBuilder builder = new ProcessBuilder(
        //        "cmd.exe", "/c", "cd C:\\Users\\griffithsa\\Desktop\\BuildTest\\Images\\tifs && magick convert gbr00myyijd5jex(a)(a)jkx_1_0.tif[0] gbr00myyijd5jex(a)(a)jkx_1_0_converted.png");
                            "cmd.exe", "/c", "cd C:\\Users\\griffithsa\\Desktop\\BuildTest\\Images\\tifs\\Names && magick mogrify -path C:\\Users\\griffithsa\\Desktop\\BuildTest\\Images\\tifs\\Names\\temp -resize 1600x900 *.png");
            builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while (true) {
            line = r.readLine();
            if (line == null) { break; }
            System.out.println(line);
        }
    }
    catch (IOException e){
        e.printStackTrace();
    }
    }

    public static void listNumbers(){
        for (int i=1;i<100;i++){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static String getModelCode(String filename){
        if (filename.length() > 5) return filename.substring(3, 6);
        else {
            return "Error"; //Improve error later
        }
    }

    //Find all of model
    private static String findAllModels(String pathname, String modelcode) {
        //getFileNames(pathname);

        String fileNames = "";
        File folder = new File(pathname);
        File[] listOfFiles = folder.listFiles();

        for (int i=0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile() && modelcode.equals(getModelCode(listOfFiles[i].getName()))) {
                    //System.out.println("File " + listOfFiles[i].getName());
                    fileNames += listOfFiles[i].getName() + "\n";
                } else if (listOfFiles[i].isDirectory() && modelcode.equals(getModelCode(listOfFiles[i].getName()))) {
                    //System.out.println("Directory " + listOfFiles[i].getName());
                    //fileNames += listOfFiles[i].getName() + "(Folder)" + "\n";
                    //add search sub directorys
                }
        }
        return fileNames;
    }

    public static boolean ifLineExists(String pathname, String filename, String match) throws IOException {
        Boolean temp = false;

        for (int i = 0; i < 2; i++){
            if (openFile(pathname, filename, i).equals(match) && openFile(pathname, filename, i) != null) {
                temp = true;
            }
        }
        return temp;
    }

    //Finds a given path, then every file/folder in that location
    public static String getFileNames(String pathname){
        String fileNames = "";
        File folder = new File(pathname);
        File[] listOfFiles = folder.listFiles();

        for (int i=0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                //System.out.println("File " + listOfFiles[i].getName());
                fileNames += listOfFiles[i].getName() + "\n";
            } else if (listOfFiles[i].isDirectory()) {
                //System.out.println("Directory " + listOfFiles[i].getName());
                fileNames += listOfFiles[i].getName() + "(Folder)" + "\n";
                //add search sub directorys
            }
        }
        return fileNames;
    }

    //Test to create folders/files structures and paths
    public static void setupDatabase(){

    }

    //Creates a new folder with the given name
    public static void createFolders(String pathname, String temp){
        File dir = new File(pathname+temp); dir.mkdir();

    }

    //Creates a new text file with the given name
    public static void createText(String pathname, String filename){
        try{
            PrintWriter writer = new PrintWriter(pathname+filename+".txt", "UTF-8");
            writer.println("[Models]");
            writer.println("gbr00myyijd5jex(a)(a)jkx_1_0");
            writer.close();
        } catch (IOException e) {
            // do something
        }
    }

    public static void save() throws IOException {
        //String file_name = "C:\\Users\\locala.BUR5-S4VMDR4\\Desktop\\BuildTest\\Images\\tifs\\"
    }
/*
    public static String readEntireFile(String pathname, String filename){
        String temp = "";
        int i = 0;
            try {
                while (true){

                    temp += openFile(pathname, filename, i);
                    i++;

                }
            }catch(IOException e) {
                //System.out.println(e.getMessage());
            }
            return temp;
        }
*/
    //Reads reads a given line number from the given filename [filename, lineNumber]
    //Change path in future
    public static String openFile(String pathname, String filename) throws IOException {
        int noOfLines = 3;
        String[] textData = new String[noOfLines];
        String textd = "";
        int i;

        try {

            FileReader fr = new FileReader(pathname + filename+".txt");
            BufferedReader textReader = new BufferedReader(fr);



            for (i = 0; i < noOfLines; i++) {
                //textData[i] = textReader.readLine();
                String temp = textReader.readLine();
                if (temp != null) textd += temp+"\n";
            }
            textReader.close();

        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
        //return textData[no];
        return textd;
    }

    public static String openFile(String pathname, String filename, int no) throws IOException {
        int noOfLines = 3;
        String[] textData = new String[noOfLines];
        int i;

        try {

            FileReader fr = new FileReader(pathname + filename+".txt");
            BufferedReader textReader = new BufferedReader(fr);


            for (i = 0; i < noOfLines; i++) {
                textData[i] = textReader.readLine();
            }
            textReader.close();

        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
        return textData[no];
    }

    //Test to run external programs
    public static void runExe(String temp){
        String s = null;

        try {

            // using the Runtime exec method:
            Process p = Runtime.getRuntime().exec(temp);

            BufferedReader stdInput = new BufferedReader(new
                    InputStreamReader(p.getInputStream()));

            BufferedReader stdError = new BufferedReader(new
                    InputStreamReader(p.getErrorStream()));

            // read the output from the command
            System.out.println("Here is the standard output of the command:\n");
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }

            // read any errors from the attempted command
            System.out.println("Here is the standard error of the command (if any):\n");
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }

            System.exit(0);
        }
        catch (IOException e) {
            System.out.println("exception happened - here's what I know: ");
            e.printStackTrace();
            System.exit(-1);
        }
    }
}
