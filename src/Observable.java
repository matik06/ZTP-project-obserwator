public interface Observable {
	
	public abstract void add(Observer o);
	public abstract void remove(Observer o);
	public abstract void notifyObservers(Post p);
}
