package com.conamobile.foodapp.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.conamobile.foodapp.R
import com.conamobile.foodapp.databinding.FoodItemBinding
import com.conamobile.foodapp.model.FoodModel
import com.conamobile.foodapp.utils.objects.Transfer

class HomeAdapter : RecyclerView.Adapter<HomeAdapter.Vh>() {
    private val dif = AsyncListDiffer(this, ITEM_DIFF)
    var itemClick: (() -> Unit)? = null
    lateinit var viewHolder: RecyclerView.ViewHolder

    inner class Vh(var binding: FoodItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            val details = dif.currentList[adapterPosition]
            binding.apply {
                Glide.with(binding.root).load(details.foodImage).into(foodImage)
                foodName.text = details.foodName
                foodDescription.text = details.foodDescription
                bottom.setOnClickListener {
                    Transfer.apply {
                        foodImage = details.foodImage
                        foodName = details.foodName
                        foodDescription = details.foodDescription
                    }
                    itemClick!!.invoke()
                }
            }
            //animation
            val animation: Animation = AnimationUtils.loadAnimation(binding.root.context,
                if (position > 3) R.anim.recycler_up_from_bottom
                else R.anim.recycler_down_from_top)
            itemView.startAnimation(animation)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(
            FoodItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        viewHolder = holder
        return holder.bind()
    }

    override fun getItemCount(): Int = dif.currentList.size


    fun submitList(list: List<FoodModel>) {
        dif.submitList(list)
    }

    companion object {
        private val ITEM_DIFF = object : DiffUtil.ItemCallback<FoodModel>() {
            override fun areItemsTheSame(
                oldItem: FoodModel,
                newItem: FoodModel,
            ): Boolean = false

            override fun areContentsTheSame(
                oldItem: FoodModel,
                newItem: FoodModel,
            ): Boolean {
                return true
            }


        }
    }
}
