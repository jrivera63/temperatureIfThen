fun main() {
    var temperatureInput = 0.0F
    print("Enter your temperature(between 92.0 and 104.0): ")

    temperatureInput = readLine()!!.toFloat()


    if (temperatureInput < 104.0f && temperatureInput > 92.0f)
        if (temperatureInput < 97.5)
            println("Your temperature is low")
        else if (temperatureInput > 99.5)
            println("Your temperature is high")
        else
            println("Your temperature is normal")
    else
        main()
        return
}