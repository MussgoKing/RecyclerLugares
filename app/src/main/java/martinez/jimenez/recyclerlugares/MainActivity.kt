package martinez.jimenez.recyclerlugares

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var lugares:ArrayList<Lugar>? = null
    var adapter:LugarAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerLugar.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        lugares = ArrayList<Lugar>()
        adapter = LugarAdapter(lugares!!, this)
        recyclerLugar.adapter = adapter
    }
}