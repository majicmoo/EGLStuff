package comicbook;

import comicBooks.*;
import comicBooks.impl.*;
import model.*;

public class Artists2
{
  protected static String nl;
  public static synchronized Artists2 create(String lineSeparator)
  {
    nl = lineSeparator;
    Artists2 result = new Artists2();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "<h1>";
  protected final String TEXT_2 = "</h1>" + NL + "" + NL + "<h2>Books Artist For</h2>" + NL + "<ul>";
  protected final String TEXT_3 = NL + "\t<li><a href=\"";
  protected final String TEXT_4 = ".html\">";
  protected final String TEXT_5 = "</a></li>";
  protected final String TEXT_6 = NL + "</ul>" + NL + "" + NL + "<h2>Books Cover Artist For</h2>" + NL + "<ul>";
  protected final String TEXT_7 = NL + "\t<li><a href=\"";
  protected final String TEXT_8 = ".html\">";
  protected final String TEXT_9 = "</a></li>";
  protected final String TEXT_10 = NL + "</ul>" + NL + "" + NL + "<a href=\"artists.html\">Back</a>";
  protected final String TEXT_11 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(artist.name);
    stringBuffer.append(TEXT_2);
     for (Book book : artist.booksArtistFor) { 
    stringBuffer.append(TEXT_3);
    stringBuffer.append(book.getName());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(book.getName());
    stringBuffer.append(TEXT_5);
     } 
    stringBuffer.append(TEXT_6);
     for (Book coverBook : artist.booksCoverArtistFor) { 
    stringBuffer.append(TEXT_7);
    stringBuffer.append(coverBook.getName());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(coverBook.getName());
    stringBuffer.append(TEXT_9);
     } 
    stringBuffer.append(TEXT_10);
    stringBuffer.append(TEXT_11);
    return stringBuffer.toString();
  }
}
