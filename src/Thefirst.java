import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Label;

public class Thefirst {

	protected Shell shlCalula;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Thefirst window = new Thefirst();
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
		shlCalula.open();
		shlCalula.layout();
		while (!shlCalula.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlCalula = new Shell();
		shlCalula.setSize(330, 410);
		shlCalula.setText("Calculator");
		
		Label display = new Label(shlCalula, SWT.BORDER | SWT.SHADOW_IN | SWT.CENTER);
		display.setText("0");
		display.setFont(SWTResourceManager.getFont("Segoe UI", 28, SWT.NORMAL));
		display.setAlignment(SWT.RIGHT);
		display.setBounds(10, 31, 294, 57);
		formToolkit.adapt(display, true, true);
		
		Label displaysub = new Label(shlCalula, SWT.BORDER);
		displaysub.setBackground(SWTResourceManager.getColor(255, 255, 255));
		displaysub.setAlignment(SWT.CENTER);
		displaysub.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_FOREGROUND));
		displaysub.setBounds(10, 10, 261, 15);
		formToolkit.adapt(displaysub, true, true);
		
		Label displaysub_1 = new Label(shlCalula, SWT.BORDER);
		displaysub_1.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_FOREGROUND));
		displaysub_1.setBackground(SWTResourceManager.getColor(255, 255, 255));
		displaysub_1.setAlignment(SWT.CENTER);
		displaysub_1.setBounds(277, 10, 27, 15);
		formToolkit.adapt(displaysub_1, true, true);
		
		Button one = new Button(shlCalula, SWT.NONE);
		one.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if( display.getText().length() >= 12 ) {
				}else if( display.getText() == "0" ) { display.setText(""); display.setText(display.getText() + 1); }
				else display.setText(display.getText() + 1);
			}
		});
		one.setText("1");
		one.setBounds(10, 259, 69, 49);
		
		Button two = new Button(shlCalula, SWT.NONE);
		two.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if( display.getText().length() >= 12 ) {
				}else
				if( display.getText() == "0" ) { display.setText(""); display.setText(display.getText() + 2); }
				else display.setText(display.getText() + 2);
			}
		});
		two.setText("2");
		two.setBounds(85, 259, 69, 49);
		
		Button three = new Button(shlCalula, SWT.NONE);
		three.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if( display.getText().length() >= 12 ) {
				}else
				if( display.getText() == "0" ) { display.setText(""); display.setText(display.getText() + 3); }
				else display.setText(display.getText() + 3);
			}
		});
		three.setText("3");
		three.setBounds(160, 259, 69, 49);
		
		Button four = new Button(shlCalula, SWT.NONE);
		four.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if( display.getText().length() >= 12 ) {
				}else
				if( display.getText() == "0" ) { display.setText(""); display.setText(display.getText() + 4); }
				else display.setText(display.getText() + 4);
			}
		});
		four.setText("4");
		four.setBounds(10, 204, 69, 49);
		
		Button five = new Button(shlCalula, SWT.NONE);
		five.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if( display.getText().length() >= 12 ) {
				}else
				if( display.getText() == "0" ) { display.setText(""); display.setText(display.getText() + 5); }
				else display.setText(display.getText() + 5);
			}
		});
		five.setText("5");
		five.setBounds(85, 204, 69, 49);
		
		Button six = new Button(shlCalula, SWT.NONE);
		six.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if( display.getText().length() >= 12 ) {
				}else
				if( display.getText() == "0" ) { display.setText(""); display.setText(display.getText() + 6); }
				else display.setText(display.getText() + 6);
			}
		});
		six.setText("6");
		six.setBounds(160, 204, 69, 49);
		
		Button seven = new Button(shlCalula, SWT.NONE);
		seven.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if( display.getText().length() >= 12 ) {
				}else
				if( display.getText() == "0" ) { display.setText("");display.setText(display.getText() + 7); }
				else display.setText(display.getText() + 7);
			}
		});
		seven.setBounds(10, 149, 69, 49);
		seven.setText("7");
		
		Button eight = new Button(shlCalula, SWT.NONE);
		eight.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if( display.getText().length() >= 12 ) {
				}else
				if( display.getText() == "0" ) { display.setText(""); display.setText(display.getText() + 8); }
				else display.setText(display.getText() + 8);
			}
		});
		eight.setBounds(85, 149, 69, 49);
		eight.setText("8");
		
		Button nine = new Button(shlCalula, SWT.NONE);
		nine.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if( display.getText().length() >= 12 ) {
				}else
				if( display.getText() == "0" ) { display.setText(""); display.setText(display.getText() + 9); }
				else display.setText(display.getText() + 9);
			}
		});
		nine.setText("9");
		nine.setBounds(160, 149, 69, 49);
		
		Button zero = new Button(shlCalula, SWT.NONE);
		zero.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if( display.getText().length() >= 12 ) {
				}else if( display.getText() == "0" ) { 
					display.setText("0");
				}else
				display.setText(display.getText() + 0);
			}
		});
		zero.setText("0");
		zero.setBounds(85, 314, 69, 49);
		
		Button multiply = new Button(shlCalula, SWT.NONE);
		multiply.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				displaysub_1.setText("X");
				if( display.getText() == "0" ) {
				}else if( display.getText().length() != 0 && displaysub.getText() != "" ) {
					String str1 = display.getText();
					String str2 = displaysub.getText();
					long num1 = Long.parseLong( str2 );
					long num2 = Long.parseLong( str1 );
					num1 = num1 * num2;
					String str = String.valueOf( num1 );
					displaysub.setText( str );
					if( displaysub.getText().length() >= 12 ) { displaysub.setText("0"); }
				}else
				displaysub.setText( display.getText() );
				display.setText("0");
			}
		});
		multiply.setText("X");
		multiply.setBounds(235, 149, 69, 49);
		
		Button minus = new Button(shlCalula, SWT.NONE);
		minus.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				displaysub_1.setText("-");
				if( display.getText() == "0" ) {
				}else if( display.getText().length() != 0 && displaysub.getText() != "" ) {
					String str1 = display.getText();
					String str2 = displaysub.getText();
					long num1 = Long.parseLong( str2 );
					long num2 = Long.parseLong( str1 );
					num1 = num1 - num2;
					String str = String.valueOf( num1 );
					displaysub.setText( str );
					if( displaysub.getText().length() >= 12 ) { displaysub.setText("0"); }
				}else
				displaysub.setText( display.getText() );
				display.setText("0");
			}
		});
		minus.setText("-");
		minus.setBounds(235, 204, 69, 49);
		
		Button plus = new Button(shlCalula, SWT.NONE);
		plus.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				displaysub_1.setText("+");
				if( display.getText() == "0" ) {
				}else if( display.getText().length() != 0 && displaysub.getText() != "" ) {
					String str1 = display.getText();
					String str2 = displaysub.getText();
					long num1 = Long.parseLong( str2 );
					long num2 = Long.parseLong( str1 );
					num1 = num1 + num2;
					String str = String.valueOf( num1 );
					displaysub.setText( str );
					if( displaysub.getText().length() >= 12 ) { displaysub.setText("0"); }
				}else
				displaysub.setText( display.getText() );
				display.setText("0");
			}
		});
		plus.setText("+");
		plus.setBounds(235, 259, 69, 49);
		
		Button divide = new Button(shlCalula, SWT.NONE);
		divide.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				displaysub_1.setText("/");
				if( display.getText() == "0" ) {
				}else if( display.getText().length() != 0 && displaysub.getText() != "" ) {
					String str1 = display.getText();
					String str2 = displaysub.getText();
					long num1 = Long.parseLong( str2 );
					long num2 = Long.parseLong( str1 );
					num1 = num1 / num2;
					String str = String.valueOf( num1 );
					displaysub.setText( str );
					if( displaysub.getText().length() >= 12 ) { displaysub.setText("0"); }
				}else
				displaysub.setText( display.getText() );
				display.setText("0");
			}
		});
		divide.setText("/");
		divide.setBounds(160, 314, 69, 49);
		
		Button equal = new Button(shlCalula, SWT.NONE);
		equal.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if( displaysub_1.getText() == "" ) {
				}else if( display.getText().length() != 0 && displaysub.getText() != "" && displaysub.getText() != "0" && display.getText() != "0" ) {
					String str1 = display.getText();
					String str2 = displaysub.getText();
					long num1 = Long.parseLong( str2 );
					long num2 = Long.parseLong( str1 );
					
					switch( displaysub_1.getText() ) {
					case "X": num1 = num1 * num2; break;
					case "-": num1 = num1 - num2; break;
					case "+": num1 = num1 + num2; break;
					case "/": num1 = num1 / num2; break;
					default:
					}//end switch
					
					String str = String.valueOf( num1 );
					displaysub.setText( str );
					if( displaysub.getText().length() >= 12 ) { displaysub.setText("0"); }
				}else
				displaysub.setText( display.getText() );
				display.setText("0");
			}
		});
		equal.setText("=");
		equal.setBounds(235, 314, 69, 49);
		
		Button C = new Button(shlCalula, SWT.NONE);
		C.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				display.setText("0");
				displaysub.setText("");
				displaysub_1.setText("");
			}
		});
		C.setForeground(SWTResourceManager.getColor(0, 0, 0));
		C.setText("C");
		C.setBounds(10, 94, 69, 49);
		formToolkit.adapt(C, true, true);
		
		Button CE = new Button(shlCalula, SWT.NONE);
		CE.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				display.setText("0");
			}
		});
		CE.setText("CE");
		CE.setForeground(SWTResourceManager.getColor(0, 0, 0));
		CE.setBounds(85, 94, 69, 49);
		formToolkit.adapt(CE, true, true);
		
		Button Del = new Button(shlCalula, SWT.NONE);
		Del.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if( display.getText().length() == 1 ) {
					display.setText("0");
				}else if( display.getText() != "" ){
					String temp = display.getText();
					display.setText(temp.substring(0, temp.length() - 1));
				}
				
				
			}
		});
		Del.setText("Del");
		Del.setForeground(SWTResourceManager.getColor(0, 0, 0));
		Del.setBounds(160, 94, 144, 49);
		formToolkit.adapt(Del, true, true);
		
		Button signed = new Button(shlCalula, SWT.NONE);
		signed.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if( display.getText().length() != 0 ) {
					String str1 = display.getText();
					long num2 = Long.parseLong( str1 );
					if( num2 > 0 || num2 < 0 ) {
						num2 = num2 * -1;
					}else { 
						
					}
					String str = String.valueOf( num2 );
					display.setText( str );
				}
			}
		});
		signed.setBounds(10, 314, 69, 49);
		signed.setForeground(SWTResourceManager.getColor(0, 0, 0));
		formToolkit.adapt(signed, true, true);
		signed.setText("+/-");

	}
}
