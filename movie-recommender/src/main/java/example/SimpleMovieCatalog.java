package example;
public class SimpleMovieCatalog implements MovieCatalog{
	private String catalogType;
	
	public SimpleMovieCatalog(String catalogType) {
		this.catalogType = catalogType;
	}
	
	@Override
	public void listMovies() {
		System.out.println("Listing movies from the" + catalogType + "catalog.");
	}
}