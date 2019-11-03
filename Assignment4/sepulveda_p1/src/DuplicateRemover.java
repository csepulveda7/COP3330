import java.io.*;
import java.util.*;

public class DuplicateRemover {

    HashSet<String> uniqueWords = new HashSet<String>();

    public void remove(String dataFile) throws IOException{
        Scanner inputStream = new Scanner(new File(dataFile));

        while (inputStream.hasNext()){
            uniqueWords.add(inputStream.next());
        }
        inputStream.close();
    }

    public void write(String outputFile) throws IOException{
        File outFile = new File(outputFile);
        FileWriter fw = null;

        if (!outFile.exists()){
            outFile.createNewFile();
            fw = new FileWriter(outFile);
        }
        else{
            fw = new FileWriter(outFile,false);
        }

        for (String word : uniqueWords){
            fw.write(word+"\n");
        }

        fw.close();


    }
}
    class Application{
        public static void main(String []args) throws IOException{

            DuplicateRemover dupe = new DuplicateRemover();
            dupe.remove("problem1.txt");
            dupe.write("unique_words.txt");
        }
    }

