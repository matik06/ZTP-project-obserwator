import java.util.ArrayList;
import java.util.List;


public class Blog implements Observable {
	
	private List<Observer> users = new ArrayList<Observer>();
	
	private String title = null;
	private List<Post> posts = new ArrayList<Post>();
	
	
	public Blog(String title) {
		this.title = title ;
	}
	
	
	public String getName() {
		return title;
	}

	public void setName(String name) {
		this.title = name;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void addPost(Post p) {
		posts.add(p);
	}
	
	public void addPost(String title, String content) {
		Post p = new Post(title, content);
		addPost(p);
	}

	@Override
	public void add(Observer o) {
		
		users.add(o);
	}

	@Override
	public void remove(Observer o) {
		
		users.remove(o);
	}

	@Override
	public void notifyObservers(Post p) {
		
		for(Observer o: users) {
			
			o.update(p, this.title);
		}
	}

}
