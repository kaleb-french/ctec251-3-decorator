public class UppercaseDecorator extends TextDecorator{
    //a
    //c
    UppercaseDecorator(TextComponent component){
        super(component);
    }
    //m
    @Override
	public String getText() {
	    String newText = component.getText().toUpperCase();
		return newText;
	}
}
