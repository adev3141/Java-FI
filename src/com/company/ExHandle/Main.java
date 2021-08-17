package com.company.ExHandle;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {

            processFile(reader);

        } catch(ArithmeticException ex){

            System.out.println("Invalid Math Operation: " + ex.getMessage());

        }
        catch (FileNotFoundException ex) {

            System.out.println("Error: " + ex.getMessage());

        } catch (IOException ex) {

            System.out.println("Error: " + ex.getMessage());

        } catch(Exception ex){

            System.out.println("Error: " + ex.getMessage());

        }

    }
    public static void processFile(BufferedReader reader) throws IOException{

        String inputLine = null;

        while((inputLine = reader.readLine()) != null){
            try{

                performOperation(inputLine);

            }catch(InvalidStatementException ex) {

                System.out.println("Error: Invalid Statement. "+ ex.getMessage() + "/n");
                System.out.println(ex.getMessage()+" "+ inputLine);

                if(ex.getCause() != null){
                    System.out.println("Caused by " +  ex.getCause());
                }

            }
        }

    }

    private static void performOperation(String inputLine) throws InvalidStatementException{

        try{
            String[] parts = inputLine.split(" ");
            if(parts.length != 3){

                throw  new InvalidStatementException("" +
                        "Statement must have 3 parts: operation leftval rightval");
            }

            MathOperation operation = MathOperation.valueOf(parts[0].toUpperCase());
            int leftVal = valueFromWord(parts[1]);
            int rightVal = valueFromWord(parts[2]);

            int result = execute(operation, leftVal, rightVal);

            System.out.println(inputLine + " = " + result);

        }catch(InvalidStatementException ex){

            throw ex;

        }
        catch (Exception ex){

            throw new InvalidStatementException("Error processing statement", ex);

        }


    }

    static int execute(MathOperation operation, int leftVal, int rightVal) {
        int result = 0;
        switch (operation) {
            case ADD:
                result = leftVal + rightVal;
                break;
            case SUBTRACT:
                result = leftVal - rightVal;
                break;
            case MULTIPLY:
                result = leftVal * rightVal;
                break;
            case DIVIDE:
                if(rightVal == 0){
                    /**IllegalArgumentException exception =
                            new IllegalArgumentException("Zero value is not permitted");
                    throw exception;**/
                    throw new IllegalArgumentException("Zero value is not permitted");
                }
                result = leftVal / rightVal;
                break;
        }
        return result;
    }

    static int valueFromWord(String word) {
        String[] numberWords = {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };
        int value = -1;
        for(int index = 0; index < numberWords.length; index++) {
            if(word.equals(numberWords[index])) {
                value = index;
                break;
            }
        }
        if(value == -1)
            value = Integer.parseInt(word);

        return value;
    }

}
