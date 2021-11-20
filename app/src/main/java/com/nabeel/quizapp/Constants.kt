package com.nabeel.quizapp

object Constants {

    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTIONS:String="total_questions"
    const val CORRECT_ANSWERS:String="correct_answers"

    fun getQuestions(): ArrayList<Question> {

        val questionsList = ArrayList<Question>()
        val que1 = Question(
            1, "Do you exercise at least 2 times a week for 20 or more minutes?",
            R.drawable.one, "I never exercise",
            "Yes",
            "No",
            "Sometimes",
            2
        )
        questionsList.add(que1)

        val que2 = Question(
            2, "Which food groups do you consume the most?",
            R.drawable.two, "Meat, Fish and meat alternatives",
            "Milk and Dairy",
            "Fruit and vegetables",
            "Fat",
            3
        )
        questionsList.add(que2)

        val que3 = Question(
            3, "Do you get 7 hours of sleep most nights?",
            R.drawable.three, "Yes",
            "No",
            "Sometimes",
            "I barely sleep",
            1
        )
        questionsList.add(que3)

        val que4 = Question(
            4, "How many glasses of water do you drink in a day?",
            R.drawable.four, "10-12",
            "8-10",
            "4-6",
            "6-8",
            4
        )
        questionsList.add(que4)

        val que5 = Question(
            5, "Do you eat real butter, cow ghee, olive oil, mustard oil or coconut oil?",
            R.drawable.five, "Yes",
            "No",
            "Sometimes",
            "Never",
            1
        )
        questionsList.add(que5)

        val que6 = Question(
            6, "If you eat junk food what do you do?",
            R.drawable.six, "Eat more",
            "Nothing",
            "Sleep",
            "Exercise",
            4
        )
        questionsList.add(que6)

        val que7 = Question(
            7, "According to you, Is this healthy food?",
            R.drawable.seven, "No",
            "Yes",
            "Maybe",
            "I don't know",
            2
        )
        questionsList.add(que7)

        val que8 = Question(
            8, "Do you generally eat when you’re hungry and stop when you feel full?",
            R.drawable.eight, "Yes",
            "No",
            "Sometimes",
            "Never",
            1
        )
        questionsList.add(que8)

        val que9 = Question(
            9, "You decide to eat a hamburger, fries and tomato. Is that healthy?",
            R.drawable.nine, "I don't know",
            "Yes",
            "No",
            "Maybe",
            3
        )
        questionsList.add(que9)

        val que10 = Question(
            10, "Can you run for thirty seconds without feeling like passing out?",
            R.drawable.lastimage, "Sometimes",
            "Never",
            "Yes",
            "No",
            3
        )
        questionsList.add(que10)

        return questionsList
    }

}