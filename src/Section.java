/**
 * IMPORTS
 */
import java.util.ArrayList;
import java.util.List;

/**
 * @author Andi
 *
 */
public class Section implements Element{
	// Private variables:
	
    String title;
    List<Element> elementList = new ArrayList<Element>();

    // Public functions:
    public Section(String title_arg) {
        this.title = title_arg;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title_arg) {
        this.title = title_arg;
    }

    @Override
    public void print() {
        System.out.println(title);
        for(Element el:elementList)
            el.print();
    }

    @Override
    public void add(Element element_arg) {
    	elementList.add(element_arg);
    }

    @Override
    public void remove(Element element_arg) {
    	elementList.remove(element_arg);
    }

    @Override
    public int get(Element element_arg) {
        return elementList.indexOf(element_arg);
    }
    
	public Section() {}

	@Override
	public void accept(Visitor visitor_arg) {
		visitor_arg.visitSection(this);
		
		for(Element el:elementList) {
			el.accept(visitor_arg);
		}
	}
}
