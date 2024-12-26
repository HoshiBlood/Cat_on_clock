package com.example.cat_on_clock

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.applandeo.materialcalendarview.CalendarDay
import com.applandeo.materialcalendarview.CalendarView
import com.applandeo.materialcalendarview.EventDay
import com.applandeo.materialcalendarview.listeners.OnCalendarDayClickListener
import com.applandeo.materialcalendarview.listeners.OnCalendarPageChangeListener
import java.util.*
import android.view.WindowManager
import android.view.Gravity
import android.graphics.drawable.ColorDrawable
import android.graphics.Color
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import androidx.constraintlayout.widget.ConstraintLayout


class Calendar : AppCompatActivity() {
    private lateinit var calendarView: com.applandeo.materialcalendarview.CalendarView
    private val events: MutableList<EventDay> = mutableListOf()


    private lateinit var drawerLayout: DrawerLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)
        calendarView = findViewById(R.id.calendar)
        calendarView.setEvents(events)


        calendarView.setOnCalendarDayClickListener(object : OnCalendarDayClickListener {
            override fun onClick(calendarDay: CalendarDay) {
                showAddEventDialog(calendarDay) // Вызов диалога для добавления события
            }
        })

        // ... (Остальной код остался без изменений) ...


    }

    private fun showAddEventDialog(calendarDay: CalendarDay) {
        val builder = AlertDialog.Builder(this)
        val inflater = layoutInflater
        val dialogView = inflater.inflate(R.layout.activity_new_event, null) // Создайте layout add_event_dialog.xml
        val eventTitleEditText = dialogView.findViewById<EditText>(R.id.editTextText)

        builder.setView(dialogView)
            .setPositiveButton("Добавить") { _, _ ->
                val eventTitle = eventTitleEditText.text.toString()
                if (eventTitle.isNotEmpty()) {
                    val eventDay = EventDay(calendarDay.calendar, R.drawable.paw) // Замените на вашу иконку

                    events.add(eventDay)
                    calendarView.setEvents(events)
                    Toast.makeText(this, "Событие добавлено!", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Введите название события!", Toast.LENGTH_SHORT).show()
                }
            }
            .setNegativeButton("Отмена", null)
            .show()
    }
    fun  textView17(view: View) {
        val intent = Intent(this, OnDevelopmentActivity::class.java)
        startActivity(intent)
    }
    fun  textView7(view: View) {
        val intent = Intent(this, MyEventActivity::class.java)
        startActivity(intent)
    }
    fun  textView8(view: View) {
        val intent = Intent(this, OnDevelopmentActivity::class.java)
        startActivity(intent)
    }
    fun  textView18(view: View) {
        val intent = Intent(this, OnDevelopmentActivity::class.java)
        startActivity(intent)
    }

}
