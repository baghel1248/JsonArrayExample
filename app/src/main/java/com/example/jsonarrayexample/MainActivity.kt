package com.example.jsonarrayexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.json.JSONArray
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textview2:TextView=findViewById(R.id.textview1)
        var data="{\"student\":[{\"name\":\"robin\",\"id\":\"101\"},{\"name\":\"durgesh\",\"id\":\"102\"},{\"name\":\"karan\",\"id\":\"103\"}]}"
        var jsonObject1=JSONObject(data)
        var jsonarray1:JSONArray=jsonObject1.getJSONArray("student")
        var string:String=""
        for(i in 0..jsonarray1.length()-1){
            jsonObject1=jsonarray1.getJSONObject(i)
            var name1=jsonObject1.getString("name")
            var id1=jsonObject1.getString("id")
            string+="$name1 \n $id1 \n"

        }
        textview2.text="$string"

    }
}