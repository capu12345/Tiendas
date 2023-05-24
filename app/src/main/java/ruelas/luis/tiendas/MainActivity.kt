package ruelas.luis.tiendas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = StoreAdapter(getDummyStoreList())
    }

    private fun getDummyStoreList(): List<String> {
        val storeList = mutableListOf<String>()
        for (i in 1..100) {
            storeList.add("Tienda $i")
        }
        return storeList
    }
}