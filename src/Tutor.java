import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Composite;


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
		shlTypingTutor.setSize(742, 534);
		shlTypingTutor.setText("Typing Tutor");
		
		Label lable1 = new Label(shlTypingTutor, SWT.NONE);
		lable1.setText("Type some text using your keyboard. The keys you press will be highlighted and the text will be displayed.");
		lable1.setBounds(10, 10, 698, 17);
		
		Label label2 = new Label(shlTypingTutor, SWT.NONE);
		label2.setBounds(10, 33, 698, 17);
		label2.setText("Note: Clickin the buttons with your mouse will not perform any action.");
		
		text = new Text(shlTypingTutor, SWT.BORDER | SWT.WRAP);
		text.setBounds(10, 56, 698, 193);
		
		Composite Keyboard = new Composite(shlTypingTutor, SWT.NONE);
		Keyboard.setBounds(10, 255, 592, 109);
		
		Button button = new Button(Keyboard, SWT.NONE);
		button.setSize(42, 39);
		button.setText("~");
		
		Button button_1 = new Button(Keyboard, SWT.NONE);
		button_1.setLocation(41, 0);
		button_1.setSize(42, 39);
		button_1.setText("1");
		
		Button button_2 = new Button(Keyboard, SWT.NONE);
		button_2.setLocation(81, 0);
		button_2.setSize(42, 39);
		button_2.setText("2");
		
		Button button_3 = new Button(Keyboard, SWT.NONE);
		button_3.setLocation(121, 0);
		button_3.setSize(42, 39);
		button_3.setText("3");
		
		Button button_4 = new Button(Keyboard, SWT.NONE);
		button_4.setLocation(161, 0);
		button_4.setSize(42, 39);
		button_4.setText("4");
		
		Button button_5 = new Button(Keyboard, SWT.NONE);
		button_5.setLocation(201, 0);
		button_5.setSize(42, 39);
		button_5.setText("5");
		
		Button button_6 = new Button(Keyboard, SWT.NONE);
		button_6.setLocation(241, 0);
		button_6.setSize(42, 39);
		button_6.setText("6");
		
		Button button_7 = new Button(Keyboard, SWT.NONE);
		button_7.setLocation(281, 0);
		button_7.setSize(42, 39);
		button_7.setText("7");
		
		Button button_8 = new Button(Keyboard, SWT.NONE);
		button_8.setLocation(321, 0);
		button_8.setSize(42, 39);
		button_8.setText("8");
		
		Button button_9 = new Button(Keyboard, SWT.NONE);
		button_9.setLocation(361, 0);
		button_9.setSize(42, 39);
		button_9.setText("9");
		
		Button button_10 = new Button(Keyboard, SWT.NONE);
		button_10.setLocation(401, 0);
		button_10.setSize(42, 39);
		button_10.setText("-");
		
		Button button_11 = new Button(Keyboard, SWT.NONE);
		button_11.setLocation(441, 0);
		button_11.setSize(42, 39);
		button_11.setText("+");
		
		Button button_12 = new Button(Keyboard, SWT.NONE);
		button_12.setLocation(481, 0);
		button_12.setSize(100, 39);
		button_12.setText("Backspace");
		
		Button button_13 = new Button(Keyboard, SWT.NONE);
		button_13.setLocation(0, 38);
		button_13.setSize(60, 39);
		button_13.setText("Tab");
		
		Button button_14 = new Button(Keyboard, SWT.NONE);
		button_14.setLocation(59, 38);
		button_14.setSize(42, 39);
		button_14.setText("Q");
		
		Button button_15 = new Button(Keyboard, SWT.NONE);
		button_15.setLocation(99, 38);
		button_15.setSize(42, 39);
		button_15.setText("W");
		
		Button button_16 = new Button(Keyboard, SWT.NONE);
		button_16.setLocation(139, 38);
		button_16.setSize(42, 39);
		button_16.setText("E");
		
	}
}
