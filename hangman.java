// Implimentattion of Hangman Game


import java.io.BufferedReader;

 import java.io.IOException;

 import java.io.InputStreamReader;

 import java.util.Random;

 public class hangman {
public static void main(String[] args) throws IOException {

    String[] listOfWords = {"IpodTouch","Blackberry","Apple","Samsung"};
//write here any number of words you want ...
    Random r=new Random();

    int randint = r.nextInt(listOfWords.length);
    String Word=listOfWords[randint].toLowerCase();
    char[] mword=Word.toCharArray();
    System.out.print(mword);
    int chance =10;
    String k="-";
    char[] show2 = mword.clone();
    for(int i=0;i<show2.length;i++)
                show2[i]=k.charAt(0);

    char[] show=mword.clone();

do{
    System.out.println();
    System.out.println("Guess the word ");

    InputStreamReader ir= new InputStreamReader(System.in);
    BufferedReader br =new BufferedReader(ir);
    String s=br.readLine();
    char ch = s.charAt(0);


    for(int i=0;i<mword.length;i++)
        if((show[i]==ch))
                show2[i]=ch;

    System.out.print(show2);
}while(chance-->0);
}

  }
