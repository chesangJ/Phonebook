package dev.mitingi.contactlist2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.squareup.picasso.Picasso
import dev.mitingi.contactlist2.databinding.ContactlistBinding
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class ContactRvAdaptor(var contactlists:List<ContactData>):RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding=ContactlistBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var contact=contactlists[position]
        var binding=holder.binding

        binding.ivavator.toString()
        binding.tvemail.text=contact.email
        binding.tvname.text=contact.name
        binding.tvnumber.text=contact.number
        Picasso.get()
            .load(contact.avatar)
            .resize(80,80)
            .centerCrop()
            .transform(CropCircleTransformation())
            .into(binding.ivavator)
    }

    override fun getItemCount(): Int {
        return contactlists.size
    }
}
class ContactViewHolder(var binding:ContactlistBinding):ViewHolder(binding.root){

}
