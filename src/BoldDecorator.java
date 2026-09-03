public class BoldDecorator extends TextDecorator{
    //a
    //c
    BoldDecorator(TextComponent component){
        super(component);
    }
    //m
   	@Override
	public String getText() {
	    String newText = "<b>" + component.getText() + "</b>";
		return newText;
	}
}
