package cs499.project.macbook.homekitchen;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

public class MyAdapter extends ArrayAdapter<String> {

    int[] pic;
    int[] recipe;
    Context mContext;

    public MyAdapter(Context context, int[] foodPic, int[] foodRecipe) {
        super(context, R.layout.listview_item);
        this.pic = foodPic;
        this.recipe = foodRecipe;
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return pic.length;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder mViewHolder = new ViewHolder();
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) mContext.
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.listview_item, parent, false);
            mViewHolder.mPic = (ImageView) convertView.findViewById(R.id.imageView);
            mViewHolder.mRecipe = (ImageView) convertView.findViewById(R.id.imageView);
            convertView.setTag(mViewHolder);
        } else {
            mViewHolder = (ViewHolder) convertView.getTag();
        }
        mViewHolder.mPic.setImageResource(pic[position]);
        mViewHolder.mRecipe.setImageResource(recipe[position]);

        return convertView;
    }

    static class ViewHolder {
        ImageView mPic;
        ImageView mRecipe;
    }
}
