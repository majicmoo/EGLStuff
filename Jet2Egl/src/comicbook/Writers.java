package comicbook;

import comicBooks.*;

public class Writers
{
  protected static String nl;
  public static synchronized Writers create(String lineSeparator)
  {
    nl = lineSeparator;
    Writers result = new Writers();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "<h2>Writers</h2>" + NL + "<ul>";
  protected final String TEXT_3 = NL + "\t<li><a href=\"";
  protected final String TEXT_4 = ".html\">";
  protected final String TEXT_5 = "</a><br></li>";
  protected final String TEXT_6 = NL + "</ul>" + NL + "" + NL + "<a href=\"index.html\">Back</a>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
     ComicBookCollection comicBookCollection = (ComicBookCollection) argument; 
    stringBuffer.append(TEXT_2);
     for (Writer writer : comicBookCollection.getWriters()) { 
    stringBuffer.append(TEXT_3);
    stringBuffer.append(writer.getName());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(writer.getName());
    stringBuffer.append(TEXT_5);
     } 
    stringBuffer.append(TEXT_6);
    return stringBuffer.toString();
  }
}
