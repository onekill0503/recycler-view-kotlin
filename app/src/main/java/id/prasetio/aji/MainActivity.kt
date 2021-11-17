package id.prasetio.aji

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import id.prasetio.affirmations.adapter.ItemAdapter
import id.prasetio.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialiasi Data
        val myDataset = Datasource().loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        // Mengimplementasikannya ke view
        recyclerView.setHasFixedSize(true)
    }
}