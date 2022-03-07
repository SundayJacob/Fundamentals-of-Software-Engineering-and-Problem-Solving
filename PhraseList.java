/**
 * This program is a PhraseList program.
 *
 * @author Sunday Jacob Nwanyim & Aanuoluwapo Orioke
 *
 * Andrew ID: snwanyim and aorioke
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *         
 *
 */


import java.util.*;

public class PhraseList
{
    private ArrayList< String > phrases;
    
    public PhraseList()
    {
        phrases = new ArrayList<String>();
    }
    
    public ArrayList<String> getPhrases()
    {
        return phrases;
    }

    public ArrayList< String > readInPhrases(String filename)
    {
        InputDataFile datafile = new InputDataFile(filename);
        String phrase;
        
        datafile.open();
        
        if (!datafile.isOpen())
        {
            System.out.println("Cannot open " + datafile.getName()
            + " for reading.");
            System.exit(1);
        }
        
        phrase = datafile.readString();
        while(phrase != null)
        {
            phrases.add(new String(phrase));
            phrase = datafile.readString();
        }
        datafile.close();
        return phrases;
    }
    
    public void addPhrase(String phrase)
    {
        phrases.add(phrase);
    }
    
    public String returnPhrase(int phraseNum)
    {
        String phrase = phrases.get(phraseNum);
        return phrase;
    }
    
    public String returnPhrase()
    {
        String phrase;
        int randomIndex;
        Random r = new Random();
        
        randomIndex = r.nextInt(phrases.size());
        phrase = phrases.get(randomIndex);
        
        return phrase;
    }
    
    public void clearAllPhrases()
    {
        phrases.clear();
    }
    
    
    public String toString()
    {
        String _phrase = "";
        for (String phrase : phrases)
            _phrase = _phrase  + phrase + "; ";
        return "PhraseList contains < " +  _phrase + " >";
    }
}
