package com.memorko.app.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.memorko.app.R;
import com.memorko.app.common.Music;
import com.memorko.app.utils.FontLoader;
import com.memorko.app.utils.FontLoader.Font;

public class PopupSettingsView extends LinearLayout {

	private ImageView mSoundImage;
	private TextView mSoundText;

	public PopupSettingsView(Context context) {
		this(context, null);
	}

	public PopupSettingsView(Context context, AttributeSet attrs) {
		super(context, attrs);
		setOrientation(LinearLayout.VERTICAL);
		setBackgroundResource(R.drawable.settings_popup);
		LayoutInflater.from(getContext()).inflate(R.layout.popup_settings_view, this, true);
		mSoundText = (TextView) findViewById(R.id.sound_off_text);
		TextView rateView = (TextView) findViewById(R.id.rate_text);
		FontLoader.setTypeface(context, new TextView[] { mSoundText, rateView }, Font.GROBOLD);
		mSoundImage = (ImageView) findViewById(R.id.sound_image);
		View soundOff = findViewById(R.id.sound_off);
		soundOff.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Music.OFF = !Music.OFF;
				setMusicButton();
			}
		});
		setMusicButton();
	}

	private void setMusicButton() {
		if (Music.OFF) {
			mSoundText.setText("Sound OFF");
			mSoundImage.setImageResource(R.drawable.button_music_off);
		} else {
			mSoundText.setText("Sound ON");
			mSoundImage.setImageResource(R.drawable.button_music_on);
		}
	}
}
