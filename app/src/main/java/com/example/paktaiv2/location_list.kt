package com.example.paktaiv2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.appcompat.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class LocationListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_location_list)

        val recyclerView: RecyclerView = findViewById(R.id.location_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = LocationAdapter(getLocations())
    }

    private fun getLocations(): List<String> {
        // Replace with your actual list of locations
        return listOf(
            "ระนอง", "กระบี่", "สุราษฎร์ธานี", "พังงา", "สตูล",
            "ชุมพร", "ตรัง", "นครศรีธรรมราช", "ปัตตานี", "พัทลุง",
            "ภูเก็ต", "ยะลา", "สงขลา", "นราธิวาส"
        )
    }

    class LocationAdapter(private val locations: List<String>) : RecyclerView.Adapter<LocationAdapter.LocationViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LocationViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_location, parent, false)
            return LocationViewHolder(view)
        }

        override fun onBindViewHolder(holder: LocationViewHolder, position: Int) {
            val location = locations[position]
            holder.locationName.text = location

            holder.confirmButton.setOnClickListener {
                // Handle confirm action
                // You can implement your own confirmation logic here
            }
        }

        override fun getItemCount() = locations.size

        class LocationViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val locationName: TextView = itemView.findViewById(R.id.location_name)
            val confirmButton: Button = itemView.findViewById(R.id.confirm_button)
        }
    }
}
