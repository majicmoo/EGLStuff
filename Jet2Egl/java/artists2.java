class artists2 {
public static void main (String[] args) {
//aab<%import comicBooks.*;%>
//aab<%
 Artist artist = (Artist) argument; 
//aab%>
//aab
//aab<h1><%
//aab=artist.getName()
//aab%></h1>
//aab
//aab<h2>Books Artist For</h2>
//aab<ul>
//aab<%
 for (Book book : artist.getBooksArtistFor()) { 
//aab%>
//aab	<li><a href="<%
//aab=book.getName()
//aab%>.html"><%
//aab=book.getName()
//aab%></a></li>
//aab<%
 } 
//aab%>
//aab</ul>
//aab
//aab<h2>Books Cover Artist For</h2>
//aab<ul>
//aab<%
 for (Book coverBook : artist.getBooksCoverArtistFor()) { 
//aab%>
//aab	<li><a href="<%
//aab=coverBook.getName()
//aab%>.html"><%
//aab=coverBook.getName()
//aab%></a></li>
//aab<%
 } 
//aab%>
//aab</ul>
//aab
//aab<%
 if (coverBook == true){ 
//aab%>
//aab<%
 int amy = (int) 7.0; 
//aab%>
//aab<%
 } 
//aab%>
//aab
//aab<a href="artists.html">Back</a>

}
}