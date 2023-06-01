package dev.mitingi.contactlist2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import dev.mitingi.contactlist2.databinding.ContactlistBinding

class ContactRvAdaptor(var contactlists:List<ContactData>):RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding=ContactlistBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var contact=contactlists[position]
        holder.binding.ivavator.toString()
        holder.binding.tvemail.text=contact.email
        holder.binding.tvname.text=contact.name
        holder.binding.tvnumber.text=contact.number
    }

    override fun getItemCount(): Int {
        return contactlists.size
    }
}
class ContactViewHolder(var binding:ContactlistBinding):ViewHolder(binding.root){

}
