package org.example

import java.util.regex.Pattern

class Validator {

    companion object{

        private val namePattern = Pattern.compile("^[A-Za-zа-яА-Я]+$")
        private val phonePattern = Pattern.compile("^\\+\\d+$")
        private val emailPattern = Pattern.compile("^[a-zA-Z]+@[a-zA-Z]+\\.[a-zA-Z]+$")

        fun isValidName(name: String): Boolean{
            return namePattern.matcher(name).matches()
        }

        fun isValidPhone(phone: String): Boolean{
            return phonePattern.matcher(phone).matches()
        }

        fun isValidEmail(email: String): Boolean{
            return emailPattern.matcher(email).matches()
        }
    }

}