package org.example;
import java.util.List;
import java.util.Random;

public class TokenGenerator {
    static String tokenGenerator (org.example.TokenLength tokenLength) {
        int getTokenLength = tokenLength.getLength();
        List<Character> listOfChars = List.of('A','B','C','D','E','F','G','H','I','J','K','L','M','N','O',
                'P','Q','R','S','T','U','V','W','X','Y','Z', 'a','b','c','d','e','f','g','h','i','j','k',
                'l','m','n','o','p','q','r','s','t','u','v','x','y','z','0','1','2','3','4','5','6','7',
                '8','9', '!','@','#','$','%','^','&','*','(',')');

        StringBuilder token = new StringBuilder(getTokenLength);
        for (int i = 0; i < getTokenLength; i++) {
            Random value = new Random();
            final int index = value.nextInt(listOfChars.size());
            token.append(listOfChars.get(index));
        }
        return token.toString();
    }
}
