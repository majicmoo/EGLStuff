package comicbook;

import comicBooks.*;

public class Artists
{
  protected static String nl;
  public static synchronized Artists create(String lineSeparator)
  {
    nl = lineSeparator;
    Artists result = new Artists();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<h2>Artists</h2>" + NL + "<ul>";
  protected final String TEXT_2 = NL + "\t<li><a href=\"";
  protected final String TEXT_3 = ".html\">";
  protected final String TEXT_4 = "</a><br></li>";
  protected final String TEXT_5 = NL + "</ul>" + NL + "" + NL + "<a href=\"index.html\">Back</a>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     ComicBookCollection comicBookCollection = (ComicBookCollection) argument; 
    stringBuffer.append(TEXT_1);
     for (Artist artist : comicBookCollection.getArtists()) { 
    stringBuffer.append(TEXT_2);
    stringBuffer.append(artist.getName());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(artist.getName());
    stringBuffer.append(TEXT_4);
     } 
    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}
