package _03_Intro_To_Regular_Expressions;

/*
 * Use String.replaceAll() to change the portion of the e-mail addresses after
 * the '@' to mail.com in the original message string below. For example,
 * johnDoe@newmail.com => johnDoe@mail.com
 * janeDoe@wwwmail.com => janeDoe@mail.com
 * 
 * You can assume:
 * 1. There are only word characters (\\w) after the '@' and there will always
 *    be at least 1.
 * 2. The string will always end in ".com" (\\.com)
 */

public class _01_RegularExpressionsIntro {
    /*
     * Code method below! 
     */
    String emailRemover(String message) {
        StringBuilder news = new StringBuilder(message);
        int start = 0;
        int end = 0;
        Boolean startFill = false;
        Boolean endFill = false;
        for(int i=0;i<message.length();i++) {
        	if(message.charAt(i)=='@') {
        		start = i;
        		startFill = true;
        	}
        	if(message.charAt(i)=='.') {
        		end = i+3;
        		endFill = true;
        	}
        	if(endFill && startFill == true) {
        		startFill = false;
        		endFill = false;
        		news.replace(start, end+1, "@mail.com");
        	}
        }
        return news.toString();
    }
}
