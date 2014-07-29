import comicBooks.*;

class Artists2 {
     public static void main(String[] args) {
        Artist artist = (Artist) argument;

        artist.getName();

        for (Book book : artist.getBooksArtistFor()) { 
	        book.getName();
	        book.getName();
        }

        for (Book coverBook : artist.getBooksCoverArtistFor()) {
	        coverBook.getName();
	        coverBook.getName();
        } 
     }
  }
