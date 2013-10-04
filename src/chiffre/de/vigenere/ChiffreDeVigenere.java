package chiffre.de.vigenere;


public class ChiffreDeVigenere {
    private String originalString;
    private String keyString;
    private String resultString;
    private char bufferOriginal;
    private char bufferKey;
    private static String alphabet = ("abcdefghijklmnopqrstuvwxyz");
    private static int lng = 26;
    private int positionOriginal;
    private int positionKey;
    private int positionResult;

    public ChiffreDeVigenere(String userString, String userKeyString){
        originalString = userString.toLowerCase();
        keyString = userKeyString;
        while (keyString.length() < userString.length()){
            keyString = keyString.concat(userKeyString);
        }
        keyString = keyString.substring(0, userString.length());
        keyString = keyString.toLowerCase();
    }

    public void encrypt(){
        resultString = "";
        for (int i = 0; i < originalString.length(); i++){
            bufferOriginal = originalString.charAt(i);
            bufferKey = keyString.charAt(i);
            positionOriginal = alphabet.indexOf(bufferOriginal);
            positionKey = alphabet.indexOf(bufferKey);
            positionResult = (positionOriginal + positionKey) % lng;
            resultString = resultString.concat(alphabet.substring(positionResult, positionResult + 1));
        }
        System.out.println(resultString);
    }
    public void decrypt(){
        resultString = "";
        for (int i = 0; i < originalString.length(); i++){
            bufferOriginal = originalString.charAt(i);
            bufferKey = keyString.charAt(i);
            positionOriginal = alphabet.indexOf(bufferOriginal);
            positionKey = alphabet.indexOf(bufferKey);
            positionResult = (positionOriginal - positionKey + lng) % lng;
            resultString = resultString.concat(alphabet.substring(positionResult, positionResult + 1));
        }
        System.out.println(resultString);
    }
}
