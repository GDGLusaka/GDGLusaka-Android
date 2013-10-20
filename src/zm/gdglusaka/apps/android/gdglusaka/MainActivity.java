package zm.gdglusaka.apps.android.gdglusaka;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.actionbarsherlock.app.SherlockActivity;

public class MainActivity extends SherlockActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		//this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void onEventsClicked(View v) {
		Intent i = new Intent(this, EventsActivity.class);
		startActivity(i);
	}

}
