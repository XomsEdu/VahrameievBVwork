package ua.edu.lntu.vahrameievbvwork

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ua.edu.lntu.vahrameievbvwork.ui.theme.VahrameievBVworkTheme
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val cookingDays = mutableListOf<CookingDay>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Adding sample cooking days, you can replace it with your data
        cookingDays.add(CookingDay(1, "Day 1: Breakfast", R.drawable.day1, "Description for Day 1"))
        cookingDays.add(CookingDay(2, "Day 2: Lunch", R.drawable.day2, "Description for Day 2"))
        // Add more days as needed

        val adapter = CookingDayAdapter(cookingDays)
        cardsRecyclerView.layoutManager = LinearLayoutManager(this)
        cardsRecyclerView.adapter = adapter
    }
}


data class CookingDay(
    val dayNumber: Int,
    val title: String,
    val pictureResId: Int,
    val description: String
)


