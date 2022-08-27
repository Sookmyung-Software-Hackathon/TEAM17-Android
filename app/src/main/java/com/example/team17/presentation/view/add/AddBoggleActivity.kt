package com.example.team17.presentation.view.add

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContentProviderCompat.requireContext
import com.example.team17.R
import com.example.team17.databinding.ActivityAddBoggleBinding
import com.example.team17.presentation.base.BaseActivity
import java.text.SimpleDateFormat
import java.util.*

class AddBoggleActivity : BaseActivity<ActivityAddBoggleBinding>(R.layout.activity_add_boggle) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.tvTime.setOnClickListener {
            getTime(this)
        }

        binding.tvDate.setOnClickListener {
            showDatePicker()
        }

        binding.btnNext.setOnClickListener {
            //TODO: POST 서버 연결
            finish()
        }
    }

    private fun showDatePicker() {
        val datepickercalendar = Calendar.getInstance()
        val year = datepickercalendar.get(Calendar.YEAR)
        val month = datepickercalendar.get(Calendar.MONTH)
        val day = datepickercalendar.get(Calendar.DAY_OF_MONTH)

        val dpd = DatePickerDialog(
            this,
            R.style.MySpinnerDatePickerStyle,
            { _, year, monthOfYear, dayOfMonth ->
                val month = monthOfYear + 1
                val calendar = Calendar.getInstance()
                calendar.set(year, monthOfYear, dayOfMonth)
                binding.tvDate.text = "$year.$month.$dayOfMonth"
            },
            year,
            month,
            day
        )
        dpd.datePicker.minDate = System.currentTimeMillis() - 1000;
        dpd.show()
    }

    fun getTime(context: Context){

        val cal = Calendar.getInstance()

        val timeSetListener = TimePickerDialog.OnTimeSetListener { timePicker, hour, minute ->
            cal.set(Calendar.HOUR_OF_DAY, hour)
            cal.set(Calendar.MINUTE, minute)

            binding.tvTime.text = SimpleDateFormat("HH:mm").format(cal.time)
        }

        TimePickerDialog(context, timeSetListener, cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), true).show()

    }
}