package com.nabeel.quizapp

object Constants2 {

    /*const val USER_NAME:String="user_name"*/
    const val TOTAL_QUESTIONS:String="total_questions"
    const val CORRECT_ANSWERS:String="correct_answers"

    fun getQuestions(): ArrayList<Question> {

        val questionsList = ArrayList<Question>()
        val que1 = Question(
            1, "_____are examples of high energy high nutrient food",
            R.drawable.ek, "Milk & Cheese",
            "Fruits & vegetables",
            "Chocolate & Ice cream",
            "Pancake & Maple syrup",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            2, "Which nutrient provides the most amount of energy per gram?",
            R.drawable.twoo, "Carbohydrate",
            "Protein",
            "Fats",
            "Vitamin",
            3
        )
        questionsList.add(que2)

        val que3 = Question(
            3, "_____increases the risk of diet related diseases.",
            R.drawable.teen, "High Blood Pressure",
            "Coronary Heart Disease",
            "Diabetes",
            "Obesity",
            4
        )
        questionsList.add(que3)

        val que4 = Question(
            4, "Chicken, fish and meat contain which nutrient?",
            R.drawable.chaar, "Carbohydrate",
            "Fats",
            "Protein",
            "Minerals",
            3
        )
        questionsList.add(que4)

        val que5 = Question(
            5, "Which performers  can benefit from a protein-rich diet?",
            R.drawable.paanch, "Tennis players, golfers",
            "Weight lifters, Sprinters",
            "Swimmers, footballers",
            "3000m runner, long distance runner",
            2
        )
        questionsList.add(que5)

        val que6 = Question(
            6, "Deficiency of_____causes Night blindness.",
            R.drawable.che, "Vitamin B1",
            "Vitamin D",
            "Iron",
            "Vitamin A",
            4
        )
        questionsList.add(que6)

        val que7 = Question(
            7, "Which is not essential in a balanced diet normally?",
            R.drawable.saat, "Fruits and vegetables",
            "Tea",
            "Salads",
            "Pulses",
            2
        )
        questionsList.add(que7)

        val que8 = Question(
            8, "Which of the following factors determine the energy requirement of humans?",
            R.drawable.aath, "Occupation/ Daily activities",
            "Age",
            "Gender",
            "All of the above",
            4
        )
        questionsList.add(que8)

        val que9 = Question(
            9, "Which component of a healthy, balanced diet helps with constipation? ",
            R.drawable.nau, "Fats",
            "Minerals",
            "Fiber",
            "Proteins",
            3
        )
        questionsList.add(que9)

        val que10 = Question(
            10, "If you suffer from Anaemia you should eat foods rich in",
            R.drawable.das, "Vitamin A and C",
            "Calcium and Phosphorus",
            "Iron and Vitamin B12",
            "Protein",
            3
        )
        questionsList.add(que10)

        return questionsList
    }

}