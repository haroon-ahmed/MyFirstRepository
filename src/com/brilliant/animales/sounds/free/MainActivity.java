package com.brilliant.animales.sounds.free;

import java.io.IOException;
import java.io.InputStream;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.AssetFileDescriptor;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.brilliant.animales.sounds.free.constants.Constants;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.squareup.picasso.Picasso;

public class MainActivity extends Activity implements OnCompletionListener {
	ImageView play;
	Dialog dialog;
	private AdView adView;
	// ListView lv;
	int adcounter = 0;
	private InterstitialAd interstitial;
	MediaPlayer mp;
	private LinearLayout layoutRowContainer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		AdRequest adRequest = new AdRequest.Builder().build();

		adView = (AdView) findViewById(R.id.adView);
		adView.setAdListener(new AdsListener(MainActivity.this, adView));
		adView.loadAd(adRequest);

		interstitial = new InterstitialAd(this);
		interstitial.setAdUnitId(getResources().getString(R.string.interId));
		interstitial.loadAd(adRequest);
		interstitial.setAdListener(new AdListener() {
			public void onAdLoaded() {
				interstitial.show();
			}
		});

		layoutRowContainer = (LinearLayout) findViewById(R.id.layout_row_container);

		mp = new MediaPlayer();

		for (int i = 0; i < 40;) {
			layoutRowContainer.addView(getView(i));
			i += 4;
		}
	}

	private View getView(int position) {
		View view = View.inflate(MainActivity.this, R.layout.listitem, null);

		RelativeLayout layout_1 = (RelativeLayout) view
				.findViewById(R.id.layout_1);
		ImageView img_1 = (ImageView) view.findViewById(R.id.img_1);
		TextView txt_Name_1 = (TextView) view.findViewById(R.id.txt_1);

		RelativeLayout layout_2 = (RelativeLayout) view
				.findViewById(R.id.layout_2);
		ImageView img_2 = (ImageView) view.findViewById(R.id.img_2);
		TextView txt_Name_2 = (TextView) view.findViewById(R.id.txt_2);

		RelativeLayout layout_3 = (RelativeLayout) view
				.findViewById(R.id.layout_3);
		ImageView img_3 = (ImageView) view.findViewById(R.id.img_3);
		TextView txt_Name_3 = (TextView) view.findViewById(R.id.txt_3);

		RelativeLayout layout_4 = (RelativeLayout) view
				.findViewById(R.id.layout_4);
		ImageView img_4 = (ImageView) view.findViewById(R.id.img_4);
		TextView txt_Name_4 = (TextView) view.findViewById(R.id.txt_4);

		layout_1.setContentDescription("" + position);
		txt_Name_1.setText(Constants.NAMES[position]);
		String path = "file:///android_asset/" + Constants.LIST_NAMES[position];
		Picasso.with(this).load(path).resize(240, 400).into(img_1);
		// img_1.setImageDrawable(getDrawable(Constants.LIST_NAMES[position]));
		position++;

		layout_2.setContentDescription("" + position);
		txt_Name_2.setText(Constants.NAMES[position]);
		path = "file:///android_asset/" + Constants.LIST_NAMES[position];
		Picasso.with(this).load(path).resize(240, 400).into(img_2);

		// img_2.setImageDrawable(getDrawable(Constants.LIST_NAMES[position]));
		position++;

		layout_3.setContentDescription("" + position);
		txt_Name_3.setText(Constants.NAMES[position]);
		path = "file:///android_asset/" + Constants.LIST_NAMES[position];
		Picasso.with(this).load(path).resize(240, 400).into(img_3);

		// img_3.setImageDrawable(getDrawable(Constants.LIST_NAMES[position]));
		position++;

		layout_4.setContentDescription("" + position);
		txt_Name_4.setText(Constants.NAMES[position]);
		path = "file:///android_asset/" + Constants.LIST_NAMES[position];
		Picasso.with(this).load(path).resize(240, 400).into(img_4);

		// img_4.setImageDrawable(getDrawable(Constants.LIST_NAMES[position]));

		layout_1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				int pos = Integer.parseInt(arg0.getContentDescription()
						.toString());
				adcounter++;
				if (adcounter % 5 == 0) {
					adcounter = 0;
					AdRequest adRequesti = new AdRequest.Builder().build();
					interstitial.setAdListener(new AdListener() {
						public void onAdLoaded() {
							interstitial.show();
						}
					});
				}
				showCustomDialogformessege(pos);
			}
		});
		layout_2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				int pos = Integer.parseInt(arg0.getContentDescription()
						.toString());
				adcounter++;
				if (adcounter % 5 == 0) {
					adcounter = 0;
					AdRequest adRequesti = new AdRequest.Builder().build();
					interstitial.setAdListener(new AdListener() {
						public void onAdLoaded() {
							interstitial.show();
						}
					});
				}
				showCustomDialogformessege(pos);
			}
		});

		layout_3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				int pos = Integer.parseInt(arg0.getContentDescription()
						.toString());
				adcounter++;
				if (adcounter % 5 == 0) {
					adcounter = 0;
					AdRequest adRequesti = new AdRequest.Builder().build();
					interstitial.setAdListener(new AdListener() {
						public void onAdLoaded() {
							interstitial.show();
						}
					});
				}
				showCustomDialogformessege(pos);
			}
		});
		layout_4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				int pos = Integer.parseInt(arg0.getContentDescription()
						.toString());
				adcounter++;
				if (adcounter % 5 == 0) {
					adcounter = 0;
					AdRequest adRequesti = new AdRequest.Builder().build();
					interstitial.setAdListener(new AdListener() {
						public void onAdLoaded() {
							interstitial.show();
						}
					});
				}
				showCustomDialogformessege(pos);
			}
		});

		return view;
	}

	private Drawable getDrawable(String image) {
		try {
			InputStream ims = getAssets().open(image);
			Drawable d = Drawable.createFromStream(ims, null);
			return d;
		} catch (IOException ex) {
			int i = 0;
			i++;
			return null;
		}
	}

	protected void showCustomDialogformessege(final int position) {
		// TODO Auto-generated method stub

		dialog = new Dialog(MainActivity.this, R.style.full_screen_dialog);
		dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
		dialog.setContentView(R.layout.dialogformessege);
		AdView adView = (AdView) dialog.findViewById(R.id.adView);
		// MobFoxExtras mobFox = new MobFoxExtras();

		AdRequest adRequest = new AdRequest.Builder().build();
		adView.setAdListener(new AdsListener(MainActivity.this, adView));
		adView.loadAd(adRequest);
		final ImageView image_view = (ImageView) dialog
				.findViewById(R.id.textdialogformsg);
		String path = "file:///android_asset/" + Constants.LIST_NAMES[position];
		Picasso.with(this).load(path).placeholder(R.drawable.splash)
				.into(image_view);
		// image_view
		// .setImageDrawable(getDrawable(Constants.LIST_NAMES[position]));
		// Picasso.with(this).load(image).into(image_view);
		// image_view.setBackgroundResource(image);

		final TextView bird_name = (TextView) dialog.findViewById(R.id.name);
		bird_name.setText(Constants.NAMES[position]);

		play = (ImageView) dialog.findViewById(R.id.savemsg);
		play.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				try {
					if (mp != null && mp.isPlaying()) {// If music is playing
														// already
						mp.stop();// Stop playing the music
						mp = null;
						play.setImageResource(R.drawable.play_bottom);
					} else {
						mp = new MediaPlayer();
						AssetFileDescriptor descriptor = getAssets().openFd(
								Constants.LIST_SOUNDS[position]);
						mp.setDataSource(descriptor.getFileDescriptor(),
								descriptor.getStartOffset(),
								descriptor.getLength());
						descriptor.close();

						mp.setOnCompletionListener(MainActivity.this);
						mp.setOnPreparedListener(new OnPreparedListener() {
							@Override
							public void onPrepared(MediaPlayer mediaplayer) {

								mp.start();
							}
						});
						mp.prepare();
						play.setImageResource(R.drawable.pause_bottom);
					}
				} catch (Exception e) {
					int i = 0;
					i++;
				}
			}
		});

		ImageView back = (ImageView) dialog.findViewById(R.id.back);
		back.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Log.e("Back", "clicked");
				if (mp != null && mp.isPlaying()) {// If music is playing
					// already
					mp.stop();// Stop playing the music
					mp = null;
					play.setImageResource(R.drawable.play_bottom);
				}
				dialog.dismiss();
			}
		});

		dialog.show();
	}

	@Override
	public void onCompletion(MediaPlayer mp) {
		// TODO Auto-generated method stub
		Log.e("Mp", "completed");
		play.setImageResource(R.drawable.play_bottom);
		mp = null;

	}

	Boolean temp = false;

	@Override
	public void onBackPressed() {
		if (temp)
			super.onBackPressed();
		if (dialog != null) {
			if (dialog.isShowing())
				dialog.dismiss();
			else
				finish();

		} else
			finish();
	}

}
