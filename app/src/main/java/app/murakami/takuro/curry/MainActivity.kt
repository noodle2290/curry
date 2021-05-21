package app.murakami.takuro.curry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val people = arrayOf("くま","ひつじ","ねこ","ねずみ")
    val food = arrayOf("かれー","みそしる","ちゃーはん","えびちり","はんばーぐ","からあげ","おこのみやき","クリームシチュー")
    val yosoe = arrayOf("よそえました^^","よそえませんでした")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun  saveFood(view:View?){

        val randomName = Random
        val index = randomName.nextInt(4)
        val name = people[index]
        nameTextView.text = name + "に"

        foodTextView.text = food[Random.nextInt(8)]  + "を"

        verbTextView.text = yosoe[Random.nextInt(2)]

        if (verbTextView.text == food[0]){
            verbTextView.setTextSize(14f)
        }
        else{
            verbTextView.setTextSize(20f)
        }


    }
}