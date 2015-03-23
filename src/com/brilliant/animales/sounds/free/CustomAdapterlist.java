package com.brilliant.animales.sounds.free;

import java.util.ArrayList;
import java.util.Calendar;

import com.squareup.picasso.Picasso;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapterlist extends ArrayAdapter<RowItem> {
	private ArrayList<RowItem> entries;
	private Activity activity;
	Context ctx;

	public CustomAdapterlist(Activity a, int textViewResourceId,
			ArrayList<RowItem> invertedfetch) {
		super(a, textViewResourceId, invertedfetch);
		this.entries = invertedfetch;
		this.activity = a;
		ctx = a.getApplicationContext();
	}

	public static class ViewHolder {
		public TextView item1;
		public ImageView item2;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View v = convertView;
		ViewHolder holder;
		if (v == null) {
			LayoutInflater vi = (LayoutInflater) activity
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			v = vi.inflate(R.layout.list_item, null);
			holder = new ViewHolder();
			holder.item1 = (TextView) v.findViewById(R.id.txt_heading);
			holder.item2 = (ImageView) v.findViewById(R.id.image);
			v.setTag(holder);
		} else
			holder = (ViewHolder) v.getTag();

		final RowItem custom = entries.get(position);
		if (custom != null) {
			holder.item1.setText(custom.getTitle());
			// holder.item2.setBackgroundResource(custom.getImageId());

			int dra = custom.getImageId();
			Bitmap bm = downscaleBitmapUsingDensities(2, dra);
			
			Picasso.with(getContext()).load(custom.getImageId()).into(holder.item2);
//			holder.item2.setImageBitmap(bm);

		}
		return v;
	}

	private Bitmap downscaleBitmapUsingDensities(final int sampleSize,
			final int imageResId) {
		final Options bitmapOptions = new Options();
		bitmapOptions.inDensity = sampleSize;
		bitmapOptions.inTargetDensity = 1;
		final Bitmap scaledBitmap = BitmapFactory.decodeResource(
				ctx.getResources(), imageResId, bitmapOptions);
		scaledBitmap.setDensity(Bitmap.DENSITY_NONE);
		return scaledBitmap;
	}
}
