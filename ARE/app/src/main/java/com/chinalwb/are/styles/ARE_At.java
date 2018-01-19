package com.chinalwb.are.styles;

import android.graphics.Color;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;

import com.chinalwb.are.spans.AtSpan;

public class ARE_At extends ARE_ABS_FreeStyle {

	public ARE_At(ImageView atImageView) {
		setListenerForImageView(atImageView);
	}

	@Override
	public void setListenerForImageView(ImageView imageView) {
		imageView.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				EditText editText = getEditText();
				int selectionStart = editText.getSelectionStart();
				int selectionEnd = editText.getSelectionEnd();

				Editable editable = editText.getText();
				SpannableStringBuilder ssb = new SpannableStringBuilder();
				
				// The name of the people to @
				String at = "@Wenbin Liu";
				ssb.append(at);
				AtSpan atSpan = new AtSpan("12345_1", Color.YELLOW);
				ssb.setSpan(atSpan, 0, ssb.length(),
						Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
				// ssb.append(" "); // Append a blank after the at span.
				
				editable.replace(selectionStart, selectionEnd, ssb);
			}
		});
	}

	@Override
	public void applyStyle(Editable editable, int start, int end) {
		// TODO Auto-generated method stub

	}

	@Override
	public ImageView getImageView() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setChecked(boolean isChecked) {
		// TODO Auto-generated method stub

	}

}
