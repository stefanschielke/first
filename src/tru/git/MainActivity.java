package tru.git;

import java.io.FileDescriptor;
import java.io.PrintWriter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public void closeContextMenu() {
		// TODO Auto-generated method stub
		super.closeContextMenu();
	}

	@Override
	public void closeOptionsMenu() {
		// TODO Auto-generated method stub
		super.closeOptionsMenu();
	}

	@Override
	public void dump(String prefix, FileDescriptor fd, PrintWriter writer,
			String[] args) {
		// TODO Auto-generated method stub
		super.dump(prefix, fd, writer, args);
	}

	@Override
	public boolean dispatchTouchEvent(MotionEvent ev) {
		// TODO Auto-generated method stub
		return super.dispatchTouchEvent(ev);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
