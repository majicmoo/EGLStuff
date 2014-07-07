package comicbook;

public class Index
{
  protected static String nl;
  public static synchronized Index create(String lineSeparator)
  {
    nl = lineSeparator;
    Index result = new Index();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "<h1>Look Up By...</h1>" + NL + "" + NL + "<li><a href=\"artists.html\">Artist</a></li>" + NL + "" + NL + "<li><a href=\"bookNames.html\">Book Name</a></li>" + NL + "" + NL + "<li><a href=\"editors.html\">Editor</a></li>" + NL + "" + NL + "<li><a href=\"publishers.html\">Publisher</a></li>" + NL + "" + NL + "<li><a href=\"series.html\">Series</a></li>" + NL + "" + NL + "<li><a href=\"writers.html\">Writer</a>" + NL + "" + NL + "</li>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    return stringBuffer.toString();
  }
}
