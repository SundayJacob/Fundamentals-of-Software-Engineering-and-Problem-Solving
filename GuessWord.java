
/**
 * This program is a GuessWord program.
 *
 * @author Sunday Jacob Nwanyim & Aanuoluwapo Orioke
 *
 * Andrew ID: snwanyim and aorioke
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *         
 *
 */


import java.util.ArrayList;

public class GuessWord
{
    public static void main(String args[])
    {
        String filename;
        String secret;
        ArrayList< String > wordsPhrases;
        PhraseList wordsList = new PhraseList();
        SecretString secretPhrase;
        String displayPhrase;
        
        if (args.length != 0)
        {
            filename = args[0];
            wordsList.readInPhrases(filename);
        }
        //hard-coded phrase
        wordsList.addPhrase("This is a manually added phrase.");
        
        //generate random phrase
        secret = wordsList.returnPhrase();
        secretPhrase = new SecretString(secret);
        
        //displayPhrase = secretPhrase.getDisplayedPhrase();
        
        System.out.println(secret);
        
        //System.out.println(displayPhrase);
        
    }
}
