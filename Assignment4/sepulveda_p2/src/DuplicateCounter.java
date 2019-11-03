import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class DuplicateCounter{

    HashMap<String,Integer> wordCounter = new HashMap<String,Integer>();

    public void count(String dataFile) throws IOException{
        Scanner inputStream = new Scanner(new File(dataFile));

        while (inputStream.hasNext()){
            String word = inputStream.next();
            if (wordCounter.containsKey(word)){
                wordCounter.put(word,wordCounter.get(word) + 1);
            }
            else{
                wordCounter.put(word,1);
            }
        }
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

        for (Entry<String, Integer> entry : wordCounter.entrySet()){
            fw.write(entry.getKey() + ": " + entry.getValue()+"\n");
        }

        fw.close();
    }
}

class Application{
    public static void main(String []args) throws IOException{

        DuplicateCounter dupe = new DuplicateCounter();
        dupe.count("problem2.txt");
        dupe.write("unique_words_counts.txt");
    }
}
