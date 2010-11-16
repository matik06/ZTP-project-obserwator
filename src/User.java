import java.util.LinkedHashMap;
import java.util.Map;


public class User implements Observer {
	
	Map<String, Post> newPosts = new LinkedHashMap<String, Post>();
	Observable o = null;
	
	
	User(Observable o) {
		this.o = o;
	}

	
	@Override
	public void update(Post p, String blogName) {
		
		newPosts.put(blogName, p);
	}
	
	public Map<String, Post> getNewPosts() {
		
		return newPosts;
	}
	
}
