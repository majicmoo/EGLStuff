package comicbook;

import comicBooks.*;

public class Series2a
{
  protected static String nl;
  public static synchronized Series2a create(String lineSeparator)
  {
    nl = lineSeparator;
    Series2a result = new Series2a();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "<h1>";
  protected final String TEXT_2 = "</h1>" + NL + "" + NL + "<h2>Books Series For</h2>" + NL + "<ul>";
  protected final String TEXT_3 = NL + "\t<li><a href=\"";
  protected final String TEXT_4 = ".html\">";
  protected final String TEXT_5 = "</a></li>";
  protected final String TEXT_6 = NL + "</ul>" + NL + "" + NL + "<a href=\"series.html\">Back</a>";
  protected final String TEXT_7 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     Series series = (Series) argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append(series.getSeriesName());
    stringBuffer.append(TEXT_2);
     for (Book book : series.getBooksInSeries()) { 
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
