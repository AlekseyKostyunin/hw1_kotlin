package org.example

class Run {
    companion object{
        fun start(){
            println("Список команд для ввода:\n" +
                    "1. exit\n" +
                    "2. help\n" +
                    "3. add <Имя> phone <Номер телефона>\n" +
                    "4. add <Имя> email <Адрес электронной почты>\n ")
            val command = Command()
            while (true) {
                print("Введите команду: ")
                val commanda = readlnOrNull() ?: continue
                if (commanda == "exit") break
                command.process(commanda)
            }
        }
    }
}