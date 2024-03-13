package ua.edu.lntu.vahrameievbvwork

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_cooking_day.view.*

class CookingDayAdapter(private val cookingDays: List<CookingDay>) :
    RecyclerView.Adapter<CookingDayAdapter.CookingDayViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CookingDayViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_cooking_day, parent, false)
        return CookingDayViewHolder(view)
    }

    override fun onBindViewHolder(holder: CookingDayViewHolder, position: Int) {
        val cookingDay = cookingDays[position]
        holder.bind(cookingDay)
    }

    override fun getItemCount(): Int {
        return cookingDays.size
    }

    inner class CookingDayViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(cookingDay: CookingDay) {
            itemView.dayNumberTextView.text = "Day ${cookingDay.dayNumber}"
            itemView.titleTextView.text = cookingDay.title
            itemView.pictureImageView.setImageResource(cookingDay.pictureResId)
            itemView.descriptionTextView.text = cookingDay.description
        }
    }
}
