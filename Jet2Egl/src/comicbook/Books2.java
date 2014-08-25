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
  protected final String TEXT_2 = "</h1>" + NL + "<h2>Publiction Date: ";
  protected final String TEXT_3 = "</h2>" + NL + "" + NL + "<h2>Artists</h2>" + NL + "<ul>";
  protected final String TEXT_4 = NL + "\t<li><a href=\"";
  protected final String TEXT_5 = ".html\">";
  protected final String TEXT_6 = "</a></li>";
  protected final String TEXT_7 = NL + "</ul>" + NL + "" + NL + "<h2>Cover Artist</h2>" + NL + "<ul>" + NL + "<li><a href=\"";
  protected final String TEXT_8 = ".html\">";
  protected final String TEXT_9 = "</a></li>" + NL + "</ul>" + NL + "" + NL + "<h2>Editors</h2>" + NL + "<ul>";
  protected final String TEXT_10 = NL + "\t<li><a href=\"";
  protected final String TEXT_11 = ".html\">";
  protected final String TEXT_12 = "</a></li>";
  protected final String TEXT_13 = NL + "</ul>" + NL + "" + NL + "<h2>Writers</h2>" + NL + "<ul>";
  protected final String TEXT_14 = NL + "\t<li><a href=\"";
  protected final String TEXT_15 = ".html\">";
  protected final String TEXT_16 = "</a></li>";
  protected final String TEXT_17 = NL + "</ul>" + NL + "" + NL + "<h2>Publisher</h2>" + NL + "<ul>" + NL + "<li><a href=\"";
  protected final String TEXT_18 = ".html\">";
  protected final String TEXT_19 = "</a></li>" + NL + "</ul>" + NL + "" + NL + "<h2>Series</h2>" + NL + "<ul>" + NL + "<li><a href=\"";
  protected final String TEXT_20 = ".html\">";
  protected final String TEXT_21 = "</a></li>" + NL + "</ul>" + NL + "" + NL + "<a href=\"index.html\">Back</a>";
  protected final String TEXT_22 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     Book book = (Book) argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append(book.getName());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(book.getPublicationDate());
    stringBuffer.append(TEXT_3);
     for (Artist artist : book.getArtists()) { 
    stringBuffer.append(TEXT_4);
    stringBuffer.append(artist.getName());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(artist.getName());
    stringBuffer.append(TEXT_6);
     } 
    stringBuffer.append(TEXT_7);
    stringBuffer.append(book.getCoverArtist().getName());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(book.getCoverArtist().getName());
    stringBuffer.append(TEXT_9);
     for (Editor editor : book.getEditors()) { 
    stringBuffer.append(TEXT_10);
    stringBuffer.append(editor.getName());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(editor.getName());
    stringBuffer.append(TEXT_12);
     } 
    stringBuffer.append(TEXT_13);
     for (Writer writer : book.getWriters()) { 
    stringBuffer.append(TEXT_14);
    stringBuffer.append(writer.getName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(writer.getName());
    stringBuffer.append(TEXT_16);
     } 
    stringBuffer.append(TEXT_17);
    stringBuffer.append(book.getPublisher().getPublishersName());
    stringBuffer.append(TEXT_18);
    stringBuffer.append(book.getPublisher().getPublishersName());
    stringBuffer.append(TEXT_19);
    stringBuffer.append(book.getSeriesPartOf().getSeriesName());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(book.getSeriesPartOf().getSeriesName());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(TEXT_22);
    return stringBuffer.toString();
  }
}
