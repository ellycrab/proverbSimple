package com.ellycrab.newmini01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ellycrab.newmini01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy{ ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val sentenceList = mutableListOf<String>()
        sentenceList.add("Actions speak louder than words.");
        sentenceList.add("The early bird catches the worm.");
        sentenceList.add("Every cloud has a silver lining.");
        sentenceList.add("A journey of a thousand miles begins with a single step.");
        sentenceList.add("Don't put all your eggs in one basket.");
        sentenceList.add("Where there is a will, there is a way.");
        sentenceList.add("Don't count your chickens before they hatch.");
        sentenceList.add("If the shoe fits, wear it.");
        sentenceList.add("You reap what you sow.");
        sentenceList.add("When in Rome, do as the Romans do.");
        sentenceList.add("The grass is always greener on the other side.");
        sentenceList.add("Don't cry over spilled milk.");
        sentenceList.add("Two wrongs don't make a right.");
        sentenceList.add("When the going gets tough, the tough get going.");
        sentenceList.add("A picture is worth a thousand words.");
        sentenceList.add("Better late than never.");
        sentenceList.add("The pen is mightier than the sword.");
        sentenceList.add("All good things must come to an end.");
        sentenceList.add("Honesty is the best policy.");
        sentenceList.add("Actions speak louder than words.");
        sentenceList.add("You can't have your cake and eat it too.");
        sentenceList.add("Birds of a feather flock together.");
        sentenceList.add("Practice makes perfect.");
        sentenceList.add("Don't judge a book by its cover.");
        sentenceList.add("Two heads are better than one.");
        sentenceList.add("Rome wasn't built in a day.");
        sentenceList.add("The squeaky wheel gets the grease.");
        sentenceList.add("A rolling stone gathers no moss.");
        sentenceList.add("All that glitters is not gold.");
        sentenceList.add("Don't put off until tomorrow what you can do today.");
        sentenceList.add("A watched pot never boils.");
        sentenceList.add("You can't make an omelet without breaking eggs.");
        sentenceList.add("People who live in glass houses shouldn't throw stones.");
        sentenceList.add("There's no smoke without fire.");
        sentenceList.add("Actions speak louder than words.");
        sentenceList.add("The early bird catches the worm.");
        sentenceList.add("Every cloud has a silver lining.");
        sentenceList.add("A journey of a thousand miles begins with a single step.");
        sentenceList.add("Don't put all your eggs in one basket.");
        sentenceList.add("Where there is a will, there is a way.");
        sentenceList.add("Don't count your chickens before they hatch.");
        sentenceList.add("If the shoe fits, wear it.");
        sentenceList.add("You reap what you sow.");
        sentenceList.add("When in Rome, do as the Romans do.");
        sentenceList.add("The grass is always greener on the other side.");
        sentenceList.add("Don't cry over spilled milk.");

        binding.button.setOnClickListener{
            val intent = Intent(this,SentenceActivity::class.java)
            startActivity(intent)
        }

        binding.goodwordArea.setText(sentenceList.random())
    }
}