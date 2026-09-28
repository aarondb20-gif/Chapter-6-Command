public class InsertCommand implements Command{
    TextEditor textEditor;

    public InsertCommand(TextEditor textEditor){
        this.textEditor = textEditor;
    }
    @Override
    public void execute() {
        textEditor.insertText();

    }
}
