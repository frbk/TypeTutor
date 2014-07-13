import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;


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
		shlTypingTutor.setSize(797, 423);
		shlTypingTutor.setText("Typing Tutor");
		
		Label lable1 = new Label(shlTypingTutor, SWT.NONE);
		lable1.setText("Type some text using your keyboard. The keys you press will be highlighted and the text will be displayed.");
		lable1.setBounds(10, 10, 698, 17);
		
		Label label2 = new Label(shlTypingTutor, SWT.NONE);
		label2.setBounds(10, 33, 698, 17);
		label2.setText("Note: Clickin the buttons with your mouse will not perform any action.");
		
		text = new Text(shlTypingTutor, SWT.BORDER | SWT.WRAP);
		text.setBounds(10, 56, 777, 193);
		
		

	}
}
