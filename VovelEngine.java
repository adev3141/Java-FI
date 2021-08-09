import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.*;

public class VovelEngine{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("input a sentence");

        String sentence = input.nextLine();

        System.out.println(checkVovels(sentence));

    }

    public static String checkVovels(String a){

        a.toLowerCase();

        String vovelList = "";

        for(int i = 0; i<a.length(); i++){

            char letter = a.charAt(i);

            if(letter==('a') || letter==('e')|| letter==('i')|| letter==('o')|| letter==('u') || letter==('A') || letter==('E')|| letter==('I')|| letter==('O')|| letter==('U')){

                String L = Character.toString(letter);

                vovelList=vovelList.concat(" ").concat(L);

            }
        }
        return vovelList;
    }

}