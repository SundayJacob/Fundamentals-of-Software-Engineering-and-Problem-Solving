/**
 * This program is a Secret String program.
 *
 * @author Sunday Jacob Nwanyim & Aanuoluwapo Orioke
 *
 * Andrew ID: snwanyim and aorioke
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *         
 *
 */

public class SecretString
{

    private String secretPhrase;
    private String displayedPhrase;

    public SecretString()
    {
        secretPhrase = "";
        displayedPhrase = "";

    }

    public SecretString(String str)
    {
        secretPhrase = str;
        displayedPhrase = "";
    }

    public void setSecretString(String str)
    {
        secretPhrase = str;
    }

    public String getSecretString()
    {
        return secretPhrase;
    }

    public String showSecretPhrase()
    {
        char[] characterOfPhrase = new char[secretPhrase.length()];
        characterOfPhrase = secretPhrase.toCharArray();
        int i;
        for (i = 0; i < secretPhrase.length(); i++)
        {
            if (Character.isLetter(characterOfPhrase[i]))
            {
                displayedPhrase = displayedPhrase + "_";
            }

            else
            {
                displayedPhrase = displayedPhrase + characterOfPhrase[i];
            }

        }

        return displayedPhrase;
    }

    public void setdisplayPart(String str)
    {
        char[] rightGuess = str.toLowerCase().toCharArray();
        char[] testPhrase = secretPhrase.toCharArray();
        for (int i = 0; i < rightGuess.length; i++)
        {
            if (displayedPhrase.contains(String.valueOf(rightGuess[i])))
            {
                continue;
            }

            else
            {
                for (int k = 0; k < secretPhrase.length(); k++)
                {
                    if (rightGuess[i] == testPhrase[k])
                    {
                        displayedPhrase = displayedPhrase.substring(0, k) + testPhrase[k]
                                + displayedPhrase.substring(k + 1);
                    }
                }

            }
        }

    }

    public void printDisplayedPhrase()
    {
        System.out.println(displayedPhrase);
    }

    public boolean phraseGuessing(String str)
    {

        String testPhrase = "";
        for (int i = 0; i < secretPhrase.length(); i++)
        {
            if (Character.isLetter(secretPhrase.charAt(i)) || Character.isWhitespace(secretPhrase.charAt(i)))
            {
                testPhrase = testPhrase + secretPhrase.charAt(i);
            }

        }

        if (str.equalsIgnoreCase(testPhrase))
        {
            return true;
        }

        return false;
    }

}
