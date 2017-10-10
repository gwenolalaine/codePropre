package ex6;

import java.util.ArrayList;
import java.util.List;

public class Conteneur {
	private List<Object> elements = new ArrayList<>();
	
	public void add(Object element){
		elements.add(element);
	}
	
	public Object getContent(int i){
		return elements.get(i);
	}
	
	public int getSize(){
		return elements.size();
	}
}
