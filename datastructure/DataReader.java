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


		String filePath = System.getProperty("C:\\Users\\My Pc\\Desktop\\midterm-coding-exam\\src\\data");
		LinkedList<String> linkedList = new LinkedList<>();
		Stack<String> stack = new Stack<>();

		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line = reader.readLine();
					while (line != null) {
						String[] words = line.split(" ");
						for (String word : words) {
							linkedList.add(word);
							stack.push(word);
						}
						line = reader.readLine();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}

				// print the LinkedList in FIFO order
				System.out.println("LinkedList:");
				for (String word : linkedList) {
					System.out.print(word + " ");
				}

				// print the Stack in FILO order
				System.out.println("\n\nStack:");
				while (!stack.empty()) {
					System.out.print(stack.pop() + " ");
				}
			}
		}








