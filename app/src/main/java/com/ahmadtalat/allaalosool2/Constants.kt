package com.ahmadtalat.allaalosool2

object Constants {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestion(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        val questionOne = Question(1,
            "يعد التزام مصرف أبو ظبي الإسلامي - مصر بأحكام الشريعة التزاما ....",
            "قانونياً",
            "شرعياً",
            "رقابياً",
            "كل ما سبق",
            4
        )
        questionsList.add(questionOne)
        val questionTwo = Question(2,
            "تتميز المرابحة في مصرف أبو ظبي الإسلامي مصر عن القرض التقليدي من حيث .....",
            "أن المرابحة عقد بيع ويجوز فيه التربح.",
            "أن العائد ثابت لا يتغير، حيث يتمكن العميل أن يخطط التزاماته المالية بيسر.",
            "يتيح المصرف للعميل الحصول على جائزة سداد مبكر عند رغبته في تسديد التزاماته",
            "جميع ما ذكر.",
            4
        )
        val questionThree = Question(3,
            "وظيفة النقود في الشريعة الإسلامية هي ......",
            "وحدة لقياس الأثمان ومخزن للقيمة.",
            "وسيط للتبادل.",
            "(أ)، (ب) معاً.",
            "سلعة يتم الإتجار بها.",
            3
        )
        val questionFour = Question(4,
            "في حسابات الاستثمار على أساس المضاربة يكون:",
            "المصرف هو رب المال والمودع هو المضارب.",
            "المودع هو رب المال والمصرف هو المضارب.",
            "المصرف هو الوكيل والمودع هو الموكل بالاستثمار.",
            "المصرف هو الموكل بالاستثمار والمودع هو وكيل الاستثمار.",
            2
        )
        val questionFive = Question(5,
            "يلتزم البائع بإخبار المشتري عن أصل تكلفة الشراء والربح معاً في بيع المرابحة لأنه:",
            "بيع أمانة.",
            "بيع مساومة.",
            "بيع مزايدة.",
            "قرض معلوم الربح.",
            1
        )
        val questionSix = Question(6,
            "أقساط التي يدفعها العميل للمصرف في مرابحة السلع والمعادن: \"منتج اليسر\" هي مقابل:",
            "للأموال التي أعطاها المصرف للعميل.",
            "ثمن السلعة التي باعها المصرف للعميل بيعاً آجلاً.",
            "ثمن السلعة التي باعها المصرف للعميل بيعاً حالاً.",
            "ثمن السلعة التي باعها العميل للطرف الثالث.",
            2
        )
        val questionSeven = Question(7,
            "البنوك الإسلامية تعتمد على",
            "صيغة المرابحة فقط",
            "الإجارة فقط",
            "المضاربة فقط",
            "كل ما سبق وغيرها من الصيغ المقبولة شرعاً",
            4
        )
        val questionEight = Question(8,
            "من مميزات بطاقة الكاش باك:",
            "(\u200Cأ)\tأنها قائمة على أساس المرابحة الإسلامية.",
            "(\u200Cب)\tلا بد وأن يتوفر لها غطاء نقدي.",
            "(\u200Cج)\tيكون السحب منها على المكشوف.",
            "(\u200Cد)\t(أ)، (ب) معاً.",
            4
        )
        val questionNine = Question(9,
            "عندما يسدد العميل جزء من ثمن السيارة مباشرة للمعرض (دفعة مقدمة) ويطلب مرابحته على هذه السيارة ...فإن ما يتعاقد عليه البنك هو: ",
            "(\u200Cأ)\tكامل السيارة.",
            "(\u200Cب)\tالحصة الباقية (نسبة شائعة تساوي ما تبقى من إجمالي قيمة السيارة).",
            "(\u200Cج)\tحصة من السيارة تساوي مبلغ الدفعة المقدمة.",
            "(\u200Cد)\tيشتري البنك من العميل حصة من السيارة تساوي مبلغ الدفعة المقدمة ويعيد بيع السيارة بالكامل مرابحة.",
            2
        )
        val questionTen = Question(10,
            "الصيغة الشرعية لمنتج الصكوك بمصرف أبو ظبي الإسلامي – مصر:",
            "(\u200Cأ)\tالمضاربة المطلقة نظير نسبة مئوية من الأرياح.",
            "(\u200Cب)\tالمضاربة المقيدة نظير نسبة مئوية من الأرباح.",
            "(\u200Cج)\tالوكالة بالاستثمار نظير أجرة محددة.",
            "(\u200Cد)\tالقرض الحسن.",
            3
        )
        questionsList.add(questionTwo)
        questionsList.add(questionThree)
        questionsList.add(questionFour)
        questionsList.add(questionFive)
        questionsList.add(questionSix)
        questionsList.add(questionSeven)
        questionsList.add(questionEight)
        questionsList.add(questionNine)
        questionsList.add(questionTen)
        return questionsList
    }
}