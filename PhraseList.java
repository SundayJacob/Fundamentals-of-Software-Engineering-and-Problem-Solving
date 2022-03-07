

import java.util.*;
/**
 * This is PhraseList Class program.
 *
 * @author Sunday Jacob Nwanyim
 *
 * Andrew ID: snwanyim
 * 
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *
 */
public class PhraseList
{
    private ArrayList<String> phrases;

    public PhraseList()
    {
        phrases = new ArrayList<String>();
    }

    public PhraseList(String filename)
    {
        phrases = new ArrayList<String>();
        readInPhrases(filename);
    }

    public void readInPhrases(String filename)
    {

        InputDataFile datafile = new InputDataFile(filename);
        String phrase;

        datafile.open();

        if (!datafile.isOpen())
        {
            System.out.println("Cannot open " + datafile.getName() + " for reading.");
            System.exit(1);
        }

        phrase = datafile.readString();
        while (phrase != null)
        {
            phrases.add(phrase);
            phrase = datafile.readString();
        }
        datafile.close();
    }

    public void addPhrase(String phrase)
    {
        phrases.add(phrase);
    }

    public String getPhrase(int phraseNum)
    {
        if (phraseNum >= 0 && phraseNum < phrases.size())
        {
            String phrase = phrases.get(phraseNum);
            return phrase;
        }
        else
        {
            return "Out of Range";
        }
    }

    public String getRandomPhrase()
    {
        String phrase;
        int randomIndex;
        Random r = new Random();

        randomIndex = r.nextInt(phrases.size());
        phrase = phrases.get(randomIndex);

        return phrase;
    }

    public void clear()
    {
        phrases.clear();
    }

    public void print()
    {

        System.out.println(phrases);
    }

    public String toString()
    {
        return "PhraseList contains " + phrases;
    }

}
