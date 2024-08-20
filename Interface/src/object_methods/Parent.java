package object_methods;

public interface Parent {
	
    public boolean equals(Object obj);

	@Override
	public abstract String toString();
	
	
	@Override
	public abstract int hashCode();
	
//	@Override
//	public abstract Class<T> getClass();	//Cannot override the final method from Object
//	
//	@Override
//	public abstract void wait();
//	
//	@Override
//	public abstract void wait(long l);
}
