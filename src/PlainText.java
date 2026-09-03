public class PlainText implements TextComponent{
    //a
    protected String text;
    //c
    PlainText(String text){
        this.text = text;
    }
	@Override
	public String getText() {
		return text;
	}
}
