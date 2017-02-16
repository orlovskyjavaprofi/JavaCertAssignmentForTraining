package SCJPregex;

import java.util.regex.*;
class Regex2 {
public static void main(String[] args) {
Pattern p = Pattern.compile(args[0]);
Matcher m = p.matcher(args[1]);
boolean b = false;
while(b = m.find()) {
System.out.print(m.start() + m.group());
}
}
}
//And the command line:
//java Regex2 

//What is the result?
//A. 234
//B. 334
//C. 2334
//D. 0123456
//E. 01234456
//F. 12334567
//G. Compilation fails
//It fails the array bounday problem