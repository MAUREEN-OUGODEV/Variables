fun main(args: Array<String>) {
    println("Hello World!")

        var nameOfStudent= arrayOf("Silvia Akinyi","Maureen Ougo","Jackie Owino ")
        var ageOfStudent = arrayOf(15,17,22)
        var phoneNumber= arrayOf(254743515249,2547665244,2546354242)
        var weightOfStudent= arrayOf(56,72,83)
        val citizenship = true
        var studentList = arrayOf("student Details",nameOfStudent[0],ageOfStudent[0],phoneNumber[0],weightOfStudent[0],!citizenship)
        var studentDetails = arrayOf("student Details",nameOfStudent[1],ageOfStudent[1],phoneNumber[1],weightOfStudent[1],citizenship)

        println(studentList.contentToString())
        println(studentDetails.contentToString())
    }




