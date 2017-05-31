package cs499.project.macbook.homekitchen;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends ArrayAdapter<String> {

    String[] names;
    int[] pic;
    int [] recipe;
    Context mContext;

    public MyAdapter(Context context, String[] foodName, int[] foodPic, int [] foodRecipe) {
        super(context, R.layout.listview_item);
        this.names = foodName;
        this.pic = foodPic;
        this.recipe = foodRecipe;
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder mViewHolder = new ViewHolder();
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) mContext.
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.listview_item, parent, false);
            mViewHolder.mNames = (TextView) convertView.findViewById(R.id.textView);
            mViewHolder.mPic = (ImageView) convertView.findViewById(R.id.imageView);
            mViewHolder.mRecipe = (ImageView) convertView.findViewById(R.id.imageView1);
            convertView.setTag(mViewHolder);
        } else {
            mViewHolder = (ViewHolder) convertView.getTag();
        }

        mViewHolder.mNames.setText(names[position]);
        mViewHolder.mPic.setImageResource(pic[position]);
        mViewHolder.mRecipe.setImageResource(recipe[position]);

        return convertView;
    }

    static class ViewHolder {
        TextView mNames;
        ImageView mPic;
        ImageView mRecipe;
    }
}
