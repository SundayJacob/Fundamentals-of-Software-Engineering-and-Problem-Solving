import javax.swing.JLabel;

/**
 * This is JSecretString Class program.
 *
 * @author Sunday Jacob Nwanyim
 *
 * Andrew ID:  snwanyim
 * 
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *         
 *
 */

public class JSecretString extends JLabel
{

    private String secretPhrase;
    private String displayedPhrase;

    public JSecretString()
    {
        secretPhrase = "";
        displayedPhrase = "";
        setText(displayedPhrase);
    }

    public JSecretString(String str)
    {
        setSecretString(str);
    }

    public void setSecretString(String phrase)
    {
        secretPhrase = phrase;
        String phraseUnderScore = "";
        String letter;
        int i;

        for (i = 0; i < secretPhrase.length(); i++)
        {
            letter = secretPhrase.substring(i, i + 1);
            if (letter.matches("[ \\p{Punct}]"))
            {
                phraseUnderScore = phraseUnderScore + letter;
            }
            else
            {
                phraseUnderScore = phraseUnderScore + "_";
            }
            displayedPhrase = phraseUnderScore;
            setText(displayedPhrase);

        }
    }

    public boolean equals(String phrase)
    {
        String secretPhraseStripped;
        String phraseStripped;

        secretPhraseStripped = secretPhrase.replaceAll("[\\p{Punct}]", "");
        phraseStripped = phrase.replaceAll("[\\p{Punct}]", "");

        if (secretPhraseStripped.equalsIgnoreCase(phraseStripped))
        {
            return true;
        }
        return false;
    }

    public String uncover(String str)
    {
        char secretStringChar[] = secretPhrase.toCharArray();
        char strChar[] = str.toCharArray();
        char displayedPhraseChar[] = displayedPhrase.toCharArray();

        for (char c : strChar)
        {
            String cStr = Character.toString(c);
            for (int i = 0; i < secretStringChar.length; i++)
            {
                String secretLetter = secretPhrase.substring(i, i + 1);
                if (cStr.equalsIgnoreCase(secretLetter))
                {
                    displayedPhraseChar[i] = secretPhrase.charAt(i);
                }
            }
        }
        displayedPhrase = String.valueOf(displayedPhraseChar);
        //return countUncovered(str);
        setText(displayedPhrase);

        return displayedPhrase;
    }

    public int countUncovered(String letters)
    {

        String lettersArray[] = letters.split("");
        int numUncovered = 0;
        for (String letter : lettersArray)
            for (int i = 0; i < displayedPhrase.length(); i++)
            {
                if (displayedPhrase.substring(i, i + 1).equalsIgnoreCase(letter))
                {
                    numUncovered++;
                }
            }
        return numUncovered;
    }

    public void printDisplayedPhrase()
    {
        System.out.println(displayedPhrase);
    }

    public String toString()
    {
        String str = displayedPhrase;
        return str;
    }

}
