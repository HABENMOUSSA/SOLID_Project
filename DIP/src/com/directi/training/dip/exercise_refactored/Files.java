package com.directi.training.dip.exercise_refactored;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Base64;

public class Files implements Model {
	
	
	@Override
	public void encodeBasedOnNetworkAndDatabase() {
		System.out.println("Can't do it. It is a file");
	}
	@Override
    public void encodeWithFiles() throws IOException
    {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(
                new FileReader("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt"));
            writer = new BufferedWriter(
                new FileWriter("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt"));
            String aLine;
            while ((aLine = reader.readLine()) != null) {
                String encodedLine = Base64.getEncoder().encodeToString(aLine.getBytes());
                writer.append(encodedLine);
            }
        } finally {
            if (writer != null) {
                writer.close();
            }
            if (reader != null) {
                reader.close();
            }
        }
    }

}
