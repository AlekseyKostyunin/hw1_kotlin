package org.example

class Command {

    fun process(command: String) {
        val parts = command.split(" ")
        when {
            parts.size == 1 && parts[0] == "help" -> printHelp()
            parts.size == 4 && parts[0] == "add" && parts[2] == "phone" -> processPhone(parts[1], parts[3])
            parts.size == 4 && parts[0] == "add" && parts[2] == "email" -> processEmail(parts[1], parts[3])
            else -> println("Неизвестная команда")
        }
    }

    private fun printHelp() {
        println("Доступные команды:")
        println("exit - завершить работу программы")
        println("help - вывести список доступных команд")
        println("add <Имя> phone <Номер телефона> - добавить пользователя и его телефон")
        println("add <Имя> email <Адрес электронной почты> - добавить пользователя и его email")
    }

    private fun processPhone(name: String, phone: String) {
        if (Validator.isValidName(name) && Validator.isValidPhone(phone)) {
            println("Добавлен контакт: $name, телефон: $phone")
        } else {
            println("Ошибка: неверный формат номера телефона")
        }
    }

    private fun processEmail(name: String, email: String) {
        if (Validator.isValidEmail(email)) {
            println("Добавлен контакт: $name, email: $email")
        } else {
            println("Ошибка: неверный формат адреса электронной почты")
        }
    }
}