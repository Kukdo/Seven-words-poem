package test4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Funtions {

	//count model
	public static int count(String srcStr, String findStr) {
		int count = 0;
		int index = 0;
		while ((index = srcStr.indexOf(findStr, index)) != -1) {// if key exists in str
			index = index + findStr.length();
			count++; // +1
		}
		return count;
	}
	//split model
	public static void printsplit(String strsplit) {
		for (int i = 0; i<strsplit.length(); i = i+7) {
			if( i%2 == 0 ){
				String split = strsplit.substring(i, i+7);
				System.out.print(split+ "£¬");			
			} 
			if( i%2 == 1 ){
				String split = strsplit.substring(i, i+7);
				System.out.print(split+ "¡£" + "\n");			
			} 
		}	
	}
    public static void main(String[] args) {
        printsplit(args[0]);
    	// input and Exception model
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
        String str = null;
        while(true){
            try {
                System.out.println("Please type the word or words you want to count: " );
                str = br.readLine();
            }catch(IOException e){
                e.printStackTrace();
                System.out.println("IO's type error!");
            }
            //System.out.print(str+"\n");
            break;
        }
		int count = count(args[0], str);
        System.out.println(str + " has appeared " + count + " times.");
    }
}

