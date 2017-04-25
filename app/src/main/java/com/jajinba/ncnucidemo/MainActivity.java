package com.jajinba.ncnucidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  private TextView mTextView;
  private EditText mEditText;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mTextView = (TextView) findViewById(R.id.text_view);
    mEditText = (EditText) findViewById(R.id.edit_text);
    Button mButton = (Button) findViewById(R.id.button);

    mButton.setOnClickListener(mOnClickListener);
  }

  private View.OnClickListener mOnClickListener = new OnClickListener() {
    @Override
    public void onClick(View v) {
      String inputStr = String.valueOf(mEditText.getText());

      if (inputStr != null && inputStr.length() > 0) {
        mTextView.setText(inputStr);
      }
    }
  };
}
