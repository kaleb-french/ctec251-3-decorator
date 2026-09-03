
public class Main {
    static void main() {
        TextComponent text = new PlainText("Hello, for the other side.");
        System.out.println(text.getText());

        TextComponent FancyText = new ItalicDecorator(text);
        FancyText = new BoldDecorator(FancyText);

        System.out.println(FancyText.getText());

        FancyText = new UppercaseDecorator(FancyText);

        System.out.println(FancyText.getText());

    }
}
