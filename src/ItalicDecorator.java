public class ItalicDecorator extends TextDecorator{
    //a
    //c
    ItalicDecorator(TextComponent component){
        super(component);
    }
    //m
    @Override
	public String getText() {
	    String newText = "<i>" + component.getText() +"</i>";
		return newText;
	}
}
