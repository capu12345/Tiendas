package ruelas.luis.tiendas
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StoreAdapter(private val storeList: List<String>) :
    RecyclerView.Adapter<StoreAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val storeName: TextView = itemView.findViewById(R.id.storeName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.store_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val store = storeList[position]
        holder.storeName.text = store
    }

    override fun getItemCount(): Int {
        return storeList.size
    }
}