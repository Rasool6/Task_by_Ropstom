package com.photo.task_by_ropstam.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.photo.task_by_ropstam.MainActivity
import com.photo.task_by_ropstam.databinding.ActivityCartBinding

class CartActivity : AppCompatActivity() {
    lateinit var bindingCart:ActivityCartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingCart=ActivityCartBinding.inflate(layoutInflater)
        setContentView(bindingCart.root)
        bindingCart.tenureTestId.isSelected=true



        bindingCart.constraintLayout3.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}