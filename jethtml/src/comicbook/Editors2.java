package comicbook;

import comicBooks.*;

public class Editors2
{
  protected static String nl;
  public static synchronized Editors2 create(String lineSeparator)
  {
    nl = lineSeparator;
    Editors2 result = new Editors2();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "<h1>";
  protected final String TEXT_2 = "</h1>" + NL + "" + NL + "<h2>Books Editor For</h2>" + NL + "<ul>";
  protected final String TEXT_3 = NL + "\t<li><a href=\"";
  protected final String TEXT_4 = ".html\">";
  protected final String TEXT_5 = "</a></li>";
  protected final String TEXT_6 = NL + "</ul>" + NL + "" + NL + "<a href=\"editors.html\">Back</a>";
  protected final String TEXT_7 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     Editor editor = (Editor) argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append(editor.getName());
    stringBuffer.append(TEXT_2);
     for (Book book : editor.getBooksEditorFor()) { 
    stringBuffer.append(TEXT_3);
    stringBuffer.append(book.getName());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(book.getName());
    stringBuffer.append(TEXT_5);
     } 
    stringBuffer.append(TEXT_6);
    stringBuffer.append(TEXT_7);
    return stringBuffer.toString();
  }
}
