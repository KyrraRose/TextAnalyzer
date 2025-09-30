package com.pluralsight;

import java.util.Scanner;

public class TextAnalyzer {
    public static void main(String[] args) {
        //Let's start by calling our scanner
        Scanner scanner = new Scanner(System.in);

        //Now let's say hello!
        System.out.println("Ahh! You startled me! What are you doing he- I mean hello!\nI'm Pebbol, your new text aggregator goblin- I love to eat up phrases and tell you all about them.\nPlease tell me a phrase so I may eat it!");
        String userPhrase = scanner.nextLine().trim();
        System.out.println("Yumyumyum- Thank you! I'll get munching right away and let you know all about it.");

        String[] phraseArray = userPhrase.split("\\ ,-");
        int phraseCharLength = userPhrase.length();

        //Trying to remove the spaces with a replace all
        String removeSpace = " ";
        String phraseNoSpace = userPhrase.replaceAll(removeSpace,"");
        int phraseCharNoSpace = phraseNoSpace.length();

        int phraseArrayLen = phraseArray.length;

        System.out.printf("That was delicious! Your phrase is %d characters long, %d if you don't count spaces, and has %d words!\nDo you want to know the first and last place a letter appears?\n",phraseCharLength,phraseCharNoSpace);



    }
}
