package org.exceptions;

public class MoodAnalyzer extends Exception {

    String mood;

    public MoodAnalyzer() {
    }
    //constructor for gate message
    public MoodAnalyzer(String message) {
        super(message);
        this.mood = message;
    }

    //analyzemood by using given message
    public String analyzeMood() {
         //handle exception when we entered null mood or empty mood
        try {

            if (mood == null || mood.isEmpty()) {
                throw new MoodAnalyzer(" Invalid mood null value");
            }


            if (mood.contains("sad")) {
                //if message has keyword sad then mood is sad
                return "sad";
            }
            if (mood.contains("happy")) {
                //if message contains happy keyword it returns Happy
                return "Happy";
            }
        } catch (MoodAnalyzer e) {
            //catch null mood exception
            System.out.println(e.getMessage());
            return "Happy";
        }
      return analyzeMood();
    }
}
