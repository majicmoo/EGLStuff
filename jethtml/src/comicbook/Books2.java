package comicbook;

import comicBooks.*;

public class Books2
{
  protected static String nl;
  public static synchronized Books2 create(String lineSeparator)
  {
    nl = lineSeparator;
    Books2 result = new Books2();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "<h1>";
  protected final String TEXT_2 = "</h1>" + NL + "" + NL + "<h2>Will fill in later</h2>";
  protected final String TEXT_3 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     Book book = (Book) argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append(book.getName());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}
