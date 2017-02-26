package applications;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by dpuscasu on 12-Jan-17.
 */
public class TextParser {


    public String emailExtractor(String emailStringToMatch) {
        String email = "";
        String regex = "\\b[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}\\b";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(emailStringToMatch);
        if (m.find()) {
            for (int i = 0; i <= m.groupCount(); i++) {
                System.out.println(m.group(i));
                email = m.group(i);
            }
        }
        return email;
    }
}
