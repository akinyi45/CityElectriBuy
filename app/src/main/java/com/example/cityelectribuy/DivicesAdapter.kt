package com.example.cityelectribuy


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class DivicesAdapter(var context: Context, var data:ArrayList<Divice>):BaseAdapter() {
    private class ViewHolder(row:View?){
        var mTxtModel:TextView
        var mTxtColor:TextView
        var mTxtRegNo:TextView
        var mTxtPrice:TextView
        var mImage:ImageView
        init {
            this.mTxtModel = row?.findViewById(R.id.mTvModel) as TextView
            this.mTxtColor = row?.findViewById(R.id.mTvColor) as TextView
            this.mTxtRegNo = row?.findViewById(R.id.mTvRegNo) as TextView
            this.mTxtPrice = row?.findViewById(R.id.mTvPrice) as TextView
            this.mImage = row?.findViewById(R.id.mImgPic) as ImageView
        }
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view:View?
        var viewHolder:ViewHolder
        if (convertView == null){
            var layout = LayoutInflater.from(context)
            view = layout.inflate(R.layout.item_layout,parent,false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        var item:Divice = getItem(position) as Divice
        viewHolder.mTxtModel.text = item.model
        viewHolder.mTxtColor.text = item.color
        viewHolder.mTxtRegNo.text = item.regNo
        viewHolder.mTxtPrice.text = item.price
        Glide.with(context).load(item.image).into(viewHolder.mImage)
        return view as View
    }

    override fun getItem(position: Int): Any {
        return  data.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return data.count()
    }
}