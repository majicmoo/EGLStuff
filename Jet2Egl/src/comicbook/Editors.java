package comicbook;

import comicBooks.*;

public class Editors
{
  protected static String nl;
  public static synchronized Editors create(String lineSeparator)
  {
    nl = lineSeparator;
    Editors result = new Editors();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "<h2>Editors</h2>" + NL + "<ul>";
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
     for (Editor editor : comicBookCollection.getEditors()) { 
    stringBuffer.append(TEXT_3);
    stringBuffer.append(editor.getName());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(editor.getName());
    stringBuffer.append(TEXT_5);
     } 
    stringBuffer.append(TEXT_6);
    return stringBuffer.toString();
  }
}
