package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) throws IOException {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */
		String filePath = "src/";
		LinkedList<String> linkedList = new LinkedList<>();
		Stack<String> stack = new Stack<>();

		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
			String line = bufferedReader.readLine();
			while (line != null) {
				if (!line.trim().isEmpty()) {
					linkedList.add(line.trim());
					stack.push(line.trim());
				}
				line = bufferedReader.readLine();
			}
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

// Iterate through the LinkedList using For Each loop
		for (String word : linkedList) {
			System.out.println(word);
		}

// Iterate through the Stack using pop() method
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());

		}
	}
}









