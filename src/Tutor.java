import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.graphics.Color;

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
		final Map<Integer, Button> map = new HashMap<>();
		shlTypingTutor = new Shell();
		shlTypingTutor.setSize(664, 562);
		shlTypingTutor.setText("Typing Tutor");
		
		final Label label1 = new Label(shlTypingTutor, SWT.NONE);
		label1.setFont(SWTResourceManager.getFont("Ubuntu", 10, SWT.NORMAL));
		label1.setText("Type some text using your keyboard. The keys you press will be highlighted and the text will be displayed.");
		label1.setBounds(10, 10, 698, 17);
		
		Label label2 = new Label(shlTypingTutor, SWT.NONE);
		label2.setFont(SWTResourceManager.getFont("Ubuntu", 10, SWT.NORMAL));
		label2.setBounds(10, 33, 698, 17);
		label2.setText("Note: Clickin the buttons with your mouse will not perform any action.");
		
		text = new Text(shlTypingTutor, SWT.BORDER | SWT.WRAP);
		text.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keycode;
				keycode = e.keyCode;
				Button btn = map.get(keycode);
				label1.setText("Key pressed "+ keycode);
				 if (btn != null) {
		             map.get(keycode).setBackground(new Color(null, 255,255,13));
		        }
			}
			@Override
			public void keyReleased(KeyEvent e) {
				int keycode;
				keycode = e.keyCode;
				Button btn = map.get(keycode);
				label1.setText("Key pressed "+ keycode);
				 if (btn != null) {
					 map.get(keycode).setBackground(new Color(null,255,255,255));
		        }
			}
		});
		text.setBounds(10, 56, 644, 193);
		
		Composite Keyboard = new Composite(shlTypingTutor, SWT.NONE);
		Keyboard.setBounds(10, 255, 592, 204);
		
		Button button = new Button(Keyboard, SWT.NONE);
		button.setSize(42, 39);
		button.setText("~");
		map.put(96, button);
		
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
		
		Button button_17 = new Button(Keyboard, SWT.NONE);
		button_17.setText("R");
		button_17.setBounds(179, 38, 42, 39);
		
		Button button_18 = new Button(Keyboard, SWT.NONE);
		button_18.setText("T");
		button_18.setBounds(218, 38, 42, 39);
		
		Button button_19 = new Button(Keyboard, SWT.NONE);
		button_19.setText("Y");
		button_19.setBounds(258, 38, 42, 39);
		
		Button button_20 = new Button(Keyboard, SWT.NONE);
		button_20.setText("U");
		button_20.setBounds(297, 38, 42, 39);
		
		Button button_21 = new Button(Keyboard, SWT.NONE);
		button_21.setText("I");
		button_21.setBounds(337, 38, 42, 39);
		
		Button button_22 = new Button(Keyboard, SWT.NONE);
		button_22.setText("O");
		button_22.setBounds(377, 38, 42, 39);
		
		Button button_23 = new Button(Keyboard, SWT.NONE);
		button_23.setText("P");
		button_23.setBounds(417, 38, 42, 39);
		
		Button button_24 = new Button(Keyboard, SWT.NONE);
		button_24.setText("[");
		button_24.setBounds(457, 38, 42, 39);
		
		Button button_25 = new Button(Keyboard, SWT.NONE);
		button_25.setText("]");
		button_25.setBounds(497, 38, 42, 39);
		
		Button button_26 = new Button(Keyboard, SWT.NONE);
		button_26.setText("\\");
		button_26.setBounds(537, 38, 42, 39);
		
		Button button_27 = new Button(Keyboard, SWT.NONE);
		button_27.setText("Caps");
		button_27.setBounds(0, 76, 60, 39);
		
		Button button_28 = new Button(Keyboard, SWT.NONE);
		button_28.setText("A");
		button_28.setBounds(59, 76, 42, 39);
		
		Button button_29 = new Button(Keyboard, SWT.NONE);
		button_29.setText("S");
		button_29.setBounds(99, 76, 42, 39);
		
		Button button_30 = new Button(Keyboard, SWT.NONE);
		button_30.setText("D");
		button_30.setBounds(139, 76, 42, 39);
		
		Button button_31 = new Button(Keyboard, SWT.NONE);
		button_31.setText("F");
		button_31.setBounds(179, 76, 42, 39);
		
		Button button_32 = new Button(Keyboard, SWT.NONE);
		button_32.setText("G");
		button_32.setBounds(218, 76, 42, 39);
		
		Button button_33 = new Button(Keyboard, SWT.NONE);
		button_33.setText("H");
		button_33.setBounds(258, 76, 42, 39);
		
		Button button_34 = new Button(Keyboard, SWT.NONE);
		button_34.setText("J");
		button_34.setBounds(297, 76, 42, 39);
		
		Button button_35 = new Button(Keyboard, SWT.NONE);
		button_35.setText("K");
		button_35.setBounds(337, 76, 42, 39);
		
		Button button_36 = new Button(Keyboard, SWT.NONE);
		button_36.setText("L");
		button_36.setBounds(377, 76, 42, 39);
		
		Button button_37 = new Button(Keyboard, SWT.NONE);
		button_37.setText(":");
		button_37.setBounds(417, 76, 42, 39);
		
		Button button_38 = new Button(Keyboard, SWT.NONE);
		button_38.setText("\"");
		button_38.setBounds(457, 76, 42, 39);
		
		Button button_39 = new Button(Keyboard, SWT.NONE);
		button_39.setText("Enter");
		button_39.setBounds(497, 76, 84, 39);
		
		Button button_40 = new Button(Keyboard, SWT.NONE);
		button_40.setText("Shift");
		button_40.setBounds(0, 114, 84, 39);
		
		Button button_41 = new Button(Keyboard, SWT.NONE);
		button_41.setText("^");
		button_41.setBounds(497, 114, 42, 39);
		
		Button button_42 = new Button(Keyboard, SWT.NONE);
		button_42.setText("Z");
		button_42.setBounds(81, 114, 42, 39);
		
		Button button_43 = new Button(Keyboard, SWT.NONE);
		button_43.setText("X");
		button_43.setBounds(121, 114, 42, 39);
		
		Button button_44 = new Button(Keyboard, SWT.NONE);
		button_44.setText("C");
		button_44.setBounds(161, 114, 42, 39);
		
		Button button_45 = new Button(Keyboard, SWT.NONE);
		button_45.setText("V");
		button_45.setBounds(201, 114, 42, 39);
		
		Button button_46 = new Button(Keyboard, SWT.NONE);
		button_46.setText("B");
		button_46.setBounds(241, 114, 42, 39);
		
		Button button_47 = new Button(Keyboard, SWT.NONE);
		button_47.setText("N");
		button_47.setBounds(281, 114, 42, 39);
		
		Button button_48 = new Button(Keyboard, SWT.NONE);
		button_48.setText("M");
		button_48.setBounds(321, 114, 42, 39);
		
		Button button_49 = new Button(Keyboard, SWT.NONE);
		button_49.setText(",");
		button_49.setBounds(361, 114, 42, 39);
		
		Button button_50 = new Button(Keyboard, SWT.NONE);
		button_50.setText(".");
		button_50.setBounds(401, 114, 42, 39);
		
		Button button_51 = new Button(Keyboard, SWT.NONE);
		button_51.setText("?");
		button_51.setBounds(441, 114, 42, 39);
		
		Button button_52 = new Button(Keyboard, SWT.NONE);
		button_52.setText("v");
		button_52.setBounds(497, 152, 42, 39);
		
		Button button_53 = new Button(Keyboard, SWT.NONE);
		button_53.setText(">");
		button_53.setBounds(537, 152, 42, 39);
		
		Button button_54 = new Button(Keyboard, SWT.NONE);
		button_54.setText("<");
		button_54.setBounds(457, 152, 42, 39);
		map.put(16777219, button_54);
		
		Button button_55 = new Button(Keyboard, SWT.NONE);
		button_55.setBounds(153, 152, 256, 39);
		
	}
}
