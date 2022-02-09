package lab6;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class form2 {

	protected Shell shell2;
	public static int num;
	public static int i = 0;
	public boolean backward = true;
	public boolean start = true;
	public int ans;
	/**

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			form2 window = new form2();
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
		shell2.open();
		shell2.layout();
		while (!shell2.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	public void getNum(int fm2num) {
		num = fm2num;
		i = num;
		
	}
	public int fac(int n) {
		if(n > 1) return n * fac(n - 1);
		else return 1;
	}
	
	protected void createContents() {
		shell2 = new Shell();
		shell2.setSize(300, 244);
		shell2.setText("Factorial");
		
		Label label_line1 = new Label(shell2, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_line1.setBounds(83, 140, 64, 2);
		
		Label label_line2 = new Label(shell2, SWT.SEPARATOR | SWT.VERTICAL);
		label_line2.setBounds(83, 31, 2, 111);
		
		Label label_line3 = new Label(shell2, SWT.SEPARATOR | SWT.VERTICAL);
		label_line3.setBounds(145, 31, 2, 111);
		
		Label lbStack1 = new Label(shell2, SWT.NONE);
		lbStack1.setAlignment(SWT.CENTER);
		lbStack1.setBounds(91, 119, 48, 15);
		
		Label lbStack2 = new Label(shell2, SWT.NONE);
		lbStack2.setAlignment(SWT.CENTER);
		lbStack2.setBounds(91, 98, 48, 15);
		
		Label lbStack3 = new Label(shell2, SWT.NONE);
		lbStack3.setAlignment(SWT.CENTER);
		lbStack3.setBounds(91, 77, 48, 15);
		
		Label lbStack4 = new Label(shell2, SWT.NONE);
		lbStack4.setAlignment(SWT.CENTER);
		lbStack4.setBounds(91, 56, 48, 15);
		
		Label lbStack5 = new Label(shell2, SWT.NONE);
		lbStack5.setAlignment(SWT.CENTER);
		lbStack5.setBounds(91, 31, 48, 15);
		
		Label lbPush = new Label(shell2, SWT.NONE);
		lbPush.setAlignment(SWT.RIGHT);
		lbPush.setBounds(10, 10, 70, 15);
		
		Label lbPop = new Label(shell2, SWT.NONE);
		lbPop.setBounds(145, 10, 70, 15);
		
		Label facAns = new Label(shell2, SWT.NONE);
		facAns.setBounds(155, 31, 121, 111);
		
		lbPush.setText(num + "! Push");
		
		Button btnRun = new Button(shell2, SWT.NONE);
		btnRun.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				lbPush.setText(num + "! Push");
				if(backward) {
					if(i > 1) {
						lbPush.setText((i-1) + "! Push");
					} else {
						lbPush.setText("");
					}
					lbPop.setText("");
				} else {
					lbPush.setText("");
					lbPop.setText("Pop " + (i-1) + "!");
					switch(i-1) {
					case 1:
						facAns.setText("Fac\t= 1\n\t= " + (ans = fac(i-1)));
						break;
					case 2:
						facAns.setText("Fac\t= 1x2\n\t= " + (ans = fac(i-1)));
						break;
					case 3:
						facAns.setText("Fac\t= 1x2x3\n\t= " + (ans = fac(i-1)));
						break;
					case 4:
						facAns.setText("Fac\t= 1x2x3x4\n\t= " + (ans = fac(i-1)));
						break;
					case 5:
						facAns.setText("Fac\t= 1x2x3x4x5\n\t= " + (ans = fac(i-1)));
						break;
					}
				}
				
				switch(num) {
				case 1:
					switch(i) {
					case 1:
						lbStack5.setText("1");
						lbStack4.setText("");
						lbStack3.setText("");
						lbStack2.setText("");
						lbStack1.setText("");
						break;
					case 2:
						lbStack5.setText("");
						lbStack4.setText("");
						lbStack3.setText("");
						lbStack2.setText("");
						lbStack1.setText("");
						break;
					case 3:
						shell2.close();
						break;
					}
					break;
				case 2:
					switch(i) {
					case 1:
						lbStack5.setText("1");
						lbStack4.setText("2");
						lbStack3.setText("");
						lbStack2.setText("");
						lbStack1.setText("");
						break;
					case 2:
						lbStack5.setText("2");
						lbStack4.setText("");
						lbStack3.setText("");
						lbStack2.setText("");
						lbStack1.setText("");
						break;
					case 3:
						lbStack5.setText("");
						lbStack4.setText("");
						lbStack3.setText("");
						lbStack2.setText("");
						lbStack1.setText("");
						break;
					case 4:
						shell2.close();
						break;
					}
					break;
				case 3:
					switch(i) {
					case 1:
						lbStack5.setText("1");
						lbStack4.setText("2");
						lbStack3.setText("3");
						lbStack2.setText("");
						lbStack1.setText("");
						break;
					case 2:
						lbStack5.setText("2");
						lbStack4.setText("3");
						lbStack3.setText("");
						lbStack2.setText("");
						lbStack1.setText("");
						break;
					case 3:
						lbStack5.setText("3");
						lbStack4.setText("");
						lbStack3.setText("");
						lbStack2.setText("");
						lbStack1.setText("");
						break;
					case 4:
						lbStack5.setText("");
						lbStack4.setText("");
						lbStack3.setText("");
						lbStack2.setText("");
						lbStack1.setText("");
						break;
					case 5:
						shell2.close();
						break;
					}
					break;
				case 4:
					switch(i) {
					case 1:
						lbStack5.setText("1");
						lbStack4.setText("2");
						lbStack3.setText("3");
						lbStack2.setText("4");
						lbStack1.setText("");
						break;
					case 2:
						lbStack5.setText("2");
						lbStack4.setText("3");
						lbStack3.setText("4");
						lbStack2.setText("");
						lbStack1.setText("");
						break;
					case 3:
						lbStack5.setText("3");
						lbStack4.setText("4");
						lbStack3.setText("");
						lbStack2.setText("");
						lbStack1.setText("");
						break;
					case 4:
						lbStack5.setText("4");
						lbStack4.setText("");
						lbStack3.setText("");
						lbStack2.setText("");
						lbStack1.setText("");
						break;
					case 5:
						lbStack5.setText("");
						lbStack4.setText("");
						lbStack3.setText("");
						lbStack2.setText("");
						lbStack1.setText("");
						break;
					case 6:
						shell2.close();
						break;
					}
					break;
				case 5:
					switch(i) {
					case 1:
						lbStack5.setText("1");
						lbStack4.setText("2");
						lbStack3.setText("3");
						lbStack2.setText("4");
						lbStack1.setText("5");
						break;
					case 2:
						lbStack5.setText("2");
						lbStack4.setText("3");
						lbStack3.setText("4");
						lbStack2.setText("5");
						lbStack1.setText("");
						break;
					case 3:
						lbStack5.setText("3");
						lbStack4.setText("4");
						lbStack3.setText("5");
						lbStack2.setText("");
						lbStack1.setText("");
						break;
					case 4:
						lbStack5.setText("4");
						lbStack4.setText("5");
						lbStack3.setText("");
						lbStack2.setText("");
						lbStack1.setText("");
						break;
					case 5:
						lbStack5.setText("5");
						lbStack4.setText("");
						lbStack3.setText("");
						lbStack2.setText("");
						lbStack1.setText("");
						break;
					case 6:
						lbStack5.setText("");
						lbStack4.setText("");
						lbStack3.setText("");
						lbStack2.setText("");
						lbStack1.setText("");
						break;
					case 7:
						shell2.close();
						break;
					}
					break;
				}
				if(i == 1) {
					backward = !backward;
				}
				if(backward) {
					i--;
				} else {
					i++;
				}
			}
		});
		btnRun.setBounds(10, 148, 266, 46);
		btnRun.setText("Run");
		
	}
	

}
