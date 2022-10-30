import org.junit.Test;
public class QueryStringMain {
	
	@Test
	public void testGetParameter() {
		QueryString q = new QueryString("name=Alice&age=19&country=UK"); 
		q.getParameter("name=Alice");
		
		


	}
	
	
}
