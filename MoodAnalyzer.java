package org.exceptions;

public class MoodAnalyzer{

    String mood;
    //analyzemood method for getting meassge
    public String analyzeMood(String message) {
         this.mood = message;
        //analyze mood by checking message

        if (mood.contains("sad")) {
            //if message has keyword sad then mood is sad
            return "sad";
        } else
            //for any mood it returns happy
            return "Happy" ;
    }
}
