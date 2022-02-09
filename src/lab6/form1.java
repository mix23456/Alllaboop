package lab6;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class form1 {

	protected Shell shell1;
	private Text intext;
	public int numintext = 0;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			form1 window = new form1();
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
		shell1.open();
		shell1.layout();
		while (!shell1.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell1 = new Shell();
		shell1.setSize(300, 300);
		shell1.setText("Factorial");
		
		intext = new Text(shell1, SWT.BORDER | SWT.CENTER);
		intext.setBounds(10, 10, 264, 72);
		
		Button Enter = new Button(shell1, SWT.NONE);
		Enter.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				numintext = Integer.valueOf( intext.getText() );
				Enter.setVisible(false);
				form2 window2 = new form2();
				window2.getNum(numintext);
				window2.open();
				shell1.close();
				
			}
		});
		Enter.setBounds(10, 88, 264, 72);
		Enter.setText("Enter");

	}

}
