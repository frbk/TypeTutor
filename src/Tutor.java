import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;


public class Tutor {

	protected Shell shlTypingTutor;
	private Text text;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Tutor window = new Tutor();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlTypingTutor.open();
		shlTypingTutor.layout();
		while (!shlTypingTutor.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlTypingTutor = new Shell();
		shlTypingTutor.setSize(722, 415);
		shlTypingTutor.setText("Typing Tutor");
		
		Label lable1 = new Label(shlTypingTutor, SWT.NONE);
		lable1.setText("Type some text using your keyboard. The keys you press will be highlighted and the text will be displayed.");
		lable1.setBounds(10, 10, 698, 17);
		
		Label label2 = new Label(shlTypingTutor, SWT.NONE);
		label2.setBounds(10, 33, 698, 17);
		label2.setText("Note: Clickin the buttons with your mouse will not perform any action.");
		
		text = new Text(shlTypingTutor, SWT.BORDER | SWT.WRAP);
		text.setBounds(10, 56, 698, 193);
		
		Button button = new Button(shlTypingTutor, SWT.NONE);
		button.setBounds(10, 255, 42, 39);
		button.setText("~");
		
		Button button_1 = new Button(shlTypingTutor, SWT.NONE);
		button_1.setText("1");
		button_1.setBounds(51, 255, 42, 39);
		
		Button button_2 = new Button(shlTypingTutor, SWT.NONE);
		button_2.setBounds(92, 255, 42, 39);
		button_2.setText("2");
		
		Button button_3 = new Button(shlTypingTutor, SWT.NONE);
		button_3.setBounds(133, 255, 42, 39);
		button_3.setText("3");
		
		Button button_4 = new Button(shlTypingTutor, SWT.NONE);
		button_4.setBounds(174, 255, 42, 39);
		button_4.setText("4");
		
		Button button_5 = new Button(shlTypingTutor, SWT.NONE);
		button_5.setBounds(215, 255, 42, 39);
		button_5.setText("5");
		
		Button button_6 = new Button(shlTypingTutor, SWT.NONE);
		button_6.setBounds(256, 255, 42, 39);
		button_6.setText("6");
		
		Button button_7 = new Button(shlTypingTutor, SWT.NONE);
		button_7.setBounds(297, 255, 42, 39);
		button_7.setText("7");
		
		Button button_8 = new Button(shlTypingTutor, SWT.NONE);
		button_8.setBounds(338, 255, 42, 39);
		button_8.setText("8");
		
		Button button_9 = new Button(shlTypingTutor, SWT.NONE);
		button_9.setBounds(379, 255, 42, 39);
		button_9.setText("9");
		
		Button button_10 = new Button(shlTypingTutor, SWT.NONE);
		button_10.setBounds(420, 255, 42, 39);
		button_10.setText("-");
		
		Button button_12 = new Button(shlTypingTutor, SWT.NONE);
		button_12.setBounds(461, 255, 42, 39);
		button_12.setText("+");
		
		Button button_13 = new Button(shlTypingTutor, SWT.NONE);
		button_13.setBounds(502, 255, 100, 39);
		button_13.setText("Backspace");
	}
}
