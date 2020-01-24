package it.itis.cuneo;

import javax.annotation.processing.FilerException;
import java.io.*;

/**
 * Created by inf.gondoloa1112 on 19/12/2019.
 */
public class TextFile {
    private char mode; // R = read, W = write
    private BufferedReader reader;
    private BufferedWriter writer;

    public TextFile(String filename, char mode) throws IOException{
        this.mode = 'R';
        if (mode == 'W' || mode == 'W'){
            this.mode = 'W';
            writer = new BufferedWriter(new FileWriter(filename));
        }else{
            reader = new BufferedReader(new FileReader(filename));
        }
    }

    public void toFile(String line) throws FilerException, IOException{
        if(this.mode=='R')throw new FilerException("Read only" + "file!");
            writer.write(line);
            writer.newLine();
    }

    public String fromFile() throws FilerException, IOException{
        String tmp;
        if(this.mode == 'W')throw new FilerException("writer only" + "file!");
        tmp = reader.readLine();
        if(tmp == null) throw new FilerException("End of File");
        return tmp;
    }

    public void closeFile()throws IOException{
        if (this.mode == 'W'){
            writer.close();
        }else{
            reader.close();
        }

    }

    public static void main(String args[])throws IOException{
        TextFile out = new TextFile("file.txt",'W');
        try {
            out.toFile("Riga 1");
            out.toFile("Riga 2");
        }
    }
}
