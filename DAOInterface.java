package springii;

import java.util.List;

public interface DAOInterface {

	public ModelClass first();
	public ModelClass last();
	public List<ModelClass> start();
	public void edit(ModelClass m);
	public void add(ModelClass m);
	public void del(ModelClass m);
	
}
