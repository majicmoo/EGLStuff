package comicbook;

import comicBooks.*;

public class Publisher2
{
  protected static String nl;
  public static synchronized Publisher2 create(String lineSeparator)
  {
    nl = lineSeparator;
    Publisher2 result = new Publisher2();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "<h1>";
  protected final String TEXT_2 = "</h1>" + NL + "" + NL + "<h2>Books Publisher For</h2>" + NL + "<ul>";
  protected final String TEXT_3 = NL + "\t<li><a href=\"";
  protected final String TEXT_4 = ".html\">";
  protected final String TEXT_5 = "</a></li>";
  protected final String TEXT_6 = NL + "</ul>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     Publisher publisher = (Publisher) argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append(publisher.getPublishersName());
    stringBuffer.append(TEXT_2);
     for (Book book : publisher.getBooksPublished()) { 
    stringBuffer.append(TEXT_3);
    stringBuffer.append(book.getName());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(book.getPublisher());
    stringBuffer.append(TEXT_5);
     } 
    stringBuffer.append(TEXT_6);
    return stringBuffer.toString();
  }
}
